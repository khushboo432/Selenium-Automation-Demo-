package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.util.Properties;


public class SeleniumPractice {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public SeleniumPractice() throws IOException {

        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);

    }

    public void getSite() {

        driver.get(P.getProperty("PracticeURL"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public void firstName() {
    driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("Khushboo");
    }

    public void lastName(){
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Dewangan");
    }

    public void eMail(){
        driver.findElement(By.xpath("(//input[@id=\"email\"])[1]")).sendKeys("khushboodewangan91@gmail.com");
    }

    public void gender() {
        driver.findElement(By.xpath("//input[@value=\"female\"]")).click();
    }

    public void profession(){
        driver.findElement(By.xpath("//input[@value=\"working\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public void selectCountry(){
        WebElement countryDropdown=driver.findElement(By.xpath("//select[@name=\"country\"]"));
        Select chooseCountry =new Select(countryDropdown);
        chooseCountry.selectByValue("India");
    }

    public void multipleSkill(){
        WebElement skillDropdown= driver.findElement(By.xpath("//select[@id='skillsmultiple']"));
        Select selectSkill=new Select(skillDropdown);
        selectSkill.selectByValue("AT");

    }

    public void clickButton(){
        driver.findElement(By.xpath("//BUTTON[@id=\"simplebutton\"]")).click();
    }

    public void clickAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id=\"alertbutton\"]")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }


}
