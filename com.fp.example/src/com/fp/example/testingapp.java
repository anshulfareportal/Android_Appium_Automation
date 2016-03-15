package com.fp.example;

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


public class testingapp {

	static WebDriver dr;
	DesiredCapabilities capabilities;
	//@BeforeTest
	
	private testingapp()
	{
		dr = null;
		capabilities = null;
	}
	
	public void testapp() throws MalformedURLException, InterruptedException {
		
		String contact = "1jyot";
				
		//File classpathRoot = new File(System.getProperty("use.dir"));
		//File appDir = new File(classpathRoot, "/app");
		//File app = new File(appDir, "CheapoAir_AirHotel_3.0.15.apk");
File app = new File("D:\\CheapoAir_AirHotel_3.0.36.apk");
		capabilities= new DesiredCapabilities();
		capabilities.setCapability("browserName", "");
	//	capabilities.setCapability("deviceName","lge-nexus_5-067004340ac6415c");
		//capabilities.setCapability("deviceName","motorola-nexus_6-ZX1G428LBP");
		capabilities.setCapability("deviceName","samsung-sm_n910g-641dd802");
		
		//capabilities.setCapability("deviceName","641dd802");	
		//	capabilities.setCapability("platformVersion","4.4.4");
				capabilities.setCapability("platformVersion","5.0.1");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("app",app.getAbsolutePath());
		capabilities.setCapability("apppackage","com.fp.cheapoair");
	
		//capabilities.setCapability("appActivity","com.fp.cheapoair.Air.View.FlightSearch.TravelersDetailsScreen");
		capabilities.setCapability("appActivity","com.fp.cheapoair.Cheapoair");
		//capabilities.setCapability("appWaitActivity",".Cheapoair");
	//	dr = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	//dr = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		System.out.println("fsghhhghjghjghjgf");
	}
	
	private static testingapp test = null;
	
	public static testingapp  getInstance()
	{
		if (test == null)
		{
			try
			{
				test = new testingapp();
				test.testapp();	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		else
		{
			return test;
		}
		
		return test;
	}
	//@Test(priority = 0)
	public void Search_Input() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		
		
		dr.findElement(By.name("Flights")).click();
		
		dr.findElement(By.name("Select \"From\" Airport")).click();
		
		//List<WebElement> textFieldsList = dr.findElements(By.className("android.widget.TextView")); 
	   //    int size = textFieldsList.size();
	   //   // dr.findElements(By.xpath("android.widget.TextView")).get(1).click();
	   //   // textFieldsList
	   //   // dr.findElements(By.className("android.widget.EditText")).sendKeys("fll");
		
		//Code to read from existing workbook
		String FilePath = "C:\\Test_Data.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(0);

		
		String start = sh.getCell(0,1).getContents();
		System.out.println(start);

		
		String destination = sh.getCell(1,1).getContents();
		System.out.println(destination);
		
	       dr.findElement(By.xpath("//android.widget.EditText[@text='Type Airport name...']")).sendKeys(start);
	      System.out.println("before wait");
	     dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	       System.out.println("after wait");
	       
	       dr.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout[2]")).click();
	       
	// dr.findElement(By.id("com.fp.cheapoair:id/car_loc_list_tv_landmark")).click();
	      // dr.findElement(By.xpath("//android.widget.ListView")).sendKeys("1");
	       dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	      dr.findElement(By.name("Select \"To\" Airport")).click();
	      dr.findElement(By.xpath("//android.widget.EditText[@text='Type Airport name...']")).sendKeys(destination);
	      System.out.println("before wait");
	      dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);


	       dr.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout[1]")).click();
	       
	}
	
//	@Test(priority = 1)
	public void Search_Date_Input() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	       
	       
