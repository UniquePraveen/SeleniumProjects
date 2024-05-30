package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SingerSL {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.singersl.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"edit-search\"]")).sendKeys("Laptop" + Keys.ENTER);

		WebElement product = driver.findElement(By.xpath("//*[@id=\"popularity\"]/div/div[6]/div[3]/div[1]/h2/a"));

		Actions actions = new Actions(driver);

		actions.moveToElement(product).perform();

		product.click();

		driver.findElement(By.xpath("//*[@id=\"edit-order-now\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"block-singer-shopping-cart\"]/div/div/div/a/span[1]")).click();

		driver.findElement(
				By.xpath("//*[@id=\"views-form-commerce-cart-form-default-522232\"]/div[1]/div[2]/div[1]/span[2]"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"mycart\"]/div[1]/div/div[3]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"edit-actions\"]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"user-account\"]/div/div[3]/a/span")).click();

		driver.findElement(By.xpath("//*[@placeholder='Enter Your Email']")).sendKeys("htnpraveen@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Praveen Kumar");

		driver.findElement(By.xpath("//*[@id=\"address_line_one\"]")).sendKeys("Hatton");

		driver.findElement(By.xpath("//*[@id=\"address_line_two\"]")).sendKeys("Hatton");

		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"city\"]"));

		Select select = new Select(dropDown);

		select.selectByValue("20");

		driver.findElement(By.xpath(
				"/html/body/div[3]/main/div/div/div[2]/form/div/div[1]/div[3]/fieldset/div/div/div[1]/div[7]/div/input"))
				.sendKeys("0711111111");

		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"address_info_2\"]"));

		actions.moveToElement(radioButton).click().perform();

		driver.findElement(By.xpath("//*[@id=\"edit-address-information-profile-nic-number\"]"))
				.sendKeys("200025303346");

		driver.findElement(By.xpath("//*[@id=\"edit-address-information-profile-delivery-notes\"]"))
				.sendKeys("Make it faster");
		Thread.sleep(3000);

		WebElement button = driver.findElement(By.xpath("//*[@value=\"Continue\"]"));

		actions.moveToElement(button).click().perform();

		driver.findElement(By.xpath("//*[@id=\"edit-payment-radio\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"edit-payment-method--3Q0Ycd7vBWM\"]/div[2]/label/div/span[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"edit-pay-now--76hzdoROFqU\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"paymentMethodCardInput\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("4216890314161122");

		WebElement dropDown2 = driver.findElement(By.xpath("//*[@id=\"expiryMonth\"]"));

		Select select1 = new Select(dropDown2);

		select1.selectByIndex(9);

		WebElement dropDown3 = driver.findElement(By.xpath("//*[@id=\"expiryYear\"]"));

		Select select2 = new Select(dropDown3);

		select2.selectByIndex(2);

		driver.findElement(By.xpath("//*[@id=\"cardHolderName\"]")).sendKeys("Praveen Kumar");

		driver.findElement(By.xpath("//*[@id=\"csc\"]")).sendKeys("111");

		WebElement payButton = driver.findElement(By.xpath("//*[@id=\"button-row1\"]/button[1]"));

		actions.moveToElement(payButton).click().perform();

		Thread.sleep(5000);

		driver.quit();

	}

}
