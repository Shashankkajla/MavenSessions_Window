package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {


	  @Test
	  public void sum1()
	  {
		  System.out.println("sum method");
		  int a = 10;
		  int b = 20;
		  Assert.assertEquals(30, a+b);
	  }
	  @Test
	  public void sub1()
	  {
		  System.out.println("sub method");
		  int a = 20;
		  int b = 10;
		  Assert.assertEquals(10, a-b);
	  }
	   @Test
	   public void mul1()
	   {
	 	  System.out.println("mul method");
	 	  int a = 20;
	 	  int b = 10;
	 	  Assert.assertEquals(200, a*b);
	   }
	   @Test
	   public void div1()
	   {
	 	  System.out.println("div method");
	 	  int a = 20;
	 	  int b = 10;
	 	  Assert.assertEquals(2, a/b);
	   }   
	 }




