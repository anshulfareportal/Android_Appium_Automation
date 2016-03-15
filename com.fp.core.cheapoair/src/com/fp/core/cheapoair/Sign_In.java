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

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
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
public class Sign_In{
	WritableWorkbook book;
	WritableWorkbook book1;
	Workbook wb;
	Function_File RT = Function_File.getInstance();
	//Function_File RT = new Function_File();
	//float Ins_Discount;
	
	/**
	 * @param args
	 */
	public void Login() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	//common line for read and write in exisiting workbook
		File File_Path = new File("C:\\Excel_File\\Test_Data.xls");	
		File File_Path1 = new File("C:\\Excel_File\\Daily_Sanity_Report_Android.xls");
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File New_File_Path = new File("C:\\Excel_File\\Results\\Sign_In" + timeStamp + ".xls");	
		
		//Code to read from existing workbook
				FileInputStream fs = new FileInputStream(File_Path);
				wb = Workbook.getWorkbook(fs);
				Sheet sh = wb.getSheet(0);
		
				//Code to write in existing workbook
		
				//Workbook existingBook = Workbook.getWorkbook(File_Path);
				book = Workbook.createWorkbook(New_File_Path, wb);
				WritableSheet sheet = book.getSheet("Sheet1");
				
				Workbook existingBook1 = Workbook.getWorkbook(File_Path1);
				book1 = Workbook.createWorkbook(File_Path1, existingBook1);
				WritableSheet sheet1 = book1.getSheet("Sheet1");
		
		//RT.testapp();
		RT.Menu_Navigation();
		Sign_In_Variables Sign_In_Var =  RT.Sign_In_Page();
		 
		 		 
		 if(Sign_In_Var.getSign_Out_Text().equals("Sign Out"))
		 {
			 sheet.addCell(new Label(2, 1, "Sign In Sucessfully")); 
		}
		 
		 else
		 {
			 sheet.addCell(new Label(2, 1, "Sign In not Sucessfully")); 
		 }
		
				 
		 RT.Sign_Out();
		 RT.Menu_Navigation();
		 Sign_In_Var =  RT.Get_Text_After_Sign_Out();
		 
		 if(Sign_In_Var.getSign_In_Text().equals("Sign In"))
		 {
			 sheet.addCell(new Label(3, 1, "Sign In Sucessfully")); 
			 sheet1.addCell(new Label(4, 8, "Pass")); 
		 }
		 
		 else
		 {
			 sheet.addCell(new Label(3, 1, "Sign In not Sucessfully")); 
			 sheet1.addCell(new Label(4, 8, "Fail")); 
		 }
		 
		 
		 RT.Back_One_Navigation();
	
		  
	

	}
	
	@AfterClass
	public void Instance_Close() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	if (book!=null)
		{
		System.out.println("out of sign in varibales");
		
		book.write();
		book.close();
		

		book1.write();
		book1.close();
		wb.close();
			
		}
	
	
	}	
	
}
