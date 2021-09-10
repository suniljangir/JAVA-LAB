//Access modifiers within the class
class Day4P1	
{
int A=5;
private int B=10;
public int C=20;
protected int D=30;

	public static void main(String args[])
	{
	Day4P1	obj = new Day4P1();
	System.out.println("Default A = "+obj.A);
	System.out.println("Private B = "+obj.B);
	System.out.println("Public  C = "+obj.C);
	System.out.println("Protected D = "+obj.D);

	}


}