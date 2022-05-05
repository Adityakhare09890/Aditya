package encapsulation;

public class student {
	private int pincode=422605;
public int getpincode() {
	return pincode;
}
public void setpincode(int pincode) {
	this.pincode=pincode;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s= new student();
System.out.println(s.getpincode());
s.setpincode(411605);
System.out.println(s.getpincode());

	}

}
