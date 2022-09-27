package com.actitime.Tasks;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Pages.EnterTimeTrackPage;
import com.actitime.TimeTrack.ValidLoginTest;
import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
//Open the browser enter the test URL 
//Verify Login Page
@Listeners(com.actitime.genericLib.MyListeners.class)
public class VerifyTasksTest extends BaseTest{

	@Test
	public void verifyTasks() throws Throwable
	{
		//Login to App
		//Verify Home page
		ValidLoginTest vl=new ValidLoginTest();
		vl.loginToApp();
		//Click on tasks Tab
		EnterTimeTrackPage et=new EnterTimeTrackPage();
		et.clickTasksTab();
		
		//Assert.fail();
		//Verify tasks page
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		FileLib flib=new FileLib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "taskTitle"),
				wlib.getPageTitle(),
				"Tasks List Page");
		
		
	}
}
