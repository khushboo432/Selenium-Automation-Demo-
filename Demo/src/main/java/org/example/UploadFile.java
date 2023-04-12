package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.Properties;

public class UploadFile {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public UploadFile() throws IOException {
        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);

    }

    public void getSite() {

        driver.get(P.getProperty("UploadFileURL"));
    }

    public void fileUpload() {
        driver.findElement(By.xpath("//input[@class='form-control-file']")).sendKeys("C:\\Users\\hxdewank\\Desktop");
    }
}
