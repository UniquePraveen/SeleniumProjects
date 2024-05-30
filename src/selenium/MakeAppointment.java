package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeAppointment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://katalon-demo-cura.herokuapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"txt-username\"]")).sendKeys("John Doe");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btn-login\"]")).click();
		Thread.sleep(2000);

		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]"));

		Select select = new Select(dropDown);

		select.selectByIndex(2);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"chk_hospotal_readmission\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"radio_program_medicaid\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"appointment\"]/div/div/form/div[4]/div/div/div")).click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div")));

		WebElement date = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody"));

		List<WebElement> dates = date.findElements(By.tagName("td"));
		for (WebElement list : dates) {

			if (list.getText().equalsIgnoreCase("14")) {
				list.click();
				break;
			}
		}

		driver.findElement(By.xpath("//*[@id=\"txt_comment\"]")).sendKeys("Urgent");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
