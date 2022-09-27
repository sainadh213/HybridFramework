package com.actitime.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericLib.BaseTest;

public class LoginPage {

	
	@FindBy(id="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath = "//div[text()='Login ']") private WebElement loginBtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginBtn.click();
	}
	
	
	
	public WebElement getuntb()
	{
		return untb;
	}
	
	public WebElement getpwtb()
	{
		return pwtb;
	}
	
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	
	public void typeUn(String un)
	{
		untb.sendKeys(un);
	}
	
	public void typePw(String pwd)
	{
		pwtb.sendKeys(pwd);
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	
	
	
}
