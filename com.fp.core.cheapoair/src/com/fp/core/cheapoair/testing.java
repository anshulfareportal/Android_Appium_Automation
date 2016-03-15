package com.fp.core.cheapoair;
import org.testng.Assert;
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
public class testing {
	
	
	/**
	 * @param args
	 */
	public void Round_Trip_Script() throws MalformedURLException, InterruptedException, BiffException, IOException, Exception {
		
	//Variable_File var = new Variable_File();
		
		 String a = "5";
		 String h = "5";
		 
		 if(a.equals(h) )
		 {
			 System.out.println("gdfgd");
		 }
		 System.out.println(a);
		 System.out.println(h);
		 float b = Float.parseFloat(a);
		 float d = Float.parseFloat(h);
		 System.out.println(b); 
		 System.out.println(d); 
		 System.out.println(b-d); 
		
		
		String y = "sdfsd: 342323 gdgd: 5555";
		String[] P = y.split(":");
		System.out.println(P[0]);
		
		String Actualtext =  "Tuesday, 29 January 2014";
		
	Assert.assertEquals(Actualtext, "Tuesday, 28 January 2014", "assertion fail");
		
	int r = 5;
	int g = 6;
	
	
	
	
	
		
		for(String x: y.split(":")){
		
		
			System.out.println(x);
		//	System.out.println(x[0]);
		}
		
		
		int c;
		    System.out.println("Input an integer");
		  Scanner in = new Scanner(System.in);
		    c = in.nextInt();
		 
		    if (c % 2 == 0)
		      System.out.println("Even");
		    else
		      System.out.println("Odd");
		    
		   
		
	
	
	}

	
	
	
	
}




