package test.java.exercisetest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.ConsecutiveNumber;

public class ConsecutiveNumberTest {

	@Test
	public void testConsecutiveCheck() {
		assertEquals(true , ConsecutiveNumber.consecutiveCheck("23,24,25,26"));
		assertEquals(true , ConsecutiveNumber.consecutiveCheck("99,98,97,96"));
		assertEquals(false , ConsecutiveNumber.consecutiveCheck("23,24,99,26"));
	}

}
