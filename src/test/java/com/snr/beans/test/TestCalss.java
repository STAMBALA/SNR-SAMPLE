package com.snr.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.snr.beans.Calculator;

public class TestCalss {
	private static Calculator calc = null;
	@BeforeClass
	public static void init() {
		calc = new Calculator();
	}
	@AfterClass
	public static void destroy() {
		calc = null;
	}
	@Test
	public void addTest() {
		
		Integer actualResult= calc.add(20,20);
		Integer expectedResult = 40;
		assertEquals(actualResult, expectedResult);
	}
	@Test
	public void mutiplicationsTest() {
		
		Integer actualResult = calc.multiplication(10, 5);
		Integer expectedResult = 50;
		assertEquals(actualResult,expectedResult);
	}
	
}
