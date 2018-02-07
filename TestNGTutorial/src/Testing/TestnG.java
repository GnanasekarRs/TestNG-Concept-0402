package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestnG
{
	@AfterMethod
	void BeforeMethodAnnotations()
	{
		System.out.println("After Method Annotations");
	}
	
	@AfterTest
	void PostTest()
	{
		System.out.println("Post Deletion Completed");
	}
	@Test(enabled=false)  
	//this method will won't execute 
    void Demo() 
	{
       System.out.println("Method1");
    }
	@Test(timeOut=4000)
	void Demo2()
	{
		System.out.println("Method2");
	}
	@AfterTest  //After test Supports through out the Project
	void Demo3()
	{
		System.out.println("Method3");
	}
	@Test
	void Demo4()
	{
		System.out.println("Method4");
	}
	@Test
	void Demo5()
	{
		System.out.println("Method5");
	}
	@Test
	void Demo6()
	{
		System.out.println("Method6");
	}
	@Test
	void Demo7()
	{
		System.out.println("Method7");
	}
	@Test
	void Demo8()
	{
		System.out.println("Method8");
	}
	@AfterSuite(groups= {"Smoke"})
	void end()
	{
		System.out.println("END");
	}
	@AfterClass
	void Afterclassmethod()
	{
		System.out.println("After Class");
	}
	
	
}
