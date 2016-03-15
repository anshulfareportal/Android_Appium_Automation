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

@Test
public class Total_Price_Check {
	WritableWorkbook book;
	WritableWorkbook book1;
	
	testingapp tpa = testingapp.getInstance();
	public void Price_Check1() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception,NumberFormatException {
		
		//tpa.testapp();
		tpa.Search_Input();
		tpa.Search_Date_Input();
		tpa.Listing_Page();
		Price_Check prc =	tpa.Price_Page();
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		FileOutputStream f = new FileOutputStream("C:\\Results\\Total_Price_Check" + timeStamp + ".xls",true);
	    book = Workbook.createWorkbook(f); 
	    WritableSheet sheet = book.createSheet("output", 0);
			
						
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
				
		float BP = tpa.floatRoundOff(Float.parseFloat(prc.getBase_Price()));
		float Taxes = tpa.floatRoundOff(Float.parseFloat(prc.getTaxes()));
		float Protection = tpa.floatRoundOff(Float.parseFloat(prc.getProtection()));
		float Instant_Discount = tpa.floatRoundOff(Float.parseFloat(prc.getInstant_Discount()));
		float Total_Price = tpa.floatRoundOff(Float.parseFloat(prc.getTotal_Price()));
			  
		
		System.out.println(BP);
		System.out.println(Taxes);
		System.out.println(Protection);
		System.out.println(Instant_Discount);
		System.out.println(Total_Price);
		System.out.println((BP + Taxes + Protection - Instant_Discount));
		
		File excelFile = new File("C:\\Results\\Daily_Report\\Daily_Sanity_Report_Android.xls");
		Workbook existingBook = Workbook.getWorkbook(excelFile);
		book1 = Workbook.createWorkbook(excelFile, existingBook);
		 WritableSheet sheet1 = book1.getSheet("Sheet1");
		

		if (tpa.floatRoundOff((BP + Taxes + Protection - Instant_Discount)) == Total_Price){
		
		System.out.println("Pass");
	
		Label l6 = new Label(7, 1, "Pass");
		sheet.addCell(l6);
		

		Label l8 = new Label(4, 6, "Pass");
			sheet1.addCell(l8);
		
		}
		
		else{	
			System.out.println("Fail");	
			
			Label l6 = new Label(7, 1, "Fail");
			sheet.addCell(l6);
			
			
			Label l8 = new Label(4, 6, "Fail");
				sheet1.addCell(l8);
		
		}
		
		prc =	tpa.Travel_Assist_Value_Check();
		
		float Taxes_With_Assist = tpa.floatRoundOff(Float.parseFloat(prc.getTaxes_With_Assist()));
		
		System.out.println(prc.getTravel_Assist_Text_Value());
		System.out.println(tpa.floatRoundOff(Taxes_With_Assist - Taxes));

		
		if ((prc.getTravel_Assist_Text_Value()).equals("($14.95)") &&   (tpa.floatRoundOff(Taxes_With_Assist - Taxes) ==(float) 14.95)){
			
			System.out.println("Pass");
		
			Label l7 = new Label(8, 1, "Pass");
			sheet.addCell(l7);
			
			Label l9 = new Label(4, 7, "Pass");
			sheet1.addCell(l9);
			
			}
			
			else{	
				System.out.println("Fail");	
				
				Label l7 = new Label(8, 1, "Fail");
				sheet.addCell(l7);
				
				Label l9 = new Label(4, 7, "Pass");
				sheet1.addCell(l9);
			
			}
		
	tpa.Back_From_Price_Page();
		
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
