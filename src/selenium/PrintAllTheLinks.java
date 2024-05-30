package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTheLinks {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
		driver.manage().window().maximize();
		
		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		System.out.println("Total Tags are: " + allTags.size());
		
		for(int i = 0;i < allTags.size();i++) {
			
			System.out.println("Links on page are: " + allTags.get(i).getAttribute("href"));
			System.out.println("Links on page are: " + allTags.get(i).getText());
		}
		
		driver.quit();
		

	}

}
