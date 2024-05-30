package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		// driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"alert1\"]")).click();

		Thread.sleep(2000);

		String alertText = driver.switchTo().alert().getText();
		
		System.out.println(alertText);

		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		

		driver.quit();

	}

}
