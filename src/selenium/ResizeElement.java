package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeElement {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resizable/");

		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));

		driver.switchTo().frame(frame);

		WebElement element = driver.findElement(By.id("resizable"));
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		Thread.sleep(2000);

		actions.dragAndDropBy(element, 100, 200).perform();
		Thread.sleep(2000);

		driver.quit();

	}

}
