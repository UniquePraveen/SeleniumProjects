package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));

		driver.switchTo().frame(frame);

		WebElement drag = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);

		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		Thread.sleep(2000);

		actions.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);

		driver.quit();

	}

}
