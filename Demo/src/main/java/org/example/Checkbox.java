package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Checkbox {
    WebDriver driver;

    Properties P = Propertyreader.Read();

    public Checkbox() throws IOException {

        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);

    }

    public void getSite() {

        //driver.get("https://demoqa.com/checkbox");
       // driver.get("https://www.flipkart.com/");

        driver.get(P.getProperty("CheckBoxURL"));
    }

    public void clickCheckbox() {

        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
    }

    public void captureElement() throws IOException {
        WebElement section=driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
        File src=section.getScreenshotAs(OutputType.FILE);
        File trg=new File(".\\Screenshots\\checkbox.png");
        FileUtils.copyFile(src,trg);
    }


}
