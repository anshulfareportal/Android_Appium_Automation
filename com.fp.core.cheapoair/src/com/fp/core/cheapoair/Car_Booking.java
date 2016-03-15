package com.fp.core.cheapoair;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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
import org.openqa.selenium.android.AndroidDriver;
//import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.io.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//import com.fp.example.Price_Check;
import com.thoughtworks.selenium.Wait;

import static org.testng.Assert.assertEquals;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
@Test
public class Car_Booking {
	Workbook wb;
	WritableWorkbook book;
	WritableWorkbook book1;
	Function_File RT = Function_File.getInstance();

	//Function_File RT = new Function_File();
	

	/**
	 * @param args
	 */
	
	public void Car_Script() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		
		
	//common line for read and write in existing workbook
		File File_Path = new File("C:\\Excel_File\\Car_Test_Data.xls");	
		File File_Path1 = new File("C:\\Excel_File\\Daily_Sanity_Report_Android.xls");	
		File New_File_Path = new File("C:\\Excel_File\\Car_Trip.xls");	
		
		//File New_File_Path = new File("C:\\Excel_File\\Round_Trip.xls");	
		
		
		//Code to read from existing workbook
				FileInputStream fs = new FileInputStream(File_Path);
				wb = Workbook.getWorkbook(fs);
				Sheet sh = wb.getSheet(0);

					
					
				String start = sh.getCell(0,1).getContents();
				System.out.println(start);

				
				
				//String First_Name = sh.getCell(24,1).getContents();
			//	String Last_Name = sh.getCell(25,1).getContents();
			//	String Email_ID = sh.getCell(23,1).getContents();
		
				//Code to write in existing workbook
		
				//Workbook existingBook = Workbook.getWorkbook(File_Path);
				
				if (New_File_Path.exists()) {
			        
			        New_File_Path.delete();
			          
			        }
			       
			    book = Workbook.createWorkbook(New_File_Path, wb);
				WritableSheet sheet = book.getSheet("Sheet1");
				
				Workbook existingBook1 = Workbook.getWorkbook(File_Path1);
				book1 = Workbook.createWorkbook(File_Path1, existingBook1);
				WritableSheet sheet1 = book1.getSheet("Sheet1");
		
				sheet.addCell(new Label(2, 0, "Car Estimate Price"));
				sheet.addCell(new Label(3, 0, "Payable Now"));
				sheet.addCell(new Label(4, 0, "Status"));
				
				
RT.Car_Search(start);
RT.Car_Listing();

				
Car_Price_Variable Car_Price_Var = RT.Car_Pricing();
		
		  /* String l1 = var.getBase_Price();
			System.out.println(l1);
			 String l2 = var.getTaxes();
				System.out.println(l2);
				 String l3 = var.getSub_Total();
					System.out.println(l3);
					 String l4 = var.getInstant_Discount();
						System.out.println(l4);
					String l5 = var.getTotal_Price();
						System.out.println(l5); */
						
		
						
				sheet.addCell(new Label(2, 1, Car_Price_Var.getEstimate_Price()));
				sheet.addCell(new Label(3, 1, Car_Price_Var.getPayable_Now_Price()));
				sheet1.addCell(new Label(2, 4, Car_Price_Var.getEstimate_Price()));
				
	
		
					//	RT.Promo_Code();
					RT.Car_Travel();
					RT.Payment_Page();
					
		
/*if((Post_Traveler_Var.getTraveler_Name_Post_Booking()).equals(First_Name + " " + "M" + " " + Last_Name))
			
		{
		System.out.println("Pass");
		sheet.addCell(new Label(10, 1, "Pass"));
		sheet1.addCell(new Label(4, 5, "Pass"));
		}
		
		else
		{
			System.out.println("Fail");
			sheet.addCell(new Label(10, 1, "Fail"));
			sheet1.addCell(new Label(4, 5, "Fail"));
		}
	*/

		
		System.out.println(Car_Price_Var.getEstimate_Price());
		System.out.println(Car_Price_Var.getPayable_Now_Price());
	
			
	
				
		//RT.Back_Three_Navigation();	
		//RT.Comman_Back_Function();
	}
	
	
	@AfterClass
	public void Instance_Close() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	//	RT.Driver_Close();
		
	if (book!=null)
		{
		System.out.println("out of excel varibales from RP");
		
		
		book.write();
		book.close();
		

		book1.write();
		book1.close();
		
		wb.close();
			
		}
	
	
	}	
	
}