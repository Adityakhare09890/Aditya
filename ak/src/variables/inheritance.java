package variables;
class x {
	static int a = 10;
	int b = 20;
	double c = 13.45;
}
class y {
	static int x = 30;
	int y = 40;
	double z = 53.45;
}
class z {
	static int p = 50;
	int q = 60;
	double r = 66.45;
}
public class inheritance {
	public static void main(String[] args) {
		/****** Access static member class A members *******/
		System.out.println("Class A static variable: "+x.a);
		/****** Access static member class B members *******/
		System.out.println("Class B static variable: "+y.x);
		/****** Access static member class C members *******/
		System.out.println("Class C static variable: "+z.p);
		/****** Access non-static member class A members *******/
		x a1=new x();
		System.out.println("Class A non-static variable b: "+a1.b);
		System.out.println("Class A non-static variable c: "+a1.c);
		/****** Access non-static member class B members *******/
		y b1=new y();
		System.out.println("Class B non-static variable b: "+b1.y);
		System.out.println("Class B non-static variable c: "+b1.z);
		/****** Access non-static member class C members *******/
		z c1=new z();
		System.out.println("Class C non-static variable b: "+c1.q);
		System.out.println("Class C non-static variable c: "+c1.r);
	}
}

