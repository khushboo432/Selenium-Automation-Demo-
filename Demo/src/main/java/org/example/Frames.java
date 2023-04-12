package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class Frames {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public Frames() throws IOException {
        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() {

        driver.get(P.getProperty("FramesURL"));
    }

    public void inputFirstFrame() throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.id("singleframe")));
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("khushboo dewangan");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();


    }

    public void inputSecondFrame() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
        System.out.println("Inside First Frame");
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px'])")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
        System.out.println("Found the frame");
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("kritika dewangan");
        driver.switchTo().defaultContent();

    }
}
