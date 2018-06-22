package test.java.exercisetest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.RemoveVowels;

public class RemoveVowelsTest {

	@Test
	public void testVowelRemove() {
     String str[] = {"India", "United States", "Germany" , "Egypt", "czechoslovakia"};
     assertEquals(new String[] {"nd", "ntd Stts", "Grmny" , "gypt", "czchslvk"} , RemoveVowels.vowelRemove(str));
	}

}