	       dr.findElement(By.name("Depart")).click();
	      dr.findElement(By.id("com.fp.cheapoair:id/nextMonth")).click();
	     //  dr.findElement(By.id("com.fp.cheapoair:id/nextMonth")).click();
	  //    dr.findElement(By.id("com.fp.cheapoair:id/nextMonth")).click();
	      dr.findElement(By.xpath("//android.widget.TextView[@text='17']")).click();
		       
	      dr.findElement(By.id("com.fp.cheapoair:id/air_tvl_returndate_black_button_selected")).click();
	       dr.findElement(By.xpath("//android.widget.TextView[@text='18']")).click();
	     dr.findElement(By.name("Done")).click();
	     dr.findElement(By.name("Search")).click();
	     dr.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	       
	     //  List<WebElement> totalcount = dr.findElements(By.tagName("android.widget.ListView")); 
	       //int size1 = totalcount.size();
	       
	     //System.out.println("Total Count"+size1);
	     
	     //Random randomGenerator = new Random();
	    // int randomInt = randomGenerator.nextInt(size1);
	     
	   //  System.out.println("Total Count"+randomInt);
	    //   dr.findElement(By.xpath("//android.widget.ListView")).sendKeys(randomInt);
	     
	     //dr.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout")).sendKeys("2");
	  
	     
	}
	
//	@Test(priority = 2)
	public void Listing_Page() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	     
	     dr.findElement(By.xpath("//android.widget.ListView")).sendKeys("0");
	      
	     
	  //   dr.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
