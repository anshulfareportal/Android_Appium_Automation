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
public class Variable_File {
	
	String Base_Price;
	String Taxes;
	String Sub_Total;
	String Protection;
	String Instant_Discount;
	String Total_Price;
	String Navigation_Button_Name;
	String Instant_Discount_Text;
	String Travel_Assist_Text;
	String Travel_Assist_Value;
	String Travel_Assist_Sub_Value;
	String Promo_Code_Text;
	
	
	public String getPromo_Code_Text() {
		return Promo_Code_Text;
	}
	public void setPromo_Code_Text(String promo_Code_Text) {
		Promo_Code_Text = promo_Code_Text;
	}
	public String getBase_Price() {
		return Base_Price;
	}
	public void setBase_Price(String base_Price) {
		Base_Price = base_Price;
	}
	public String getTaxes() {
		return Taxes;
	}
	public void setTaxes(String taxes) {
		Taxes = taxes;
	}
	public String getSub_Total() {
		return Sub_Total;
	}
	public void setSub_Total(String sub_Total) {
		Sub_Total = sub_Total;
	}
	public String getProtection() {
		return Protection;
	}
	public void setProtection(String protection) {
		Protection = protection;
	}
	public String getInstant_Discount() {
		return Instant_Discount;
	}
	public void setInstant_Discount(String instant_Discount) {
		Instant_Discount = instant_Discount;
	}
	public String getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(String total_Price) {
		Total_Price = total_Price;
	}
	public String getNavigation_Button_Name() {
		return Navigation_Button_Name;
	}
	public void setNavigation_Button_Name(String navigation_Button_Name) {
		Navigation_Button_Name = navigation_Button_Name;
	}
	public String getInstant_Discount_Text() {
		return Instant_Discount_Text;
	}
	public void setInstant_Discount_Text(String instant_Discount_Text) {
		Instant_Discount_Text = instant_Discount_Text;
	}
	public String getTravel_Assist_Text() {
		return Travel_Assist_Text;
	}
	public void setTravel_Assist_Text(String travel_Assist_Text) {
		Travel_Assist_Text = travel_Assist_Text;
	}
	public String getTravel_Assist_Value() {
		return Travel_Assist_Value;
	}
	public void setTravel_Assist_Value(String travel_Assist_Value) {
		Travel_Assist_Value = travel_Assist_Value;
	}
	public String getTravel_Assist_Sub_Value() {
		return Travel_Assist_Sub_Value;
	}
	public void setTravel_Assist_Sub_Value(String travel_Assist_Sub_Value) {
		Travel_Assist_Sub_Value = travel_Assist_Sub_Value;
	}
	

}
