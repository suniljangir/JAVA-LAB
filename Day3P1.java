/// Single level inheritance

class A				//Super class
{
int X=10;
}

class Day3P1 extends A		// sub/child class
{
int Y=20;
	public static void main(String args[])
	{
		Day3P1  obj=new Day3P1  ();
		System.out.println("X = "+obj.X+" Y = "+obj.Y);	// Accesing super class value using sub class object	
	
	}


}
