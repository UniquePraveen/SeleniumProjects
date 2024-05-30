package selenium;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		driver.manage().window().maximize();

		JavascriptExecutor jsexe = (JavascriptExecutor) driver;

		// Print title of the page

		String script = "return document.title;";

		String title = (String) jsexe.executeScript(script);

		System.out.println(title);

		// Click the button

		driver.switchTo().frame("iframeResult");

		jsexe.executeScript("myFunction()");

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		// Highlight Button

		WebElement button = driver.findElement(By.xpath("/html/body/button"));

		jsexe.executeScript("arguments[0].style.border='5px solid blue'", button);

		// Scroll

		driver.navigate().to("https://www.w3schools.com/");

		WebElement templateButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[16]/p/a"));

		jsexe.executeScript("arguments[0].scrollIntoView(true)", templateButton);

		driver.quit();

	}

}
