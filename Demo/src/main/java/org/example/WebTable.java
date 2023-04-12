package org.example;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class WebTable {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public WebTable() throws IOException {
        this.driver = DriverFactory.getdriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() {

        driver.get(P.getProperty("WebTableURL"));
    }

    public void getHeader() {
        List<WebElement> headings = driver.findElements(By.xpath("//table[@id='customers']//th"));
        System.out.println(headings.size());
        //Assert.assertEquals(headings.size(), 12, "Column count is not the same ");
        Boolean status = false;
        for (WebElement we : headings) {
            String header = we.getText();
            System.out.println(header);

            //if (header.contains("tools")) {
            //     status = true;
            //     break;
            // }
            // Assert.assertTrue(status, "header is not present");
        }
    }

    public void getRows(){
        List <WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println(rows.size());

        for(WebElement r:rows)
        {
            String rd = r.getText();
            System.out.println(rd);
        }

    }


}
