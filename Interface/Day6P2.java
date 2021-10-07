///creating interface

interface A
{
public abstract void showSomething();
public void diplaySomething();
}
class Day6P2 implements A	
{
public void showSomething()
{
	System.out.println("Calling showSomething");
}
public void diplaySomething()
{
	System.out.println("Calling diplaySomething");
}
	public static void main(String args[])
	{
	Day6P2	obj = new Day6P2();
	obj.diplaySomething();
	obj.showSomething();
	
	A a;		// creating reference of interface.
	a= new Day6P2();	//initializing object in reference
	a.diplaySomething();
	a.showSomething();
	}
}