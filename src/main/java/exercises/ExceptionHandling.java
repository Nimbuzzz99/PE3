package main.java.exercises;

public class ExceptionHandling {
    public static void main(String []args) {
    	try{
    		int i = 0;
    		int a = i/0;
    	}
    	catch(Exception e) {
    		System.out.println("Error in the code");
    	}
    	finally {
    		System.out.println("Mandatory message");
    	}
    }
}
