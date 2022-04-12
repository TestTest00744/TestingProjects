package DXCLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRadiobuttons {
@Test
	public void Locaters() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberTestClass\\DXCLocatersExampleProgram\\WebBrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/LTI%20Selenium%20Samples/RadioButtons.html");
		Thread.sleep(100);
		int a= driver.findElements(By.xpath("/html/body/form/div/input[9]")).size();
		System.out.println("No of RadioButtons..." + a);
		
		for(int i=1; i<=a; i++);
		driver.findElements(By.xpath("/html/body/form/div/input[8]")).get(2).click();
}
}