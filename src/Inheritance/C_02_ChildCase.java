package Inheritance;

public class C_02_ChildCase extends C_01_BaseClass {
	public void mul()
	{
		System.out.println("Multiplication is 250");
	}
	
	public void div()
	{
		System.out.println("Division is 100");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_02_ChildCase ob=new C_02_ChildCase();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		System.out.println("==============");
		C_01_BaseClass ob2=new C_01_BaseClass();
		ob2.add();
		ob.sub();
		System.out.println("==============");

	}

}
