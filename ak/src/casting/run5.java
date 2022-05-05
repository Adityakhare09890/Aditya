package casting;
interface sample8
{
	int i=1021;
	double s=i;
	double p= 123.456;
	
	int u=(int)p;
	double x=u;
	
	
	
}

public class run5 
{

	public static void main(String[] args)
	{
		System.out.println("program starts ");
		System.out.println("i= " +sample8.s);
		System.out.println("i= " +sample8.u);
		System.out.println("i= " +sample8.x);

		

	}

}