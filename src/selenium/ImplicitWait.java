package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {


	@SuppressWarnings("deprecation")
	
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		WebElement webelement = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));

		Actions actions = new Actions(driver);

		actions.moveToElement(webelement).perform();

		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();

		driver.quit();

	}

}
