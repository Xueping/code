package com.researchermall.dao.impl;

import org.junit.Test;

import uts.codesale.service.ServiceTest;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	String message = "Hello World";	
	   ServiceTest messageUtil = new ServiceTest(message);

	   @Test
	   public void testPrintMessage1() {	  
	      assertEquals(message,messageUtil.printMessage());
	   }
	   
//	   @Test
//	   public void testPrintMessage() {	  
//	      assertEquals("Hello World!",messageUtil.printMessage());
//	   }
}
