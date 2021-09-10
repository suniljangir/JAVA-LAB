// Hybrid inheritance(Mix of two inheritance)

class A				//Super class
{
int X=10;
}
class B extends A			//Super class for class C and sub class for A
{
int Y=20;
}
class C extends B			//sub class for B
{ 
int temp=40;
}
class Day3P4 extends A 		//sub class for A
{	
int Z=30;
	public static void main(String args[]){
		Day3P4  obj=new Day3P4  ();
		System.out.println("Day3P4 class object => \t X = "+obj.X+" Z = "+obj.Z);		// Accesing super class value using sub class object
	
		C c=new C();
		System.out.println("C class Object => \t X = "+c.X+" Y = "+c.Y+" Temp = "+c.temp);	// Accesing super class value using sub class object
	
	}

}