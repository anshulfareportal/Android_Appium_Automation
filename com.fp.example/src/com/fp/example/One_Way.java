package com.fp.example;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.io.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Wait;

import static org.testng.Assert.assertEquals;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@Test
public class One_Way{
	
	WritableWorkbook book;
	WritableWorkbook book1;
	
	testingapp tpa = testingapp.getInstance();
	//testingapp tpa = new testingapp();
	
	public void Round_Trip_Script() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception,NumberFormatException {
	
		tpa.testapp();
		tpa.Search_Input();   
		tpa.Search_Date_Input();
		tpa.Listing_Page();
		Price_Check prc =	tpa.Price_Page();
		
			
		FileOutputStream f = new FileOutputStream("C:\\Results\\Daily_Report\\Round_Trip.xls",true);
	      book = Workbook.createWorkbook(f); 
	     WritableSheet sheet = book.createSheet("output", 0);
	     
	    
		
	       Label T1 = new Label(2, 0, "Base Price");
			sheet.addCell(T1);
			Label T2 = new Label(3, 0, "Taxes");
			sheet.addCell(T2);
			Label T3 = new Label(4, 0, "Protection");
			sheet.addCell(T3);
			Label T4 = new Label(5, 0, "Instant Discount");
			sheet.addCell(T4);
			Label T5 = new Label(6, 0, "Total Price");
			sheet.addCell(T5);  
			Label T6 = new Label(7, 0, "Stauts");
			sheet.addCell(T6);   
       	  
	       
	       Label l1 = new Label(2, 1, prc.getBase_Price());
		sheet.addCell(l1);
		Label l2 = new Label(3, 1, prc.getTaxes());
		sheet.addCell(l2);
		Label l3 = new Label(4, 1, prc.getProtection());
		sheet.addCell(l3);
		Label l4 = new Label(5, 1, prc.getInstant_Discount());
		sheet.addCell(l4);
		Label l5 = new Label(6, 1, prc.getTotal_Price());
		sheet.addCell(l5);
		
		tpa.Navigation_From_Price_to_Travel();
		tpa.Travel_Page();
		tpa.Additional_Traveler_Details();
		tpa.Navigation_From_Travel_to_Payment();
		tpa.Payment_Page();
		prc = tpa.Booking_Conf_Page();
		
		Label l6 = new Label(7, 1, prc.getBooking_No());
		sheet.addCell(l6);
		
		int L_no4 = prc.getBooking_No().length();
		
		File excelFile = new File("C:\\Results\\Daily_Report\\Daily_Sanity_Report_Android.xls");
		Workbook existingBook = Workbook.getWorkbook(excelFile);
		book1 = Workbook.createWorkbook(excelFile, existingBook);
		WritableSheet sheet1 = book1.getSheet("Sheet1");
		
		
		
		if (L_no4 == 8){
			
			System.out.println("Pass");
		
			Label l7 = new Label(8, 1, "Pass");
			sheet.addCell(l7);
			
			Label l8 = new Label(4, 2, "Pass");
			sheet1.addCell(l8);
			
			
			}
			
			else
			{	
				System.out.println("Fail");	
				Label l7 = new Label(8, 1, "Fail");
				sheet.addCell(l7);
				
				Label l8 = new Label(4, 2, "Fail");
				sheet1.addCell(l8);
			
			}
		
		prc = tpa.Flight_Watcher();
		
			if ((prc.getFlight_Watcher_Alert_Message()).equals ("You're all set up with Flight Watcher! Now you'll receive updates on your flight right in your email inbox.")){
			
			System.out.println("Pass for Flight Watcher");
		
			Label l9 = new Label(9, 1, "Pass");
			sheet.addCell(l9);
			
			Label l10 = new Label(4, 3, "Pass");
			sheet1.addCell(l10);
			
			}
			
			else
			{	
				System.out.println("Fail for Flight Watcher");	
				Label l9 = new Label(9, 1, "Fail");
				sheet.addCell(l9);
				
				Label l10 = new Label(4, 3, "Fail");
				sheet1.addCell(l10);
			
			}
			
			prc = tpa.Get_Travelers_Details();
			
			if ((prc.getTraveler_Name_At_Post_Booking()).equals ("Eric S spencer") && (prc.getSeat_Preference()).equals ("Aisle seat") && (prc.getMeal_Preference()).equals ("Bland meal") && (prc.getAdditional_Preference()).equals ("Deaf passenger")){
				
				System.out.println("Pass for Additional Traveler Details");
			
				Label l11 = new Label(10, 1, "Pass for Additional Traveler Details");
				sheet.addCell(l11);
				
				Label l12 = new Label(4, 4, "Pass");
				sheet1.addCell(l12);
				
				Label l13 = new Label(4, 5, "Pass");
				sheet1.addCell(l13);
				
				}
				
				else
				{	
					System.out.println("Fail for Additional Traveler Details");	
					Label l11 = new Label(10, 1, "Fail for Additional Traveler Details");
					sheet.addCell(l11);
					
					Label l12 = new Label(4, 4, "Fail");
					sheet1.addCell(l12);
					
					Label l13 = new Label(4, 5, "Fail");
					sheet1.addCell(l13);
				
				}
		
		
	
	}

	@AfterTest
		public void Instance_Close() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
		if (book!=null)
			{
			System.out.println("fdfd");
			
			book.write();
			book.close();
			
			book1.write();
			book1.close();
			}
		}	
	
	
	
}
	
	