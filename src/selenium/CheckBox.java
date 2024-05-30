package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input"));
		actions.moveToElement(button);
		actions.perform();

		driver.findElement(By.id("doi0")).click();

		driver.findElement(By.id("doi0")).click();

		driver.quit();
	}

}
