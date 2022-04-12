package DemoData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadArrayData {
	WebDriver driver;

	@Test(dataProvider = "Tipreports")
	public void Dataprovider(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\CucumberTestClass\\STRINGvaluefromNUMERICcell\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\\'content\\']/div/div[2]/div/form/input")).click();

		Thread.sleep(5000);
		// driver.getCurrentUrl();

		Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.opencart.com/index.php?route=account/login"),
				"User Not able to Login - Invalid Credentials");
	}

	@AfterMethod
	public void Close() {
		driver.quit();
	}

	@DataProvider(name = "Tipreports")
	public Object[][] passdata() {

		ExcelDataConfig config = new ExcelDataConfig(
				"D:\\CucumberTestClass\\STRINGvaluefromNUMERICcell\\TestData\\ExampleTestData.xls");
		int rows = config.getRowCount(0);

		Object[][] data = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);

		}
		return data;

	}

}
