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


public class excelrun {

	WebDriver dr;
	WritableWorkbook book;

	@Test
	public void login1() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
		
		//testingapp tp = new testingapp();
		
		
		//tp.Search_Input();
		
		
		
		
		////Code to read from existing workbook
//		String FilePath = "C:\\Performance_results18-5-2012_13.8.7.xls";
//		FileInputStream fs = new FileInputStream(FilePath);
//		Workbook wb = Workbook.getWorkbook(fs);
//		Sheet sh = wb.getSheet(0);
//		
//		String CellGetContent = sh.getCell(0,0).getContents();
//		System.out.println(CellGetContent);
		
		
		//Code to write in existing workbook
//		File excelFile = new File("C:\\output.xls");
//
//		System.out.println("befoew");
	//Workbook existingBook = Workbook.getWorkbook(excelFile);
//WritableWorkbook book = Workbook.createWorkbook(excelFile, existingBook);
	//WritableSheet sheet = book.getSheet("output");
//		
//		book.write();
//book.close();
//				
	Label l1 = new Label(0, 0, "8888");
	sheet.addCell(l1);
//		Label l2 = new Label(1, 1, "888");
//		sheet.addCell(l2);
//	
//		System.out.println("aftr");
		
		
		
		//Code to write in new workbook
		
		/*String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		FileOutputStream fo = new FileOutputStream("C:\\reporrrr" + timeStamp + ".xls",true);
		WritableWorkbook book = Workbook.createWorkbook(fo);
		WritableSheet	sheet1 = book.createSheet("Sheet1", 0);
				
			
			
		Label l3 = new Label(0, 2, "4444");
		sheet1.addCell(l3);*/
		
		book.write();
		book.close();
		

	//	Label l2 = new Label(1, 1, "fails");
	//	ws.addCell(l2);
	//	wwb.write();
	//	wwb.close();
	//	System.out.println("aftr");
		
	  
	  
	  
	 
	  
	  
	}
	


	

}
