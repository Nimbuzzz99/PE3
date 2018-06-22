package main.java.exercises;

public class ConsecutiveNumber {
     public static boolean consecutiveCheck(String arr) {
    	 String str[] = arr.split(",");
    	 if(Integer.parseInt(str[0])-Integer.parseInt(str[1]) == 1 || Integer.parseInt(str[0])-Integer.parseInt(str[1]) == -1) {
    		 if(Integer.parseInt(str[0])-Integer.parseInt(str[1]) == 1) {
    			 for(int i=0;i<str.length-1;i++) {
    				 if(Integer.parseInt(str[i])-Integer.parseInt(str[i+1]) != 1) {
    					return false;
    				 }
    		 }
    	       return true;
    	 }
    		 else if(Integer.parseInt(str[0])-Integer.parseInt(str[1]) == -1) {
    			 for(int i=0;i<str.length-1;i++) {
    				 if(Integer.parseInt(str[i])-Integer.parseInt(str[i+1]) != -1) {
    					return false;
    				 }
    		 }
    	       return true;
    	 }
    	 }
    	 else {
    		 return false;
    	 }
		return false;
     }
}
