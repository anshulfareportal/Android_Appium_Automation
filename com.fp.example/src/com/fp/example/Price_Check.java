package com.fp.example;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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


public class Price_Check{

	
	String Base_Price;
	String Taxes;
	String Protection;
	String Instant_Discount;
	String Total_Price;
	String Travel_Assist_Text_Value;
	String Taxes_With_Assist;
	
	String Promo_Value;
	String Instant_Total_Discount;
	String Total_Price_with_Promo_Discount;
	String Booking_No;
	String Flight_Watcher_Alert_Message;
	String Traveler_Name_At_Post_Booking;
	String Seat_Preference;
	String Meal_Preference;
	String Additional_Preference;
	
	String Check_Base_Price;
	String Check_Taxes;
	String Check_Instant_Discount;
	String Check_Total_Price;
	String Confirmation_Alert_Message;
	
	

	public String getConfirmation_Alert_Message() {
		return Confirmation_Alert_Message;
	}
	public void setConfirmation_Alert_Message(String confirmation_Alert_Message) {
		Confirmation_Alert_Message = confirmation_Alert_Message;
	}
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
	
	
	
	
	
	public String getTraveler_Name_At_Post_Booking() {
		return Traveler_Name_At_Post_Booking;
	}
	public void setTraveler_Name_At_Post_Booking(
			String traveler_Name_At_Post_Booking) {
		Traveler_Name_At_Post_Booking = traveler_Name_At_Post_Booking;
	}
	public String getSeat_Preference() {
		return Seat_Preference;
	}
	public void setSeat_Preference(String seat_Preference) {
		Seat_Preference = seat_Preference;
	}
	public String getMeal_Preference() {
		return Meal_Preference;
	}
	public void setMeal_Preference(String meal_Preference) {
		Meal_Preference = meal_Preference;
	}
	public String getAdditional_Preference() {
		return Additional_Preference;
	}
	public void setAdditional_Preference(String additional_Preference) {
		Additional_Preference = additional_Preference;
	}
	
	
	
	public String getFlight_Watcher_Alert_Message() {
		return Flight_Watcher_Alert_Message;
	}
	public void setFlight_Watcher_Alert_Message(String flight_Watcher_Alert_Message) {
		Flight_Watcher_Alert_Message = flight_Watcher_Alert_Message;
	}
	public String getBooking_No() {
		return Booking_No;
	}
	public void setBooking_No(String booking_No) {
		Booking_No = booking_No;
	}
	public String getInstant_Total_Discount() {
		return Instant_Total_Discount;
	}
	public void setInstant_Total_Discount(String instant_Total_Discount) {
		Instant_Total_Discount = instant_Total_Discount;
	}
	public String getTotal_Price_with_Promo_Discount() {
		return Total_Price_with_Promo_Discount;
	}
	public void setTotal_Price_with_Promo_Discount(
			String total_Price_with_Promo_Discount) {
		Total_Price_with_Promo_Discount = total_Price_with_Promo_Discount;
	}
	
	
	public String getPromo_Value() {
		return Promo_Value;
	}
	public void setPromo_Value(String promo_Value) {
		Promo_Value = promo_Value;
	}
	
	public String getTaxes_With_Assist() {
		return Taxes_With_Assist;
	}
	public void setTaxes_With_Assist(String taxes_With_Assist) {
		Taxes_With_Assist = taxes_With_Assist;
	}
	public String getTravel_Assist_Text_Value() {
		return Travel_Assist_Text_Value;
	}
	public void setTravel_Assist_Text_Value(String travel_Assist_Text_Value) {
		Travel_Assist_Text_Value = travel_Assist_Text_Value;
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
	
	public void setTotal_Price(String total_Price) {
		Total_Price = total_Price;
	}
	public String getTotal_Price() {
		return Total_Price;
	}
	
}
