package utility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserEngine {
	
	public static WebDriver driver;
	
	public static WebDriver browserConfig()
	
	{
		//Chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\DigitalPoint Project\\15jan23\\designPromotion\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		System.out.println("chrome browser is opened");
		
		//Firefox driver path
		//System.setProperty("webdriver.gecko.driver", "D:\\DigitalPoint Project\\15jan23\\designPromotion\\drivers\\geckodriver.exe");
		
		//driver=new FirefoxDriver();
		
		//System.out.println("firefox browser is opened");
		
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//maximize the browser as given set size
		
	//Dimension d=new Dimension(300, 1025);
	//driver.manage().window().setSize(d);
		
		//delete all cookies from the browser
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}

}
