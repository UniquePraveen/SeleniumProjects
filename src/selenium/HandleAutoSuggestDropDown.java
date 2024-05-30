package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/label/span"))
				.click();
		WebElement from = driver.findElement(By
				.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));

		Thread.sleep(2000);
		from.sendKeys("Colombo");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/label/span"))
				.click();
		WebElement to = driver.findElement(By.xpath(
				"//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"));

		Thread.sleep(2000);
		to.sendKeys("Sydney");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.quit();

	}

}
