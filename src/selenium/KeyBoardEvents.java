package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://extendsclass.com/text-compare.html");

		driver.manage().window().maximize();

		WebElement sourceText = driver
				.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[4]/pre"));

		Actions actions = new Actions(driver);

		Thread.sleep(2000);

		actions.keyDown(sourceText, Keys.COMMAND).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);

		WebElement destinaionText = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre"));
		Thread.sleep(2000);

		actions.keyDown(destinaionText, Keys.COMMAND).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);

		driver.quit();

	}

}
