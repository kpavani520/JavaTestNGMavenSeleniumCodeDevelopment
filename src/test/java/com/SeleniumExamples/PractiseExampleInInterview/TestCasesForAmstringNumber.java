package com.SeleniumExamples.PractiseExampleInInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

import JavaExamples.AmstrongNumber;

public class TestCasesForAmstringNumber {
	@Test
	public void testfortruevalue() {
		AmstrongNumber amn = new AmstrongNumber();
		boolean actual = amn.amstrong(153);
		Assert.assertEquals(actual, true);
	}
	@Test
	public void testforfalsevalue() {
		AmstrongNumber amn = new AmstrongNumber();
		boolean actual = amn.amstrong(123);
		Assert.assertEquals(actual, false);
	}
	@Test
	public void testforvalue0() {
		AmstrongNumber amn = new AmstrongNumber();
		boolean actual = amn.amstrong(0);
		Assert.assertEquals(actual, false);
	}
	
	
	

}
