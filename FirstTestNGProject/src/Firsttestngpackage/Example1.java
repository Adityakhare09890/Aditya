package Firsttestngpackage;

import org.testng.annotations.Test;

public class Example1 {
	@Test(invocationCount=5)
	public void param1() {
		System.out.println("Hello, I am TC8 from Example_Param1 class");
	}	
}

