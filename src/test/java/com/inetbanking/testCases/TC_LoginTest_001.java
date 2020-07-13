package com.inetbanking.testCases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		//Create Object of LoginPage Class imported the from pageObjects package
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		Thread.sleep(2000);
		
		lp.clickSubmit();
		logger.info("Clicked on Submit");
		
		Thread.sleep(2000);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

	//private void captureScreen(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
