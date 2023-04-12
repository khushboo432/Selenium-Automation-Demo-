package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class MouseHover {

    WebDriver driver;

    Properties P = Propertyreader.Read();


    public MouseHover() throws IOException {
        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() throws InterruptedException {

        driver.get(P.getProperty("MouseHoverURL"));
    }

    public void mouseHover() throws InterruptedException{
       // WebElement mhover = driver.findElement(By.xpath("(//a[@_sp='p2481888.m1379.l3250'])[1]"));
        WebElement nhover = driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Home-Garden/11700/bn_1853126'])[2]"));
        WebElement ohover = driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]"));
        Actions action = new Actions(driver);
        action.moveToElement(ohover).perform();
        Thread.sleep(5000);
        action.moveToElement(nhover).perform();
        Thread.sleep(200);


    }
}
