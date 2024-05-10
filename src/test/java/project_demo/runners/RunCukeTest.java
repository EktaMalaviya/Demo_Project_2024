package project_demo.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//(Link between feature file and Mystepdef,Starting point of execution)
@CucumberOptions(
        features = "src/test/resources/features",//(Feature path file)
        glue = "project_demo/steps",//(Step folder path)
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        //tags =  "@regression"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {



}


