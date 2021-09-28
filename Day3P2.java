/// Multilevel level inheritance

class A				//Super class
{
int X=10;
}
class B extends A			//Super class for Day3P2 and sub class for A
{
int Y=20;
}
class Day3P2 extends B		// sub class for A
{
int Z=30;
	public static void main(String args[])
	{
		Day3P2  obj=new Day3P2  ();
		System.out.println("X = "+obj.X+" Y = "+obj.Y+" Z = "+obj.Z);		// Accesing super class value using sub class object
	
	}


}
