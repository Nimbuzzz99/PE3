package main.java.exercises;

public class RemoveVowels {
    public static String[] vowelRemove(String str[]) {
    	String vowelStr[] = new String[str.length];
    	int i = 0;
    	for(String s : str) {
    	vowelStr[i] = s.replaceAll("[aeiouAEIOU]", "");
    	i++;
    	}
    	return vowelStr;
    }
}
