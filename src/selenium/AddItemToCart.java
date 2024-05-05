package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Logitech Mouse" + Keys.ENTER);
		driver.navigate().to(
				"https://www.ebay.com/itm/186074217085?epid=27031978818&itmmeta=01HX0VM3M8BD737J0DCA4VKDXA&hash=item2b52e33a7d:g:zVYAAOSw4qNePBGc&itmprp=enc%3AAQAJAAAA4FfO1btnv3ahGgvzR9IPtoP1fJbnQZ5F37lXcEc5LfaWfWbiALR3NI0p9fdr%2FHtS%2FeFtQl5k9yF4VGEp8VYmYJl2LhsuPUaXig9ETVG3YZJE8H4GL3YkNUf2uBbt%2FLg5YCWR9QbNsYkqG4YWo3SSWjdlN8qxdT2HnqIULxmb94wuws0%2FIKC2oq2vRCqixrAJW13YziHZERdgWHvsJXzKImI6mUOlllOM%2BIrCke6Jm4JWT4zNq7FQOXfmg0hslUB62q3nYUiU6Xf3%2BDCDvtIGfea7midPX7HjnEpldbiS%2FPap%7Ctkp%3ABFBMxrrQm-hj");
		driver.findElement(By.id("atcBtn_btn_1")).click();

		Thread.sleep(2000);
		driver.quit();

	}
}//*[@id="inventory_container"]/div