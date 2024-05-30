package selenium;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHanddling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/ap/?ir=1");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"1707962206997_xa6\"]/div[1]/article/div[2]/div/pbc-button[1]/a"))
				.click();

		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles);

		Iterator<String> iterator = windowHandles.iterator();

		String parentWnidow = iterator.next();

		String childWindow = iterator.next();

		driver.switchTo().window(childWindow);

		Thread.sleep(2000);

		driver.findElement(By.name("UserFirstName")).sendKeys("Praveen");
		Thread.sleep(2000);

		driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
		Thread.sleep(2000);

		driver.switchTo().window(parentWnidow);
		Thread.sleep(2000);

		driver.quit();

	}

}
