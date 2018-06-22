package test.java.exercisetest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.ChessBoard;

public class ChessBoardTest {

	@Test
	public void testChessChecker() {
		String[][] s = ChessBoard.chessChecker();
	    assertEquals("WW",s[0][0]);
	    assertNotEquals("WW",s[1][2]);
	    assertEquals("BB",s[4][5]);
	    assertEquals("BB",s[6][7]);
	    
	}
}
