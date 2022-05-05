package variables;

public class Staticglobalvariable {
	static int mobilenumber=123;
	public static void main (String[] args) {
		System.out.println("Program starts...");
		System.out.println("SGV:"+mobilenumber);
		System.out.println(" SGV WITH STD:"+Staticglobalvariable.mobilenumber);
		System.out.println("************************");
		 mobilenumber=456;
		System.out.println("SGV:"+mobilenumber);
		System.out.println("SGV WITH STD:"+Staticglobalvariable.mobilenumber);
		System.out.println("*************");
		int mobilenumber=789;
				System.out.println("SGV:"+mobilenumber);
		System.out.println("SGV WITH STD :"+Staticglobalvariable.mobilenumber);
		System.out.println("Progaram end");
		
	}

}


