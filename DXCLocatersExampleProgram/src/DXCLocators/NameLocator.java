/*Case Study: =name Locater Example
Launch Eclipse
Create Project Name
Create Package
Create Class
Import Selenium Jars
Import Selenium Browser Jars
Use name Locater
*/
package DXCLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameLocator {
	@Test

	public void Locaters() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberTestClass\\DXCLocatersExampleProgram\\WebBrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("t.vishnu.007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9490718624");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		Thread.sleep(10000);
		System.out.println("Login Sucessfully");
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#content > div > div.pull-right > a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tirampuram");
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("Vishnu");
		Thread.sleep(5000);
		driver.findElement(By.name("address_1")).sendKeys("Uravakonda");
		Thread.sleep(5000);
		driver.findElement(By.name("city")).sendKeys("Anantapur");
		Thread.sleep(5000);
		driver.findElement(By.name("postcode")).sendKeys("515812");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a")).click();
		driver.quit();
		System.out.println("Logout Sucessfully");
	}
}
