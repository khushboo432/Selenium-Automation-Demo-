package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class AlertBox {

    WebDriver driver;

    Properties P = Propertyreader.Read();
    public AlertBox() throws IOException {
        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);

    }

    public void getSite() {

        driver.get(P.getProperty("AlertBoxURL"));
    }

    public void firstAlert() throws InterruptedException {
        driver.findElement(By.id("alertButton")).click();
        Alert firstalert=driver.switchTo().alert();
        Thread.sleep(2000);
        firstalert.accept();


    }

   public void secondAlert() throws InterruptedException{
       Thread.sleep(2000);
       WebElement element=driver.findElement(By.id("timerAlertButton"));
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", element);
       Thread.sleep(6000);
        Alert secondalert=driver.switchTo().alert();
        secondalert.accept();
        Thread.sleep(2000);

    }

    public void thirdAlert() throws InterruptedException{
       WebElement element = driver.findElement(By.id("confirmButton"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        Alert thirdalert=driver.switchTo().alert();
        Thread.sleep(10000);
        thirdalert.dismiss();

    }

    public void fourthAlert(){
        WebElement element = driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        Alert fourthalert=driver.switchTo().alert();
        fourthalert.sendKeys("Kushina Uzumaki");
        fourthalert.accept();

    }

    public void captureScreenshot() throws IOException {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File trg=new File(".\\Screenshots\\alertbox.png");
        FileUtils.copyFile(src,trg);

    }
}


