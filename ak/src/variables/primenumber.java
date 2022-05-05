package variables;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=71,count=0,i=1;
		
		while(i<=number){
		  if(number%i==0){
		    count++;
		  }
		 i++;
		}
		if(count==2){
		  System. out. println(number+" is Prime number");
		}
		else{
		  System. out. println(number+" is not Prime Number");
		}
	}

}
