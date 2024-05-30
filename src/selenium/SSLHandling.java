package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLHandling {

	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);

		ChromeOptions coptions = new ChromeOptions();

		coptions.merge(dc);

		ChromeDriver driver = new ChromeDriver(coptions);

		driver.get("https://expired.badssl.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.quit();

	}

}
