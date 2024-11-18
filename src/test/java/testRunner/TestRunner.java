package testRunner;
 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//Features/UpcomingHondaBikes.feature", ".//Features/UsedCars.feature", ".//Features/ZigWheelsLogin.feature"},
					glue="stepDefinitions",
					plugin= {"pretty", "html:reports/myreport.html",
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},               //generates spark reports using extentReports Adapter
							dryRun=false,    // checks mapping between scenario steps and step definition methods
							monochrome=true,    // to avoid junk characters in output
							publish=true,  // to publish report in cucumber server					
							tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {
	
 
}
 
 