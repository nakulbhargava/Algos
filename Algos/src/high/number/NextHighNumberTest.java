package high.number;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NextHighNumberTest {
	char[] number;
	@BeforeEach
	void setUp() throws Exception {
		number  = new char[]{ '1', '2', '3'};
	}

	@Test
	void testCalculateNextHighNumberNull() {
		assertEquals(null, NextHighNumber.calculateNextHighNumber(null));
	}

	@Test
	void testCalculateNextHighNumberNull2() {
		
		assertFalse(null == NextHighNumber.calculateNextHighNumber(number));
	}
	@Test
	void testCalculateNextHighNumber() {
		char[] test = NextHighNumber.calculateNextHighNumber(number);
		System.out.println("Number is now:" + String.copyValueOf(test));
		assertEquals(number, test );
	}
	
	@Test
	void testSwapNull() {
		assertEquals(null, NextHighNumber.swap(number, 4, 0));
	}
	@Test
	void testSwap() {
		char[] testSwap = {'1','2','3'};
		assertEquals(testSwap, NextHighNumber.swap(testSwap, 0, 0));
	}

}
