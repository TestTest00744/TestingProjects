package DXCLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkLocator {
@Test	
	public void Locaters()  {
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberTestClass\\DXCLocatorsExampleProgram\\WebBrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/index.php");
		//Counting No of Links in EasyCaluculation
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int NoLinks = Links.size();
		System.out.println("No. of Links available...."+  NoLinks);
		for (int i=1; i< Link.size(); i++) {
		System.out.println(Links.get(i).getText());
		//To check in caluculator and click love age caluculator
		String str = Link.get(i).gettext();
		String str1 = " love Caluculator";
		if(str.equals(str1)) {
		driver.findElement(By.linkText("Love Calculator")).click();
		driver.findElement(By.xpath("//*[@id=\"alarmContentDisplay\"]/div[1]/div[6]/div[2]/div[1]/ul/li[2]/a")).click();
		
		}		
}
}
}