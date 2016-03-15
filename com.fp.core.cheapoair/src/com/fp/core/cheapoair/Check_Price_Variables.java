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
import org.openqa.selenium.android.AndroidDriver;
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
@Test
public class Check_Price_Variables {
	
	String Check_Base_Price;
	String Check_Taxes;
	String Check_Sub_Total;
	String Check_Protection;
	String Check_Instant_Discount;
	String Check_Total_Price;
	String Check_Navigation_Button_Name;
	String Check_Instant_Discount_Text;
	String Check_Travel_Assist_Text;
	String Check_Travel_Assist_Value;
	String Check_Travel_Assist_Sub_Value;
	
	
	public String getCheck_Base_Price() {
		return Check_Base_Price;
	}
	public void setCheck_Base_Price(String check_Base_Price) {
		Check_Base_Price = check_Base_Price;
	}
	public String getCheck_Taxes() {
		return Check_Taxes;
	}
	public void setCheck_Taxes(String check_Taxes) {
		Check_Taxes = check_Taxes;
	}
	public String getCheck_Sub_Total() {
		return Check_Sub_Total;
	}
	public void setCheck_Sub_Total(String check_Sub_Total) {
		Check_Sub_Total = check_Sub_Total;
	}
	public String getCheck_Protection() {
		return Check_Protection;
	}
	public void setCheck_Protection(String check_Protection) {
		Check_Protection = check_Protection;
	}
	public String getCheck_Instant_Discount() {
		return Check_Instant_Discount;
	}
	public void setCheck_Instant_Discount(String check_Instant_Discount) {
		Check_Instant_Discount = check_Instant_Discount;
	}
	public String getCheck_Total_Price() {
		return Check_Total_Price;
	}
	public void setCheck_Total_Price(String check_Total_Price) {
		Check_Total_Price = check_Total_Price;
	}
	public String getCheck_Navigation_Button_Name() {
		return Check_Navigation_Button_Name;
	}
	public void setCheck_Navigation_Button_Name(String check_Navigation_Button_Name) {
		Check_Navigation_Button_Name = check_Navigation_Button_Name;
	}
	public String getCheck_Instant_Discount_Text() {
		return Check_Instant_Discount_Text;
	}
	public void setCheck_Instant_Discount_Text(String check_Instant_Discount_Text) {
		Check_Instant_Discount_Text = check_Instant_Discount_Text;
	}
	public String getCheck_Travel_Assist_Text() {
		return Check_Travel_Assist_Text;
	}
	public void setCheck_Travel_Assist_Text(String check_Travel_Assist_Text) {
		Check_Travel_Assist_Text = check_Travel_Assist_Text;
	}
	public String getCheck_Travel_Assist_Value() {
		return Check_Travel_Assist_Value;
	}
	public void setCheck_Travel_Assist_Value(String check_Travel_Assist_Value) {
		Check_Travel_Assist_Value = check_Travel_Assist_Value;
	}
	public String getCheck_Travel_Assist_Sub_Value() {
		return Check_Travel_Assist_Sub_Value;
	}
	public void setCheck_Travel_Assist_Sub_Value(
			String check_Travel_Assist_Sub_Value) {
		Check_Travel_Assist_Sub_Value = check_Travel_Assist_Sub_Value;
	}
	
	
				   
}
