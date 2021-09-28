///Access modifiers within the package
class A
{
int A=5;
private int B=10;
public int C=20;
protected int D=30;
}
class Day4P2 extends A
{
	public static void main(String args[])
	{
	Day4P1	obj = new Day4P1();
	System.out.println("Default A = "+obj.A);
	//System.out.println("Private B = "+obj.B);	// Can not access Private outside the class, If we try it produce error
	System.out.println("Public  C = "+obj.C);
	System.out.println("Protected D = "+obj.D);
	}
}