dr.findElement(By.name("Continue")).click();
 
	}
	@Test(priority = 3)
	
	public Price_Check Price_Page() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		System.out.println("gjggjjinsurance");
	     Price_Check prc = new Price_Check();
	     System.out.println("gjggjjinsurance");	 
	prc.setBase_Price(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_base_price_txt_adult")).getText());
	 prc.setTaxes(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_taxes_txt_adult")).getText());
	 prc.setProtection(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_insurance_adult")).getText());
	prc.setInstant_Discount(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_discount_amount")).getText());
	 
	   prc.setTotal_Price(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_total_charge_value")).getText());
	   System.out.println("gjggjjinsurance");
	   int L_no = prc.getBase_Price().length();
	   String Base_Price = prc.getBase_Price().substring(1,L_no);
	   prc.setBase_Price(Base_Price);
	   
	   int L_no1 = prc.getTaxes().length();
	   String Taxes = prc.getTaxes().substring(1,L_no1);
	   prc.setTaxes(Taxes);
	   
	   int L_no2 = prc.getProtection().length();
	   String Protection = prc.getProtection().substring(1,L_no2);
	   prc.setProtection(Protection);
	      
	   
	   int L_no3 = prc.getInstant_Discount().length();
	   String Instant_Discount = prc.getInstant_Discount().substring(2,L_no3);
	   prc.setInstant_Discount(Instant_Discount);
	   
	   int L_no4 = prc.getTotal_Price().length();
	   String Total_Price = prc.getTotal_Price().substring(1,L_no4);
	   prc.setTotal_Price(Total_Price);
	  
	   
	  
	  
	//  System.out.println("Price"+Base_Price);
	//  System.out.println("Tax"+Taxes);
	//  System.out.println("Insurance"+Protection);
	  //System.out.println("Instant"+Instant_Discount);
	//  System.out.println("Total_Price"+Total_Price);
		
		System.out.println("gjggjjinsurance");

 return prc;
 
	}
	
	@Test(priority = 4)
	public Price_Check Travel_Assist_Value_Check() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		Price_Check prc = new Price_Check();
		
		prc.setTravel_Assist_Text_Value(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_travel_assist_price_label")).getText());
		  
		dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_trvl_assist_toggle_btn")).click();
		
		 prc.setTaxes_With_Assist(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_taxes_txt_adult")).getText());
			
		int L_no4 = prc.getTaxes_With_Assist().length();
		   String Taxes_With_Assist = prc.getTaxes_With_Assist().substring(1,L_no4);
		   prc.setTaxes_With_Assist(Taxes_With_Assist);
		
	return prc;	
	
	}
	
	@Test(priority = 5)
	
	public Price_Check Promo_Code() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		Price_Check prc = new Price_Check();
	dr.findElement(By.name("Apply Promo Code")).click();
	  
	dr.findElement(By.id("com.fp.cheapoair:id/edittext_promocode")).sendKeys("ny15");
	((AppiumDriver) dr).hideKeyboard();
	dr.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);  
	dr.findElement(By.name("Submit")).click();
	
	dr.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	try
	{
		Thread.sleep(30000);
		
	}
	catch(Exception e)
	{
			
	}
			
	prc.setPromo_Value(dr.findElement(By.id("android:id/message")).getText());
		int L_no4 = prc.getPromo_Value().length();
	    String Promo_Value = prc.getPromo_Value().substring(1,L_no4);
	    prc.setPromo_Value(Promo_Value);
	
	
	 dr.findElement(By.name("Apply")).click();
	 
	 prc.setInstant_Total_Discount(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_discount_amount")).getText());
	 prc.setTotal_Price_with_Promo_Discount(dr.findElement(By.id("com.fp.cheapoair:id/air_flt_prc_total_charge_value")).getText());
	 
	 
	 int L_no5 = prc.getInstant_Total_Discount().length();
	    String Instant_Total_Discount = prc.getInstant_Total_Discount().substring(1,L_no5);
	    prc.setInstant_Total_Discount(Instant_Total_Discount);
	    
	    int L_no6 = prc.getTotal_Price_with_Promo_Discount().length();
	    String Total_Price_with_Promo_Discount = prc.getTotal_Price_with_Promo_Discount().substring(1,L_no6);
	    prc.setTotal_Price_with_Promo_Discount(Total_Price_with_Promo_Discount);
	 
	return prc;
	}
	
	@Test(priority = 4)
	public void Navigation_From_Price_to_Travel() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		dr.findElement(By.name("Continue")).click();
	
	}
	
	
	
	@Test(priority = 5)
	
	public void Travel_Page() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	  
	  dr.findElement(By.xpath("//android.widget.EditText[@text='First Name*']")).sendKeys("Eric");
	  dr.findElement(By.xpath("//android.widget.EditText[@text='Middle Name']")).sendKeys("S");
	  dr.findElement(By.xpath("//android.widget.EditText[@text='Last Name*']")).sendKeys("spencer");
	  
	  //dr.findElement(By.id("com.fp.cheapoair:id/basescreen_bottom_right")).click();
	//  dr.findElement(By.id("com.fp.cheapoair:id/basescreen_bottom_right")).click();
	//  dr.findElement(By.id("com.fp.cheapoair:id/basescreen_bottom_right")).click();
	dr.findElement(By.id("com.fp.cheapoair:id/air_trvl_det_detail_DOB")).click();
	  dr.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	 
	//dr.findElement(By.xpath("//android.widget.FrameLayout/android.widget.Button")).click();
      
	  
 // dr.findElement(By.name("Done")).click();
	
//dr.findElement(By.name("Done")).click();
	  
	  dr.findElement(By.id("com.fp.cheapoair:id/air_trvl_det_detail_gender")).click();
	  dr.findElement(By.name("Male")).click();
	  
	 
	
	//  Alert alert = dr.switchTo().alert();
 // System.out.println("qqqqqqq");
//	  alert.accept(); 
//	  
//	  dr.switchTo().activeElement().click();
//	  
//	//  dr.switchTo().frame(ParentFrame).switchTo().frame(ChildFrame);
//	  
//	dr.switchTo().frame("android.widget.DatePicker");
//	System.out.println("qqqqqqq");

	  
		// var day1=dr.findElement(By.className("android.widget.DatePicker"));
		  
		// dr.findElement(By.id("android:id/day")); day1.clear(); day1.sendKeys("05");
		
	  

System.out.println("qqqqqqq");

dr.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);



	}
	
	
public void Additional_Traveler_Details() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
	
		 dr.findElement(By.id("com.fp.cheapoair:id/air_trvl_det_detail_additional_requests_dropdown")).click();
		 
		 dr.findElement(By.id("com.fp.cheapoair:id/air_trvl_det_detail_spinner_seat_pref")).click();
		 dr.findElement(By.name("Aisle seat")).click();

		 dr.findElement(By.id("com.fp.cheapoair:id/air_trvl_det_detail_spinner_meal_pref")).click();
		 dr.findElement(By.name("Bland meal")).click();
		 
		 dr.findElement(By.id("com.fp.cheapoair:id/air_trvl_det_detail_spinner_special_service")).click();
		 dr.findElement(By.name("Deaf passenger")).click();
		 
		  
		  
	
	}
	
