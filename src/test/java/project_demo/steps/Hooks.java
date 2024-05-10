package project_demo.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import project_demo.propertyreader.PropertyReader;
import project_demo.utility.Utility;
//(Open and close browser)
public class Hooks extends Utility {
    @Before
    public void setUp() throws InterruptedException {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        closeBrowser();
    }
}
