//creating interface

interface A
{
public abstract void showSomething();
}
interface B
{
public void diplaySomething();
}
interface C extends B		//Inheritence of interface
{
public void viewSomething();
}

class Day6P3 implements A,C	//implementing of inheritance
{

public void showSomething()
{
	System.out.println("Calling showSomething");
}
public void diplaySomething()
{
	System.out.println("Calling diplaySomething");
}
public void viewSomething()
{
	System.out.println("Calling viewSomething");
}

	public static void main(String args[])
	{
	Day6P3	obj = new Day6P3();
	obj.diplaySomething();
	obj.showSomething();
	obj.viewSomething();
	

	}


}