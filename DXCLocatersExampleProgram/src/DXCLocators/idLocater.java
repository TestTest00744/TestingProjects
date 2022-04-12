/*Case Study: =id Locater
 Launch Eclipse
Create Project Name
Create Package
Create Class
Import Selenium Jars
Import Selenium Browser Jars
Use id Locater 
Use name Locater
Use xpath Locater
Use partial link Locater
Use class name Locater
Use Link text Locater 
*/

package DXCLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class idLocater {
@Test

	public void Locaters() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberTestClass\\DXCLocatersExampleProgram\\WebBrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(10000);
		driver.findElement(By.id("input-email")).sendKeys("t.vishnu.007@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("9490718624");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		Thread.sleep(10000);
		System.out.println("Login Sucessfully");
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("input-firstname")).sendKeys("irampuram");
		Thread.sleep(5000);
		driver.findElement(By.id("input-lastname")).sendKeys("ishnu");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input")).click();
		driver.quit();
		System.out.println("Logout Sucessfully");
	}
}
