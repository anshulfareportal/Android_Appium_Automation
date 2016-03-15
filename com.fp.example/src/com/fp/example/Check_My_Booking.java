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
public class Check_My_Booking{
	
	WritableWorkbook book;
	WritableWorkbook book1;
	
	
	testingapp tpa = testingapp.getInstance();
	
	public void Booking_Check() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception,NumberFormatException {
	
	//	tpa.testapp();
		Price_Check prc =	tpa.Check_My_booking();
		
//		String FilePath = "C:\\Test_Data.xls";
//		FileInputStream fs = new FileInputStream(FilePath);
//		Workbook wb = Workbook.getWorkbook(fs);
//		Sheet sheet = wb.getSheet(0);
	
	//	File excelFile = new File("C:\\Test_Data.xls");
		//Workbook existingBook = Workbook.getWorkbook(excelFile);
		//book = Workbook.createWorkbook(excelFile, existingBook);
		//WritableSheet sheet = book.getSheet("Sheet1");
		
		File excelFile = new File("C:\\Results\\Daily_Report\\Round_Trip.xls");
		Workbook existingBook = Workbook.getWorkbook(excelFile);
		book = Workbook.createWorkbook(excelFile, existingBook);
		WritableSheet sheet = book.getSheet("output");
		
				
		Label l1 = new Label(2, 2, prc.getCheck_Base_Price());
		sheet.addCell(l1);
		Label l2 = new Label(3, 2, prc.getCheck_Taxes());
		sheet.addCell(l2);
		Label l3 = new Label(5, 2, prc.getCheck_Instant_Discount());
		sheet.addCell(l3);
		Label l4 = new Label(6, 2, prc.getCheck_Total_Price());
		sheet.addCell(l4);

		
		File excelFile1 = new File("C:\\Results\\Daily_Report\\Daily_Sanity_Report_Android.xls");
		Workbook existingBook1 = Workbook.getWorkbook(excelFile1);
		book1 = Workbook.createWorkbook(excelFile1, existingBook1);
		WritableSheet sheet1 = book1.getSheet("Sheet1");
		
		
		if ((prc.getCheck_Base_Price()).equals (sheet.getCell(2,1).getContents()) && (prc.getCheck_Taxes()).equals (sheet.getCell(3,1).getContents()) && (prc.getCheck_Instant_Discount()).equals (sheet.getCell(5,1).getContents()) && (prc.getCheck_Total_Price()).equals (sheet.getCell(6,1).getContents())){
			
			System.out.println("Pass");
		
			Label l7 = new Label(7, 2, "Pass for Check My Booking");
			sheet.addCell(l7);
			
			Label l8 = new Label(4, 10, "Pass");
			sheet1.addCell(l8);
			
			}
			
			else
			{	
				System.out.println("Fail for Check My Booking");	
				Label l7 = new Label(7, 2, "Fail for Check My Booking");
				sheet.addCell(l7);
				
				Label l8 = new Label(4, 10, "Fail");
				sheet1.addCell(l8);
			
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
	
	