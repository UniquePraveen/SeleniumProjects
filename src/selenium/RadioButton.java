package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://designsystem.digital.gov/components/radio-buttons/");
		driver.manage().window().maximize();

		WebElement radioButton = driver
				.findElement(By.xpath("//*[@id=\"radio-buttons-preview-content\"]/fieldset/div[3]/label"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver
				.findElement(By.xpath("//*[@id=\"radio-buttons-code\"]/button")));
		actions.perform();
		
	
		
		radioButton.click();
		Thread.sleep(2000);
		radioButton.isSelected();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
