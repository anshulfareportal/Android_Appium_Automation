package com.fp.example;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class User_Profile_Sign_In{
	
	WritableWorkbook book;
	WritableWorkbook book1;
	
	
	testingapp tpa = testingapp.getInstance();
	
	public void Sign_in() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception,NumberFormatException {
	
	//	tpa.testapp();
		Price_Check prc =	tpa.Android_Feedback();
		
	
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		FileOutputStream f = new FileOutputStream("C:\\Results\\Android-Feedback" + timeStamp + ".xls",true);
	    book = Workbook.createWorkbook(f); 
	    WritableSheet sheet = book.createSheet("output", 0);
						
		
		Label l1 = new Label(2, 1, prc.getConfirmation_Alert_Message());
		sheet.addCell(l1);
		
		
		File excelFile1 = new File("C:\\Results\\Daily_Report\\Daily_Sanity_Report_Android.xls");
		Workbook existingBook1 = Workbook.getWorkbook(excelFile1);
		book1 = Workbook.createWorkbook(excelFile1, existingBook1);
		WritableSheet sheet1 = book1.getSheet("Sheet1");
		
		
		if ((prc.getConfirmation_Alert_Message()).equals ("Thanks for your feedback.")){
			
			System.out.println("Pass");
		
			Label l7 = new Label(3, 1, "Pass for Feedback");
			sheet.addCell(l7);
			
			Label l8 = new Label(4, 11, "Pass");
			sheet1.addCell(l8);
			
			}
			
			else
			{	
			
				Label l7 = new Label(3, 1, "Fail for feedback");
				sheet.addCell(l7);
				
				Label l8 = new Label(4, 11, "Fail");
				sheet1.addCell(l8);
			
		}
		
			
	}

	@AfterTest
		public void Instance_Close() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
			
		if (book!=null)
			{
				
			book.write();
			book.close();
			
			book1.write();
			book1.close();
			}
		}	
	
	
	
}
	
	