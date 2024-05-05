package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverMethods {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://yts.mx/");
		driver.manage().window().maximize();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String Title = driver.getTitle();
		System.out.println(Title);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		driver.navigate().to("https://www.1337x.to/");

		driver.quit();

	}

}
