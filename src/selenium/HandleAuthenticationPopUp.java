package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopUp {

	public static String userName = "admin";

	public static String password = "admin";

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// Method 1

		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		// Method 2

		driver.get("https://" + userName + ":" + password + "@tthe-internet.herokuapp.com/basic_auth");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.quit();

	}

}
