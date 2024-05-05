package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class MulitiSelectDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver =  new ChromeDriver();
		
		driver.get("https://demo.mobiscroll.com/jquery/select/image-text#");
		
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"select-wrapper-527700\"]/div/input"));
		
		Select select = new Select(dropDown);
		
		select.selectByIndex(0);
		//select.selectByValue();

	}

}
