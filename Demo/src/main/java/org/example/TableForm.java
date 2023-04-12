package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class TableForm {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public TableForm() throws IOException {

        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver, this);

    }

    //@FindBy(xpath="//span[@id='delete-record-2']")
    //public WebElement deleteRecord;

    //@FindBy(xpath = "(//span[@title='Edit'])[1]")
    //public WebElement updateRecord;

    public void getSite() {

        driver.get(P.getProperty("TableFormURL"));
    }

    public void createRow() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Khushboo");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Dewangan");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("khushboodewangan91@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("450000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Health Care & Insurance");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(1000);
        System.out.println("Added new row");


    }

    public void deleteRow() throws InterruptedException {
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"google_esf\"]")));
        //ReusableMethods.scrollToElement(deleteRecord);
        WebElement deleteRecord = driver.findElement(By.xpath("//span[@id='delete-record-2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(deleteRecord).click().build().perform();
        Thread.sleep(2000);
        System.out.println("Deleted a row");


    }

    public void updateRow() throws InterruptedException {
        //ReusableMethods.scrollToElement(updateRecord);
        WebElement updateRecord = driver.findElement(By.xpath("(//span[@title='Edit'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(updateRecord).click().build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='age']")).clear();
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(3000);
        System.out.println("Updated a row");
    }

    public void readTable() {
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='rt-table']"));
        Boolean status = false;
        for (WebElement rowData : rows) {
            String header = rowData.getText();
            System.out.println(header);
            System.out.println("-----------------");


        }
    }
}




