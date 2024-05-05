package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("praveen@gmail.com");
		driver.findElement(By.name("email")).clear();
		System.out.println(driver.findElement(By.xpath("/html/body")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("/html/body")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("/html/body")).getLocation());
		System.out.println(driver.findElement(By.xpath("/html/body")).getSize());
		System.out.println(driver.findElement(By.xpath("/html/body")).getTagName());
		System.out.println(driver.findElement(By.xpath("/html/body")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html/body")).isEnabled());
		System.out.println(driver.findElement(By.xpath("/html/body")).isSelected());

		driver.quit();

	}

}
