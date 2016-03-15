

import java.io.File;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.io.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Wait;

import static org.testng.Assert.assertEquals;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Demo_Version {
	
	WebDriver dr;
	DesiredCapabilities capabilities;
	
	@Test

public void testapp1() throws MalformedURLException, InterruptedException {
		
		String contact = "1jyot";
				
		//File classpathRoot = new File(System.getProperty("use.dir"));
		//File appDir = new File(classpathRoot, "/app");
		//File app = new File(appDir, "CheapoAir_AirHotel_3.0.15.apk");
		File app = new File("D:\\CheapoAir_AirHotel_3.0.36.apk");
		capabilities= new DesiredCapabilities();
		capabilities.setCapability("browserName", "");
		//capabilities.setCapability("deviceName","lge-nexus_5-067004340ac6415c");
		//capabilities.setCapability("deviceName","motorola-nexus_6-ZX1G428LBP");
		capabilities.setCapability("deviceName","samsung-sm_n910g-641dd802");
		
		//capabilities.setCapability("deviceName","641dd802");	
		capabilities.setCapability("platformVersion","4.4.4");
	//			capabilities.setCapability("platformVersion","5.0.1");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("app",app.getAbsolutePath());
		capabilities.setCapability("apppackage","com.fp.cheapoair");
	
		//capabilities.setCapability("appActivity","com.fp.cheapoair.Air.View.FlightSearch.TravelersDetailsScreen");
		capabilities.setCapability("appActivity","com.fp.cheapoair.Cheapoair");
		//capabilities.setCapability("appWaitActivity",".Cheapoair");
		dr = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	//dr = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	//dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		System.out.println("fsghhhghjghjghjgf");
		dr.findElement(By.name("Flights")).click();
		
		
	}
	

}




