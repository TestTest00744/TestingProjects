package DXCLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLocators {

	@Test
	public void Locaters() throws Exception {
	System.setProperty("webdriver.chrome.driver",
			"D:\\CucumberTestClass\\DXCLocatersExampleProgram\\WebBrowsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/index.php?route=account/login");
	Thread.sleep(10000);
	
	//*[@id=’i’] By CSS ID: find_element_by_id
	driver.findElement(By.id("input-email")).sendKeys("t.vishnu.007@gmail.com");
	Thread.sleep(5000);
	//*[@name=’n’] By name attribute: find_element_by_name
	driver.findElement(By.name("password")).sendKeys("9490718624");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
	System.out.println("Login Sucessfully");
	
	//By partial link text: find_element_by_partial_link_text
	driver.findElement(By.partialLinkText("Your Transactions")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#content > div.buttons.clearfix > div > a")).click();;
	
	//By link text: find_element_by_link_text
	driver.findElement(By.linkText("View your order history")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("dropdown")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a")).click();
	
	driver.quit();
	System.out.println("Logout Sucessfully");

}
}
