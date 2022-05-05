package variables;

import java.util.Scanner;

public class function {
	int VowelCount(String str) {
	      final String VOWEL = "aeiouAEIOU";
	   
	    int counter = 0;
	    for (int i = 0; i < str.length(); i++) {
	      if (VOWEL.indexOf(str.charAt(i)) > -1) {
	          counter++;
	      }
	    }
	      
	    return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		    function c = new function();
		    System.out.print(c.VowelCount(s.nextLine()));
		  System.out.println();
		System.out.println();
		
	}
}
