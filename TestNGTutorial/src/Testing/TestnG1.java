package Testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestnG1 {
	
	@BeforeMethod
	void BeforeMethodAnnotations()
	{
		System.out.println("Before Method Annotations");
	}
	@BeforeTest     //After test Supports through out the Project
	void display1()
	{
		System.out.println("Display1");
	}
	@Test
	void display2()
	{
		System.out.println("Display2");
	}
	@Test
	void display3()
	{
		System.out.println("Display3");
	}
	@Test
	void display4()
	{
		System.out.println("Display4");
	}
	@Test
	void display5()
	{
		System.out.println("Display5");
	}
	@Test
	void display6()
	{
		System.out.println("Display6");
	}
	@Test
	void Filter1()
	{
		System.out.println("Filter By Name1");
	}
	@Test
	void Filter2()
	{
		System.out.println("Filter By Name2");
	}
	@Test
	void Filter3()
	{
		System.out.println("Filter By Name3");
	}
	@Test
	void Filter4()
	{
		System.out.println("Filter By Name4");
	}
	@Test
	void otherMethod1()
	{
		System.out.println("OtherMethod1");
	}
	@Test
	void otherMethod2()
	{
		System.out.println("OtherMethod2");
	}
	@Test
	void otherMethod3()
	{
		System.out.println("OtherMethod3");
	}
	@Test
	void otherMethod4()
	{
		System.out.println("OtherMethod4");
	}
	@BeforeTest
	void PrerequitesMethod()
	{
		System.out.println("Pre-Delection Completed");
	}
	@BeforeSuite
	void begin()
	{
		System.out.println("Begin's");
	}
	

}
