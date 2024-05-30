package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchMovieFromYTS {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://yts.mx/");

		driver.manage().window().maximize();

		driver.findElement(By.id("quick-search-input")).sendKeys("The Godfather");
		Thread.sleep(2000);

		driver.findElement(By.id("quick-search-input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);

		driver.findElement(By.id("quick-search-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.quit();

	}

}
