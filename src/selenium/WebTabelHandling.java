package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabelHandling {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.asx.com.au/markets/trade-our-cash-market/equity-market-prices?utm_widget=topTwenty");
		driver.manage().window().maximize();

		List<WebElement> tableRows = driver
				.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr"));
		System.out.println(tableRows.size());

		List<WebElement> tableColumns = driver
				.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr[2]/td"));
		System.out.println(tableColumns.size());

		for (int i = 2; i <= tableRows.size(); i++) {

			for (int j = 1; j <= tableColumns.size(); j++) {

				System.out.print(driver.findElement(By
						.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr[" + i + "]/td[" + j + " ]"))
						.getText());

				System.out.print(" ");

			}

			System.out.println();

		}

		driver.quit();

	}

}
