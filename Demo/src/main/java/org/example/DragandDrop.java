package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;
import java.util.Properties;

public class DragandDrop {

    WebDriver driver;
    Properties P = Propertyreader.Read();

    public DragandDrop() throws IOException{

        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);

    }


    public void getSite() {

        driver.get(P.getProperty("DragAndDropURL"));
    }

    public void dragElement(){

        WebElement drag=driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement drop = driver.findElement(By.xpath(("//div[@id='box103']")));
        Actions action = new Actions(driver);
        action.dragAndDrop(drag,drop).perform();

    }


}
