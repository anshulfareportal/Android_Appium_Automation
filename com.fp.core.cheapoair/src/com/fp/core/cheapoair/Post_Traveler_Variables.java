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
public class Post_Traveler_Variables {
	
	String Seat_Post_Booking;
	String Meal_Post_Booking;
	String Additonal_Traveler_Post_Booking;
	String Traveler_Name_Post_Booking;

	
	public String getSeat_Post_Booking() {
		return Seat_Post_Booking;
	}
	public void setSeat_Post_Booking(String seat_Post_Booking) {
		Seat_Post_Booking = seat_Post_Booking;
	}
	public String getMeal_Post_Booking() {
		return Meal_Post_Booking;
	}
	public void setMeal_Post_Booking(String meal_Post_Booking) {
		Meal_Post_Booking = meal_Post_Booking;
	}
	public String getAdditonal_Traveler_Post_Booking() {
		return Additonal_Traveler_Post_Booking;
	}
	public void setAdditonal_Traveler_Post_Booking(
			String additonal_Traveler_Post_Booking) {
		Additonal_Traveler_Post_Booking = additonal_Traveler_Post_Booking;
	}
	public String getTraveler_Name_Post_Booking() {
		return Traveler_Name_Post_Booking;
	}
	public void setTraveler_Name_Post_Booking(String traveler_Name_Post_Booking) {
		Traveler_Name_Post_Booking = traveler_Name_Post_Booking;
	}
	
	
	

}
