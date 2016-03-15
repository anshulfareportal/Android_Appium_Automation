package com.fp.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Batch {
  
	<suite name="My test suite">
	  <test name="testing123">
	    <classes>
	       <class name="Round_Trip" />
	       <class name="Check_My_Booking" />
	    </classes>
	  </test>
	</suite>

}
