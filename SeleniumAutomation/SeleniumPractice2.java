package SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//count of links in the whole page
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkCountWholePage = links.size();
		System.out.println("Total number of links in this page :" + linkCountWholePage);
		//printing each link
		int index =0;
		for(WebElement l : links) {
			index++;
			System.out.println(index + l.getAttribute("href"));
		}
		
		//count of links in the footer
				WebElement footerDriver =  driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]"));
				int linkCountFooter = footerDriver.findElements(By.tagName("a")).size();
				System.out.println("Total number of links in this page footer:" + linkCountFooter);
				Thread.sleep(2000);
				
				
		//count of links in a column of a footer
		WebElement columnDriver = footerDriver.findElement(By.xpath("((//table)[3]//tr/td)[1]"));
		List<WebElement> columnLinks = columnDriver.findElements(By.tagName("a")); 
		int linkCountFooterColumn = columnLinks.size();
		index =0;
		for(WebElement click : columnLinks) {
			index++;
			click.click();
			System.out.println("clicking on index" + index);
		}
		System.out.println("Total number of links in this page footer column:" + linkCountFooterColumn);
		System.out.println("Making changes");
		Thread.sleep(2000);
		driver.close();
	
		
		
		
		
		
		
		
	}

}
