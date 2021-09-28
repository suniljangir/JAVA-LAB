//Method overriding in ineritance------ Same name, same argument list but different class.
class A
{
 private void sum(int x, int y)
{
	System.out.println("In class A Sum of "+x+" and "+y +" is "+(x+y));
}
}

class B extends A
{
 void sum(int x, int y)
{
	System.out.println("In class B Sum of "+x+" and "+y +" is "+(x+y));
}
}class C extends B
{
protected void sum(int x, int y)
{
	System.out.println("In class C Sum of "+x+" and "+y +" is "+(x+y));
}
}class D extends C
{
public void sum(int x, int y)
{	
	System.out.println("In class D Sum of "+x+" and "+y +" is "+(x+y));
}
}

class Day5P2 extends D	
{
public void sum(int x, int y)
{
	System.out.println("In class Day5P2  Sum of "+x+" and "+y +" is "+(x+y));
}
public static void main(String args[])
	{
	A a = new A(); 	
	//a.sum(10,20);		//private function can not be called
	B a1 = new B();
	a1.sum(10,20);
	C a2= new C();
	a2.sum(10,20);
	D a3 = new D();
	a3.sum(10,20);
	Day5P2	obj = new Day5P2();
	obj.sum(10,20);
	}


}