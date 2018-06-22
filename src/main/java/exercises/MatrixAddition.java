package main.java.exercises;

public class MatrixAddition {
    public static int[][] add(int arr1[][] , int arr2[][]){
    	int arr[][] = new int[2][2];
    	for(int i=0;i<arr1.length;i++) {
    		for(int j=0;j<arr1.length;j++) {
    			arr[i][j] = arr1[i][j] + arr2[i][j];
    		}
    	}
    	return arr;
    }
}
