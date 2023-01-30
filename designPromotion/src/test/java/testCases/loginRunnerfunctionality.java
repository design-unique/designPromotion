package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.logData;
import utility.readExceldata;
import utility.testData;

public class loginRunnerfunctionality {
	
	
	
	@Test
	public static void userLogin() throws IOException, InterruptedException
	
	{
		//declare the external file path
		String filepath=testData.externalexcelpath;
		
		//import the external excel file
		readExceldata.readExcelData(filepath, "Sheet1");
		
		for (int iRow=1; iRow<=7; iRow++)
		{
			String keywords=readExceldata.readcellValue(iRow, 3);
			
			if (keywords.equals("openBrowser"))
			{loginKeywords.openBrowser();
			
			System.out.println("Browser opened");
			
			logData.info("Browser opened");
			}
			
			else if (keywords.equals("loadAUT"))
			{loginKeywords.loadAUT();
			
			System.out.println("open the login page");
			
			logData.info("open the login page");
			}
			
			else if (keywords.equals("loginTitlevalidate"))
			{loginKeywords.loginTitlevalidate();
			
			System.out.println("login page Title validated");
			
			logData.info("login page Title validated");
			}
			
			else if (keywords.equals("loginFunctionality"))
			{loginKeywords.loginFunctionality();
			
			System.out.println("login functionality done");	
			
			logData.info("login functionality done");
			}
			
			else if (keywords.equals("afterloginTitlevalidate"))
			{loginKeywords.afterloginTitlevalidate();
			
			System.out.println("after login page validated");
			
			logData.info("after login page validated");
			}
			
			else if (keywords.equals("logoutFunctionality"))
			{loginKeywords.logoutFunctionality();
			
			System.out.println("logout functionality done");
			
			logData.info("logout functionality done");
			}
			
			else if (keywords.equals("closeBrowser"))
			{loginKeywords.closeBrowser();
			
			System.out.println("close the browser successfully");	
			
			logData.info("close the browser successfully");
			}
			
		}
		
		
		
		
	}

}
