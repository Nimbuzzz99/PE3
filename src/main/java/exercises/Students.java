package main.java.exercises;

public class Students {
       public static String[] studentsGrade(int arr[]) {
    	  String gradeCheck[] = new String[arr.length];
    	  int i = 0;
    	  for(int check : arr) {
    		  if(check >= 0 && check <=100) {
    			  gradeCheck[i]= "true";
    			  i++;
    		  }
    		  else {
    			  gradeCheck[i]= "false";
    			  i++;
    		  }
    	  }
    	  return gradeCheck;
       } 
}
