package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.example.DriverFactory;
import org.example.Propertyreader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

public class ApplicationHooks {

    WebDriver driver;

    Properties P = Propertyreader.Read();


    public ApplicationHooks() throws IOException {

    }

    @Before
    public void start()
    {
        DriverFactory driverFactory= new DriverFactory();
        driver = driverFactory.driver_init(P.getProperty("BrowserType"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException, InterruptedException {
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    byte[] file = FileUtils.readFileToByteArray(screenshot);
    scenario.attach(file, "image/png", "");
    }
    
    @After
    public void teardown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }


}
