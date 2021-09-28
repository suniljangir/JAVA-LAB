//Method overloading in the class------ Same name but different argument list.
//different argument list( By type of argument , By order of argument , By number of argument )
//By type of argument method(int, int) or method(float, float)
//By order of argument method(int, float) or method(float, int)
//By number of argument method(int, int) or method(int, int, int)
//Method overloading
class Day5P1	
{
public void sum()
{
	System.out.println("Default sum is ZERO ");
}
public void sum(int x, int y)
{
	System.out.println("Sum of both int values is "+(x+y));
}
public void sum(float x, float y)
{
	System.out.println("Sum of both float values is "+(x+y));
}
public void sum(int x, int y, int z)
{
	System.out.println("Sum of all 3 int values is "+(x+y+z));
}
public void sum(float x, float y, float z)
{
	System.out.println("Sum of all 3 float values is "+(x+y+z));
}

	public static void main(String args[])
	{
	Day5P1	obj = new Day5P1();
	obj.sum();				
	obj.sum(10,20);
	obj.sum(20.5f, 30.5f);
	obj.sum(10,20,30);
	obj.sum(10.30f, 20.60f, 30.10f);
	}


}
