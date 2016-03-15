package cheapoair;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.io.*;
import org.testng.annotations.Test;


public class wordpressTest {
	
	
	public WebDriver driver;

	//@Before
	@Test
	public void setup() throws MalformedURLException, InterruptedException {
		File app = new File("C:\\Appium\\CheapoAir_AirHotel_3.0.15.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("browserName","");
		
		capabilities.setCapability("deviceName","lge-nexus_5-067004340ac6415c");
		
		capabilities.setCapability("platformVersion","4.4.4");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("app",app.getAbsolutePath());
		capabilities.setCapability("apppackage","com.fp.cheapoair");
		capabilities.setCapability("appActivity","com.fp.cheapoair.Cheapoair");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
	}
	
}
