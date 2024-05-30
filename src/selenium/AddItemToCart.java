package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Logitech Mouse" + Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"item2b52e33a7d\"]/div/div[2]/a/div/span")).click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Set<String> windowshandles = driver.getWindowHandles();

		Iterator<String> iterator = windowshandles.iterator();

		String parentsWindows = iterator.next();

		String childWindow = iterator.next();

		driver.switchTo().window(childWindow);

		driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).clear();

		driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).sendKeys("2");

		driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]")).click();
		Thread.sleep(2000);

		driver.switchTo().window(parentsWindows);
		Thread.sleep(2000);

		driver.quit();

	}
}