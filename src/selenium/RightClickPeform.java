package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickPeform {
	
	public static void main (String[] args) throws InterruptedException {
		
					
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/slider/#colorpicker");
			
			driver.manage().window().maximize();
			
			WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			
			driver.switchTo().frame(frame);
			
			WebElement swatch = driver.findElement(By.id("swatch"));
			
			Actions actions = new Actions(driver);
			
			actions.contextClick(swatch).perform();
			
			Thread.sleep(2000);
			
			driver.quit();
			
			
		
		
	}

}
