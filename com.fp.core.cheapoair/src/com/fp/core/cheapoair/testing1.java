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
import java.util.Random;
import java.util.Scanner;
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
public class testing1 {
	Workbook wb;
	WritableWorkbook book;
	WritableWorkbook book1;
	//Function_File RT = new Function_File();
	private int a;

	
	/**
	 * @param args
	 */
	public void Round_Trip_Script() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		//common line for read and write in exisiting workbook
				File File_Path = new File("C:\\Excel_File\\Test_Data.xls");	
				String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
				
				File New_File_Path = new File("C:\\Excel_File\\Test_Data2" + timeStamp + ".xls");	
				
			File New_File_Path1 = new File("C:\\Excel_File\\a.xls");	
				//Code to read from existing workbook
						FileInputStream fs = new FileInputStream(File_Path);
						wb = Workbook.getWorkbook(fs);
						Sheet sh = wb.getSheet(0);

										
							
					
						String start = sh.getCell(a,1).getContents();
						System.out.println(start);

						
						String destination = sh.getCell(1,1).getContents();
						System.out.println(destination);
				
						//Code to write in existing workbook
				
						//Workbook existingBook = Workbook.getWorkbook(File_Path);
						//book = Workbook.createWorkbook(File_Path, existingBook);
						book = Workbook.createWorkbook(New_File_Path,wb);
					//book = Workbook.createWorkbook(New_File_Path, wb);
						//book1 = Workbook.createWorkbook(New_File_Path1, wb);
								
						WritableSheet sheet = book.getSheet("Sheet1");
						
						int b = 5;
						
						sheet.addCell(new Label(2, 1, b));
						
						File toBeRenamed = New_File_Path;
						 
				       
				       // File newFile = New_File_Path1;
				 
				        //Rename
				        book.write();
				        book.close();
				        wb.close();
				     
				      
				        if (New_File_Path1.exists()) {
				        
				        New_File_Path1.delete();
				          
				        }
				       
				        New_File_Path.renameTo(New_File_Path1);
				            
				        
						
						
						
						
						
		
		
	}		
			//fs.close();
			
			//Code to write in new workbook
			
			//String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			
			
			
		
		//	FileOutputStream outputfile_g = new FileOutputStream("C:\\Excel_File\\Test_Data.xls");
			//WritableWorkbook book1 = Workbook.createWorkbook(fo);
			//WritableSheet	sheet1 = book.createSheet("Sheet1", 0);
					
					
			
		//
		//String destination = sh.getCell(1,1).getContents();
		//System.out.println(destination);
		
			//.write(Fil);
		//book.write();
		//	book.close();
		
	@AfterTest
	public void Sfd() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	if (book!=null)
		{
		System.out.println("fdfd");
		
		//book.write();
	      
		book.close();
		
	wb.close();
		
	
		
		}
	
	else
	{
		System.out.println("instance not open");
	}
					
	
		    
		   
		    
	}

}
