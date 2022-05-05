package variables;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 454;
		  
	    int reverse=0, element, remainder; 
	    element = num;
	  
	    while(num!=0){
	      remainder= num % 10;
	      reverse = (reverse * 10) + remainder;
	      num = num / 10;
	    }
	  
	    if (element == reverse){
	      System.out.println("Yes, it is palindrome");
	    }
	    else{
	      System.out.println("No, it is not palindrome");
	    }
			
	}

}
