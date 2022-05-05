package casting;

class x{
	void test1(double d)

{
	System.out.println("d="+d);
}
void test1(int a)
{
	System.out.println("a="+a);

}
}   


public class run3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts ");
x x1=new x();
x1.test1((double)12);// explicit widening

x1.test1(12);
System.out.println("program end ");

	}

}
