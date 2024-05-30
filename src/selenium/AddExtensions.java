package selenium;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtensions {

	public static void main(String[] args) {

	
		ChromeOptions opt = new ChromeOptions();
		
		opt.addExtensions(new File("./extensions/SelectorsHub.crx"),new File("./extensions/Chrome Web Store.crx"));	
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		
	}

}
