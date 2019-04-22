package businessLogics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import utils.PropertiesAndConstants;

public class Mark1Appium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		//IOSDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
       // capabilities.setCapability("deviceName", "iPod touch");
      //  capabilities.setCapability("platformVersion", "8.4"); 
        capabilities.setCapability("udid", "4a1eed0fcc7a6ecd94ef9b97d341a732c7c9aea7");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	   	System.out.println("Connecting to Mobile");
	   	capabilities.setCapability("app", "/Users/rohitv/Desktop/Idea.app");
    	capabilities.setCapability("BundleID", "com.ideacellular.myidea");
        System.out.println("Connecting.....");
        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Appium Setup successfully ");
      //  PropertiesAndConstants.Selenium.get("https://www.qa.hh.atg.se");
        System.out.println("god is great");
        Thread.sleep(10000);
       try
       {
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIATextField[1]")).clear();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIATextField[1]")).sendKeys("786554433");
        System.out.println("Death Race");
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
	}

}
