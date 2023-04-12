package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Properties;

public class DropDown {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public DropDown() throws IOException {

        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);

    }

    public void getSite() throws InterruptedException {

        driver.get(P.getProperty("DropDownURL"));

    }

    public void dropDown() throws InterruptedException{

        WebElement dropdown = driver.findElement(By.xpath("//select"));
        Select selectOption = new Select(dropdown);
        selectOption.selectByValue("ALB");
        Thread.sleep(200);
        selectOption.selectByValue("COL");
        Thread.sleep(200);
        selectOption.selectByValue("ARG");
        Thread.sleep(200);
        selectOption.selectByIndex(5);
        Thread.sleep(200);
        selectOption.selectByVisibleText("India");
        Thread.sleep(200);


    }
}
