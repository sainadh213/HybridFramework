package com.actitime.TimeTrack;

import com.actitime.Pages.LoginPage;
import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;

public class ValidLoginTest extends BaseTest{

	
	public void loginToApp() throws Throwable
	{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), 
				flib.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(flib.readPropertyData(PROP_PATH, "homeTitle"),
				wlib.getPageTitle(),
				"Enter Time Track Page");
	}
}