public void Navigation_From_Travel_to_Payment() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		dr.findElement(By.name("Continue")).click();
	
	}
	
	
	
	@Test(priority = 6)
	public void Payment_Page() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		

dr.findElement(By.id("com.fp.cheapoair:id/air_pmt_dtl_credit_card_type")).click();
dr.findElement(By.name("VISA")).click();



//dr.findElement(By.name("Credit Card No.*")).sendKeys("4222222222222");
//dr.findElement(By.name("Name on Credit Card*")).sendKeys("eric west");
//dr.findElement(By.name("CCV*")).sendKeys("111");
//dr.findElement(By.name("Address 1*")).sendKeys("123 main street");
//dr.findElement(By.name("City*")).sendKeys("new york");
//dr.findElement(By.name("ZIP*")).sendKeys("10001");
//dr.findElement(By.name("Billing Phone*")).sendKeys("2124780325");
//dr.findElement(By.name("Email Address*")).sendKeys("anshuljain@fareportal.com");


dr.findElement(By.xpath("//android.widget.EditText[@text='Credit Card No.*']")).sendKeys("4222222222222");
dr.findElement(By.xpath("//android.widget.EditText[@text='Name on Credit Card*']")).sendKeys("eric west");
//dr.findElement(By.id("com.fp.cheapoair:id/basescreen_bottom_right")).click();

dr.findElement(By.id("com.fp.cheapoair:id/air_pmt_dtl_card_validate_date")).click();

try
{
	Thread.sleep(10000);
	
}
catch(Exception e)
{
		
}



//dr.findElement(By.name("Set")).click();
//dr.findElement(By.name("Set")).click();

//Point var2 = dr.findElement(By.name("Set")).getLocation();


//String var2 = dr.findElement(By.name("Set")).getText();
//


//dr.findElement(By.xpath("//android.widget.Button")).sendKeys("Set");

//dr.findElement(By.name("Set")).click();

//dr.findElement(By.id("com.fp.cheapoair:id/button_set")).click();

//dr.findElement(By.xpath("//android.widget.EditText[@text='Expiration Date*']")).sendKeys("05/2015");

//dr.findElement(By.id("com.fp.cheapoair:id/air_pmt_dtl_card_validate_date")).click();
//
//dr.findElement(By.name("Set")).click();
//dr.findElement(By.name("Set")).click();
//dr.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")).click();
//
//dr.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[0]")).click();
//dr.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")).click();

//dr.findElement(By.name("Set")).click();
//dr.findElement(By.xpath("//android.widget.LinearLayout/android.widget.Button[0]")).click();
//dr.findElement(By.className("android.widget.Button")).click();
//dr.findElement(By.id("com.fp.cheapoair:id/button_Set")).click();
//dr.findElement(By.className("android.widget.Button")).click();
//dr.findElement(By.name("Set")).click();
//dr.findElement(By.xpath("//android.widget.Button")).sendKeys("Set");
//
//
//dr.findElement(By.name("Cancel")).click();
//dr.findElement(By.id("com.fp.cheapoair:id/button_cancel")).click();
//dr.findElement(By.xpath("//android.widget.LinearLayout/android.widget.Button[1]")).click();

