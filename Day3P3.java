/// Hierarchical level inheritance

class A				//Super class
{
int X=10;
}
class B extends A			// sub class for A
{
int Y=20;
}
class Day3P3 extends A		// sub class for A	
{
int Z=30;
	public static void main(String args[])
	{
		Day3P3  obj=new Day3P3  ();
		System.out.println("Day3P3 class object => X = "+obj.X+" Z = "+obj.Z);		// Accesing super class value using sub class object
		B b=new B();
		System.out.println("B class Object => X = "+b.X+" Y = "+b.Y);			// Accesing super class value using sub class object
			
	
	}


}
