package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");

		driver.manage().window().maximize();

		WebElement dropDown = driver.findElement(By.name("employees_c"));

		Select select = new Select(dropDown);

		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByVisibleText("501 - 1,000 employees");
		Thread.sleep(2000);
		select.selectByValue("level8");
		Thread.sleep(2000);
		
	

		driver.quit();

	}

}