dr.findElement(By.xpath("//android.widget.EditText[@text='CCV*']")).sendKeys("111");
dr.findElement(By.id("com.fp.cheapoair:id/basescreen_bottom_right")).click();
dr.findElement(By.xpath("//android.widget.EditText[@text='Address 1*']")).sendKeys("123 main street");
((AppiumDriver) dr).swipe(400, 600, 400, 100, 1000);

dr.findElement(By.xpath("//android.widget.EditText[@text='City*']")).sendKeys("new york");

dr.findElement(By.xpath("//android.widget.EditText[@text='ZIP*']")).sendKeys("10001");


((AppiumDriver) dr).swipe(400, 600, 400, 100, 1000);


dr.findElement(By.id("com.fp.cheapoair:id/air_pmt_dtl_country")).click();
dr.findElement(By.name("United States")).click();

dr.findElement(By.id("com.fp.cheapoair:id/air_pmt_dtl_stateUSOrCanada")).click();
dr.findElement(By.name("NY - NEW YORK, US")).click();


dr.findElement(By.xpath("//android.widget.EditText[@text='Billing Phone*']")).sendKeys("2124780325");

((AppiumDriver) dr).swipe(400, 600, 400, 100, 1000);

dr.findElement(By.xpath("//android.widget.EditText[@text='Email Address*']")).sendKeys("anshuljain@fareportal.com");
((AppiumDriver) dr).swipe(400, 600, 400, 100, 1000);
dr.findElement(By.xpath("//android.widget.EditText[@text='Re-type Email*']")).sendKeys("anshuljain@fareportal.com");


((AppiumDriver) dr).swipe(400, 600, 400, 100, 1000);

dr.manage().timeouts().implicitlyWait(320,TimeUnit.SECONDS);

((AppiumDriver) dr).hideKeyboard();

