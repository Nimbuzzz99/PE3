package main.java.exercises;

public class ChessBoard {
	public static String[][] chessChecker(){
	   String [][]a = new String[8][8];
	   for(int i = 0;i<a.length;i++) {
		   for(int j=0;j<a[0].length;j++) {
			   if((i+j)%2 == 0)
			   a[i][j] = "WW";
		       else {
			   a[i][j] = "BB";
		   }
	   }
   }
	   return a;
}
}
