package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class JsExecutor {

    static WebDriver driver ;
    Properties P = Propertyreader.Read();

    public JsExecutor () throws IOException
    {
        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() {

        driver.get(P.getProperty("JSEURL"));
    }

    public static void flash(WebElement element ,WebDriver driver) throws InterruptedException {
        String bgcolor = element.getCssValue("backgroundColor");

        for(int i=0 ;i<50; i++)
        {
            changeColor("#000000",element,driver);
            changeColor(bgcolor,element,driver);
        }

    }


    public static void changeColor(String color,WebElement element, WebDriver driver) throws InterruptedException {
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'",element);

        try{
            Thread.sleep(20);
        } catch (InterruptedException e){

        }
    }

    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].style.border='3 px solid-red'", element);

    }
    public static void blink() throws InterruptedException {
        WebElement flashbutton = driver.findElement(By.xpath("(//a[@href='/signup'])[1]"));
        flash(flashbutton,driver);
        drawBorder(flashbutton,driver);

    }

}
