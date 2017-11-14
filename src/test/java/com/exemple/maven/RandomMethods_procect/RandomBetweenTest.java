package com.exemple.maven.RandomMethods_procect;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomBetweenTest {

	MyRandomMethods myRandomMethods = new MyRandomMethods();

	@Test
	public void testrandomBetween1And10 () {
		boolean  result =false;
		int test = myRandomMethods.randomBetween1And10();
		if (test >= 1 && test <=10) {
			result =true;
		}
		assertTrue(result);		
	}		
	
	@Test
	public void randomBetween11And20 () {
		boolean  result =false;
		int test = myRandomMethods.randomBetween11And20();
		if (test >= 11 && test <=20) {
			result =true;
		}
		assertTrue(result);		
	}	

	@Test
	public void randomBetween21And30 () {
		boolean  result =false;
		int test = myRandomMethods.randomBetween21And30();
		if (test >= 21 && test <=30) {
			result =true;
		}
		assertTrue(result);		
	}

	@Test
	public void randomBetween31And40 () {
		boolean  result =false;
		int test = myRandomMethods.randomBetween31And40();
		if (test >= 31 && test <=40) {
			result =true;
		}
		assertTrue(result);		
	}

	@Test
	public void randomBetween41And50 () {
		boolean  result =false;
		int test = myRandomMethods.randomBetween41And50();
		if (test >= 41 && test <=50) {
			result =true;
		}
		assertTrue(result);		
	}


}
