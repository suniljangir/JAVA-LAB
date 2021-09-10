class A
{
public A()
{
System.out.println("Default construtor of A class");
}
}
class B extends A
{
public B()
{
super();
System.out.println("Default construtor of B class");
}
}
class C extends B
{
public C()
{
super();
System.out.println("Default construtor of C class");
}
}
class Day2P6 extends C
{
int a,b;
	public static void main(String args[])
	{
	
	Day2P6 d2=new Day2P6();			// Creating object for calling dafault constructor
	
	}
	
	public Day2P6()				//Default construtor
	{
	super();
	System.out.println("Default construtor of Day2P6  class");
	}
	
	

}