dr.findElement(By.name("Book")).click();

}

	public Price_Check Booking_Conf_Page() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
	
			System.out.println("Enter in nrw");
			Price_Check prc = new Price_Check();
			prc.setBooking_No(dr.findElement(By.id("com.fp.cheapoair:id/air_book_cnf_booking_no")).getText());
			
			
			return prc;
		}

	public void Back_From_Price_Page() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		dr.navigate().back();
		dr.navigate().back();
		dr.navigate().back();
		dr.navigate().back();
		
	
	}

	

	//  dr.findElement(By.xpath("//android.widget.EditText[@text='Last Name*']")).clear();
	//  dr.findElement(By.id("com.fp.cheapoair:id/air_trvl_det_detail_DOB")).click();
	 
	  
	  //dr.switchTo().frame("android.widget.DatePicker");
	  
	// var day1=dr.findElement(By.className("android.widget.DatePicker"));
	  
	//  dr.findElement(By.id("android:id/day")); day1.clear(); day1.sendKeys("05");
	
	 // List<WebElement> pick = dr.findElements(By.className("android.widget.NumberPicker"));           

	  
      //pick.get(0).sendKeys("Apr");
      //pick.get(1).sendKeys("20");
      //pick.get(2).sendKeys("1989");
      
     // Runtime.getRuntime().exec("adb shell date -s 19801110.121212");
	  
	  //  dr.switchTo().frame("android.widget.FrameLayout").switchTo().frame("android.widget.LinearLayout");
	  
	  //dr.switchTo().frame("Gender");

	// dr.findElement(By.id("button1")).click();
	//  dr.switchTo().frame("Gender");
	//  dr.findElement(By.name("Done")).click();
	//  dr.findElement(By.name("Gender*")).click();
	  
	//  dr.findElement(By.xpath("//android.widget.ListView")).sendKeys("1");
	  
	//  dr.switchTo().frame("Gender");

		
	  
	  	public Price_Check Flight_Watcher() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
			Price_Check prc = new Price_Check();		
			((AppiumDriver) dr).swipe(400, 600, 400, 100, 1000);
			
			dr.findElement(By.name("Add Flight Watcher")).click();
			dr.findElement(By.id("com.fp.cheapoair:id/air_flt_watcher_notification_type_drop_down")).click();
			dr.findElement(By.name("Email")).click();
			dr.findElement(By.xpath("//android.widget.EditText[@text='Email*']")).sendKeys("anshuljain@fareportal.com");
			((AppiumDriver) dr).hideKeyboard();
			dr.findElement(By.name("Subscribe")).click();
			try
			{
				Thread.sleep(20000);
				
			}
			catch(Exception e)
			{
					
			}
			prc.setFlight_Watcher_Alert_Message(dr.findElement(By.id("android:id/message")).getText());
			System.out.println("Enter in nrw");
			dr.findElement(By.name("OK")).click();
			 return prc;
			
		}
	
	  	public Price_Check Get_Travelers_Details() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
			Price_Check prc = new Price_Check();		
						
			dr.findElement(By.name("Review Booking Details")).click();
			dr.findElement(By.name("Traveler Details")).click();
			prc.setTraveler_Name_At_Post_Booking(dr.findElement(By.id("com.fp.cheapoair:id/air_book_cnf_flt_det_passenger_name")).getText());
			prc.setSeat_Preference(dr.findElement(By.id("com.fp.cheapoair:id/air_book_cnf_flt_det_seat_preference_value")).getText());
			prc.setMeal_Preference(dr.findElement(By.id("com.fp.cheapoair:id/air_book_cnf_flt_det_meal_preference_value")).getText());
			prc.setAdditional_Preference(dr.findElement(By.id("com.fp.cheapoair:id/air_book_cnf_flt_det_special_service_value")).getText());
			dr.navigate().back();
			dr.navigate().back();	
			dr.findElement(By.name("Home")).click();
			return prc;
			
		}
	  	
	  	public Price_Check Baggage_Validation_Message() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
			Price_Check prc = new Price_Check();		
						
			dr.findElement(By.name("Add Baggage")).click();
			dr.findElement(By.id("com.fp.cheapoair:id/air_add_baggage_checkbox")).click();
			dr.findElement(By.id("com.fp.cheapoair:id/air_add_baggage_checkbox")).click();
			
			
			dr.findElement(By.name("Next Flight")).click();
			prc.setFlight_Watcher_Alert_Message(dr.findElement(By.id("com.fp.cheapoair:id/air_add_baggage_popup_text")).getText());
			dr.findElement(By.name("Continue")).click();
			dr.findElement(By.name("Confirm")).click();
			prc.setFlight_Watcher_Alert_Message(dr.findElement(By.id("com.fp.cheapoair:id/air_add_baggage_popup_text")).getText());
			dr.findElement(By.name("Exit")).click();
			
			return prc;
			//dr.findElement(By.name("Home")).click();
			
		}
	  	
	  	public Price_Check Check_My_booking() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
			Price_Check prc = new Price_Check();		
			dr.findElement(By.name("My Bookings")).click();
			dr.findElement(By.xpath("//android.widget.EditText[@text='Email Address*']")).sendKeys("anshuljain@fareportal.com");
			dr.findElement(By.id("com.fp.cheapoair:id/chk_my_book_home_passenger_name")).sendKeys("spencer");
			dr.findElement(By.xpath("//android.widget.EditText[@text='Last 4 digits of phone # or zip*']")).sendKeys("0325");
			((AppiumDriver) dr).hideKeyboard();
			dr.findElement(By.name("Submit")).click();
			dr.findElement(By.id("com.fp.cheapoair:id/ticketForwardItemsRelativeLayout")).click();
			dr.findElement(By.name("Review Booking Details")).click();
			dr.findElement(By.name("Price Details")).click();
			prc.setCheck_Base_Price(dr.findElement(By.id("com.fp.cheapoair:id/air_conf_flt_prc_base_price_txt_adult")).getText());
			prc.setCheck_Taxes(dr.findElement(By.id("com.fp.cheapoair:id/air_conf_flt_prc_taxes_txt_adult")).getText());
			prc.setCheck_Instant_Discount(dr.findElement(By.id("com.fp.cheapoair:id/air_conf_flt_prc_total_promotion_value")).getText());
			prc.setCheck_Total_Price(dr.findElement(By.id("com.fp.cheapoair:id/air_conf_flt_prc_total_charge_value")).getText());
			dr.findElement(By.name("Done")).click();
			dr.findElement(By.name("Done")).click();
			
			int L_no = prc.getCheck_Base_Price().length();
			   String Check_Base_Price = prc.getCheck_Base_Price().substring(1,L_no);
			   prc.setCheck_Base_Price(Check_Base_Price);
			   
			   int L_no1 = prc.getCheck_Taxes().length();
			   String Check_Taxes = prc.getCheck_Taxes().substring(1,L_no1);
			   prc.setCheck_Taxes(Check_Taxes);
			   
			   int L_no2 = prc.getCheck_Instant_Discount().length();
			   String Check_Instant_Discount = prc.getCheck_Instant_Discount().substring(2,L_no2);
			   prc.setCheck_Instant_Discount(Check_Instant_Discount);
			   
			   int L_no3 = prc.getCheck_Total_Price().length();
			   String Check_Total_Price = prc.getCheck_Total_Price().substring(1,L_no3);
			   prc.setCheck_Total_Price(Check_Total_Price);
			
			return prc;
			//dr.findElement(By.name("Home")).click();
			
		}
	  	
	  	public Price_Check Android_Feedback() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
				Price_Check prc = new Price_Check();		
							
				dr.findElement(By.name("More Options")).click();
				dr.findElement(By.name("Feedback")).click();
				
				dr.findElement(By.id("com.fp.cheapoair:id/feedback_email")).sendKeys("anshuljain@fareportal.com");
				dr.findElement(By.id("com.fp.cheapoair:id/feedback_name")).sendKeys("test tester");
				dr.findElement(By.id("com.fp.cheapoair:id/feedback_comments")).sendKeys("This is test feedback. Please ignore.");
				((AppiumDriver) dr).hideKeyboard();
				dr.findElement(By.name("Submit")).click();
				prc.setConfirmation_Alert_Message(dr.findElement(By.id("android:id/message")).getText());
				dr.findElement(By.name("OK")).click();
				return prc;
				//dr.findElement(By.name("Home")).click();
				
			}
		  	
	  	
	  	public Price_Check User_Sign_in() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
			Price_Check prc = new Price_Check();		
						
			dr.findElement(By.name("More Options")).click();
			dr.findElement(By.name("Customer Profile")).click();
			
			dr.findElement(By.id("com.fp.cheapoair:id/home_user_profile_singnin_email")).sendKeys("anshuljain@fareportal.com");
			dr.findElement(By.id("com.fp.cheapoair:id/home_user_profile_singnin_password")).sendKeys("fareportal6");
			((AppiumDriver) dr).hideKeyboard();
			dr.findElement(By.name("Sign In")).click();
			//prc.setSign_in_Title(dr.findElement(By.id("com.fp.cheapoair:id/basescreen_screenheading")).getText());
			dr.findElement(By.id("com.fp.cheapoair:id/basescreen_global_signin")).click();
			dr.findElement(By.name("Yes")).click();
			return prc;
			//dr.findElement(By.name("Home")).click();
			
		}
	public float floatRoundOff(float value) {
        BigDecimal a = new BigDecimal(value);
        BigDecimal roundOff = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        String s = roundOff.toString();
        return Float.valueOf(s); 
	}
	

//	@BeforeTest
//	public void Instance_Close() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
//		book.write();
//		book.close();
//	}
}



