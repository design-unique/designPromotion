package testCases;


import utility.browserEngine;
import utility.elementsLocator;
import utility.testData;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginKeywords {
	
	public static WebDriver driver;
	
	
	  public static void openBrowser() throws InterruptedException 
	{
		//TS_001 Open the Browser
		driver=browserEngine.browserConfig();
		
		//delay for 5sec
		Thread.sleep(5000);
	  }
	
	
   public static void loadAUT() throws InterruptedException 
  {
	  //TS_002 Navigate to Website
	  driver.get(testData.loginURL);
	 
	//delay for 5sec
			Thread.sleep(5000);
  }
  
  
  public static void loginTitlevalidate()
  {
	  //TS_003 Validate login page Title
	  String loginpageactualTitle=driver.getTitle();
	  
	  Assert.assertEquals(loginpageactualTitle, testData.loginpageexpectedTitle);
  }
  
  
  public static void loginFunctionality()
  {
	  //TS_004 Login Functionality
	  
	  //identify the userID
	  driver.findElement(elementsLocator.loginuserID).sendKeys(testData.loginUID);
	  
	  //identify the PW
	  driver.findElement(elementsLocator.loginPW).sendKeys(testData.loginPW);
	  
	  //click on check box
	  driver.findElement(elementsLocator.loginCheckbox).click();
	  
	  //click on signinButton
	  driver.findElement(elementsLocator.signinButton).click();
	  
  }
  
 
  public static void afterloginTitlevalidate()
  {
	  //TS_005 Validate after login page Title
	  String afterloginactulpageTitle=driver.getTitle();
	  
	  Assert.assertEquals(afterloginactulpageTitle, testData.afterloginpageexpectedTitle);
  }
  
  
  public static void logoutFunctionality()
  {
	  //TS_006 Logout Functionality
	  //click on drop down button
	  driver.findElement(elementsLocator.logoutDropdown).click();
	  
	  //click on logout button
	  driver.findElement(elementsLocator.logoutButton).click();
	  
  }
  

  
  public static void closeBrowser() 
  {
	  //TS_007 Close the Browser
	  driver.quit();
  }

}
