package test.java.exercisetest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.ThreeExceptions;

public class ThreeExceptionsTest {

	@Test
	public void testNegative() {
		assertEquals("Negative ArraySize" , ThreeExceptions.negative());
	}

	@Test
	public void testIndexOutOfBound() {
		assertEquals("Index out of bounds" , ThreeExceptions.IndexOutOfBound());
	}

	@Test
	public void testNullPointer() {
		assertEquals("NullPointerException Caught" , ThreeExceptions.NullPointer());
	}

}
