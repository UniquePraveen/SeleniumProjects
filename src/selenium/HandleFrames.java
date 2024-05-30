package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));

		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("/html/body/button")).click();

		driver.quit();

	}

}
