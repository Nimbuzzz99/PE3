package test.java.exercisetest;

import static org.junit.Assert.*;
import main.java.exercises.*;

import org.junit.Test;

public class StudentsTest {

	@Test
	public void testStudentsGrade() {	
	int arr[] = {120 , 23 , 56 ,90 , -4};
	assertEquals(new String[] {"false","true","true","true","false"} , Students.studentsGrade(arr));
	}

}
