package test.java.exercisetest;

import static org.junit.Assert.*;
import main.java.exercises.*;
import org.junit.Test;

public class MatrixAdditionTest {

	@Test
	public void testAdd() {
		int arr1[][] = {{1,2},{3,4}};
		int arr2[][] = {{1,2},{3,4}};
		int arr[][] = MatrixAddition.add(arr1 , arr2);
		assertEquals(2 , arr[0][0]);
		assertEquals(4 , arr[0][1]);
		assertEquals(6 , arr[1][0]);
		assertEquals(8 , arr[1][1]);
	}

}
