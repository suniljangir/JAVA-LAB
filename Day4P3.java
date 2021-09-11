//Access modifiers outside the package
import Temp.Day4P3A;		//Importing package created by Day4P3A.java program
class Day4P3 extends Day4P3A
{


	public static void main(String args[])
	{
	Day4P3	obj = new Day4P3();
	//System.out.println("Default A = "+obj.A);	// Can not access Default outside the package, If we try it produce error
	//System.out.println("Private B = "+obj.B);	// Can not access Private outside the class, If we try it produce error
	System.out.println("Public  C = "+obj.C);
	System.out.println("Protected D = "+obj.D);

	}


}