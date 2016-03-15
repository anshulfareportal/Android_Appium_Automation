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
public class Post_Price_Variables {
	
	String Post_Base_Price;
	String Post_Taxes;
	String Post_Sub_Total;
	String Post_Protection;
	String Post_Sub_Protection;
	String Post_Instant_Discount;
	String Post_Total_Price;
	String Post_Instant_Discount_Text;
	String Post_Travel_Assist_Value;
	String Travel_Assist_Sub_Value;
	
	public String getPost_Base_Price() {
		return Post_Base_Price;
	}
	public void setPost_Base_Price(String post_Base_Price) {
		Post_Base_Price = post_Base_Price;
	}
	public String getPost_Taxes() {
		return Post_Taxes;
	}
	public void setPost_Taxes(String post_Taxes) {
		Post_Taxes = post_Taxes;
	}
	public String getPost_Sub_Total() {
		return Post_Sub_Total;
	}
	public void setPost_Sub_Total(String post_Sub_Total) {
		Post_Sub_Total = post_Sub_Total;
	}
	public String getPost_Protection() {
		return Post_Protection;
	}
	public void setPost_Protection(String post_Protection) {
		Post_Protection = post_Protection;
	}
	public String getPost_Sub_Protection() {
		return Post_Sub_Protection;
	}
	public void setPost_Sub_Protection(String post_Sub_Protection) {
		Post_Sub_Protection = post_Sub_Protection;
	}
	public String getPost_Instant_Discount() {
		return Post_Instant_Discount;
	}
	public void setPost_Instant_Discount(String post_Instant_Discount) {
		Post_Instant_Discount = post_Instant_Discount;
	}
	public String getPost_Total_Price() {
		return Post_Total_Price;
	}
	public void setPost_Total_Price(String post_Total_Price) {
		Post_Total_Price = post_Total_Price;
	}
	public String getPost_Instant_Discount_Text() {
		return Post_Instant_Discount_Text;
	}
	public void setPost_Instant_Discount_Text(String post_Instant_Discount_Text) {
		Post_Instant_Discount_Text = post_Instant_Discount_Text;
	}
	public String getPost_Travel_Assist_Value() {
		return Post_Travel_Assist_Value;
	}
	public void setPost_Travel_Assist_Value(String post_Travel_Assist_Value) {
		Post_Travel_Assist_Value = post_Travel_Assist_Value;
	}
	public String getTravel_Assist_Sub_Value() {
		return Travel_Assist_Sub_Value;
	}
	public void setTravel_Assist_Sub_Value(String travel_Assist_Sub_Value) {
		Travel_Assist_Sub_Value = travel_Assist_Sub_Value;
	}
	
	
	
	
	
	
	
	

}
