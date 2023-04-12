package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Properties;

import java.io.IOException;

public class Calender {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public Calender() throws IOException {

        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);

    }

    public void getSite() {

        driver.get(P.getProperty("CalenderURL"));
    }

    public void clickDatePicker(){
        driver.findElement(By.id("datePickerMonthYearInput")).click();

    }

    public void selectDate() throws InterruptedException {
        Select month = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
        month.selectByVisibleText("March");

        Select year = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
        year.selectByVisibleText("2000");

        String date = "4";
        List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='react-datepicker__month']"));
        for (WebElement ele :allDates){
            String dt =ele.getText();
            if(dt.equals(date))
            {
                ele.click();
                break;
            }

        }
        Thread.sleep(5000);
    }
}
