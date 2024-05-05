package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchMovieFromYTS {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://yts.mx/");

		driver.manage().window().maximize();

		driver.findElement(By.id("quick-search-input")).sendKeys("The Godfather" + Keys.ENTER);

		driver.navigate().to("https://yts.mx/movies/the-godfather-1972");

		driver.quit();

	}

}
