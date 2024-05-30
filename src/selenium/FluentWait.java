package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait {

	public FluentWait(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).perform();

	/*	Wait<WebDriver> wait =
		        new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(2))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[4]/a"))).click();
*/
		driver.quit();

	}

	

}
