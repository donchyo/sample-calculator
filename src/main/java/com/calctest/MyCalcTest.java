package com.calctest;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class MyCalcTest {
	Calculator MCT = new Calculator();
	public static final Logger LOG = Logger.getLogger(MyCalcTest.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	
	//addtest start
	@Test
	public void addsmallPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempResult = tempFirstRandomValue + tempSecondRandomValue;
			
			LOG.info("Testing the method add with small pos doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.add(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void addMediumPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempResult = tempFirstRandomValue + tempSecondRandomValue;
			
			LOG.info("Testing the method add with medium pos doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.add(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void addLargePos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempResult = tempFirstRandomValue + tempSecondRandomValue;
			
			LOG.info("Testing the method add with large pos doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.add(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void addZero() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = 0;
			tempSecondRandomValue = 0;
			tempResult = tempFirstRandomValue + tempSecondRandomValue;
			
			LOG.info("Testing the method add with medium pos doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.add(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void addSmallNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			tempResult = tempFirstRandomValue + tempSecondRandomValue;
			
			LOG.info("Testing the method add with small negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.add(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void addMediumNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			tempResult = tempFirstRandomValue + tempSecondRandomValue;
			
			LOG.info("Testing the method add with Medium negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.add(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void addLargeNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			tempResult = tempFirstRandomValue + tempSecondRandomValue;
			
			LOG.info("Testing the method add with Large negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.add(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
//subtract start
	@Test
	public void subSmallPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempResult = tempFirstRandomValue - tempSecondRandomValue;
			
			LOG.info("Testing the method subtract with small positive doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.subtract(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void subMediumPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempResult = tempFirstRandomValue - tempSecondRandomValue;
			
			LOG.info("Testing the method subtract with medium positive doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.subtract(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void subLargePos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempResult = tempFirstRandomValue - tempSecondRandomValue;
			
			LOG.info("Testing the method subtract with large positive doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.subtract(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void subSmallSub() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 -tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue - tempSecondRandomValue;
			
			LOG.info("Testing the method subtract with small negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.subtract(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void subMediumSub() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 -tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue - tempSecondRandomValue;
			
			LOG.info("Testing the method subtract with medium negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.subtract(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void subLargeSub() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 -tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue - tempSecondRandomValue;
			
			LOG.info("Testing the method subtract with large negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.subtract(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void subZero() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = 0;
			tempSecondRandomValue = 0;
			tempResult = tempFirstRandomValue - tempSecondRandomValue;
			
			LOG.info("Testing the method sub with zero: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.subtract(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	//multiplication start
	@Test
	public void multiSmallPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			
			tempResult = tempFirstRandomValue * tempSecondRandomValue;
			
			LOG.info("Testing the method multiply with two small doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.multiply(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void multiMediumPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			
			tempResult = tempFirstRandomValue * tempSecondRandomValue;
			
			LOG.info("Testing the method multiply with two medium doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.multiply(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void multiLargePos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			
			tempResult = tempFirstRandomValue * tempSecondRandomValue;
			
			LOG.info("Testing the method multiply with two large doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.multiply(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void multiSmallNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue * tempSecondRandomValue;
			
			LOG.info("Testing the method multiply with small negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.multiply(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void multiMediumNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue * tempSecondRandomValue;
			
			LOG.info("Testing the method multiply with medium negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.multiply(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void multiLargeNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue * tempSecondRandomValue;
			
			LOG.info("Testing the method multiply with large negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.multiply(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void multiZero() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = 0;
			tempSecondRandomValue = 0;
			tempResult = tempFirstRandomValue * tempSecondRandomValue;
			
			LOG.info("Testing the method multi with zero: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.multiply(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void diviSmallPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
//			tempFirstRandomValue = 0 - tempFirstRandomValue;
//			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue / tempSecondRandomValue;
			
			LOG.info("Testing the method divide with small doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.divide(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void diviMediumPos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
//			tempFirstRandomValue = 0 - tempFirstRandomValue;
//			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue / tempSecondRandomValue;
			
			LOG.info("Testing the method divide with medium doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.divide(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void diviLargePos() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
//			tempFirstRandomValue = 0 - tempFirstRandomValue;
//			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue / tempSecondRandomValue;
			
			LOG.info("Testing the method divide with Large doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.divide(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void diviSmallNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*10));
		tempFirstRandomValue = 0 - tempFirstRandomValue;
		tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue / tempSecondRandomValue;
			
			LOG.info("Testing the method divide with small negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.divide(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void diviMediumNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*100));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue / tempSecondRandomValue;
			
			LOG.info("Testing the method divide with Medium negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.divide(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void diviLargeNeg() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempSecondRandomValue = Double.valueOf(df.format(random.nextDouble()*1000));
			tempFirstRandomValue = 0 - tempFirstRandomValue;
			tempSecondRandomValue = 0 - tempSecondRandomValue;
			
			tempResult = tempFirstRandomValue / tempSecondRandomValue;
			
			LOG.info("Testing the method divide with Large negative doubles: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.divide(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
	@Test
	public void diviZero() {
		double tempFirstRandomValue = 0;
		double tempResult = 0;
		double tempSecondRandomValue = 0;
		
		for (int i = 0; i< 200; i++){ 
			tempFirstRandomValue = 0;
			tempSecondRandomValue = 0;
			tempResult = tempFirstRandomValue / tempSecondRandomValue;
			
			LOG.info("Testing the method multi with zero: " + tempFirstRandomValue + " and " + tempSecondRandomValue);
			assertEquals(Math.round(MCT.divide(tempFirstRandomValue, tempSecondRandomValue)), Math.round(tempResult));
		}
	}
}
