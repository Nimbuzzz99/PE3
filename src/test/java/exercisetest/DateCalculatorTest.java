package test.java.exercisetest;

import static org.junit.Assert.*;

import java.util.*;
import main.java.exercises.*;
import org.junit.Test;

public class DateCalculatorTest {

	@Test
	public void FirstDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    DateCalculator obj = new DateCalculator();
	    Date now = obj.getWeekStartDate();
	}
	
	@Test
	public void LastDateTest() {
	    Calendar calendar = Calendar.getInstance();
	    DateCalculator obj = new DateCalculator();
	    Date now = obj.getWeekEndDate();
	}

}
