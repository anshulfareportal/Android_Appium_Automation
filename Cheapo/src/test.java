import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;


public class test {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		final AppiumDriver driver;

	//	@Before
		
		//public void setup() throws Exception {
			File classpathRoot = new File(System.getProperty("use.dir"));
			File appDir = new File(classpathRoot, "/app");
			File app = new File(appDir, "CheapoAir_AirHotel_3.0.15.apk");
			DesiredCapabilities capabilities= new DesiredCapabilities();
//			capabilities.setCapability("browserName","");
			
			capabilities.setCapability("deviceName","android2.2");
			
			capabilities.setCapability("platformVersion","4.4");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("app",app.getAbsolutePath());
			capabilities.setCapability("apppackage","com.fp.cheapoair");
			capabilities.setCapability("appActivity",".Cheapoair");
			capabilities.setCapability("appWaitActivity",".Cheapoair");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
//}

	}

}
