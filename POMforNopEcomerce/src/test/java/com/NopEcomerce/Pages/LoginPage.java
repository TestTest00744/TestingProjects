package com.NopEcomerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	this.driver = driver;
}
	@FindBy(how = How.ID, using = "Username")
	WebElement Username;
	
	@FindBy(how =How.ID, using = "Password")
	WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@type,'submit')]")
	WebElement pushButton;
	
	public void LoginNopEcom(String uname, String psd) {
		Username.sendKeys(uname);
		Password.sendKeys(psd);
		pushButton.click();
		driver.quit();
	}
}