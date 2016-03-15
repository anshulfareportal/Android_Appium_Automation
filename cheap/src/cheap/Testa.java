package cheap;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.io.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class Testa {

	AndroidDriver dr;
	
	@Test
	
	public void testapp() throws MalformedURLException, InterruptedException {
		
		String contact = "1jyot";
				
		//File classpathRoot = new File(System.getProperty("use.dir"));
		//File appDir = new File(classpathRoot, "/app");
		//File app = new File(appDir, "CheapoAir_AirHotel_3.0.15.apk");
	File app = new File("C:\\Appium\\CheapoAir_AirHotel_3.0.15.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("browserName","");
		
		capabilities.setCapability("deviceName","lge-nexus_5-067004340ac6415c");
		
		capabilities.setCapability("platformVersion","4.4.4");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("app",app.getAbsolutePath());
		capabilities.setCapability("apppackage","com.fp.cheapoair");
		capabilities.setCapability("appActivity",".Cheapoair");
		capabilities.setCapability("appWaitActivity",".Cheapoair");
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		System.out.println("fsghhhghjghjghjgf");
	}
	

}
