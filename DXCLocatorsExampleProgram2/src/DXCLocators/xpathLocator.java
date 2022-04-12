/*Case Study: =name Locater Example
Launch Eclipse
Create Project Name
Create Package
Create Class
Import Selenium Jars
Import Selenium Browser Jars
Use xpath Locater
*/
package DXCLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpathLocator {
@Test
public void Locaters() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\CucumberTestClass\\DXCLocatersExampleProgram\\WebBrowsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[6]/a/img")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/input[1]")).click();
	Thread.sleep(5000);
	System.out.println("Are you enjoying the classes?"+           "Yes");
	driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[1]")).click();
	Thread.sleep(5000);
	System.out.println("Find default selected radio button          "+"Unchecked");
	driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]")).click();
	Thread.sleep(5000);
	System.out.println("Select your age group                       " +"1 - 20 years");
	driver.quit();
	System.out.println("Logout Sucessfully");
	
}
}
