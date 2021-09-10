class Demo3
{
int rate;

Demo3()
{
System.out.println("Default constructor");
}
Demo3(int x) // para javajaconstructor
{
rate=x;
System.out.println("Para constructor");
}

public static void main(String args[])
{

Demo3 d1=new Demo3();	// Default object creation
Demo3 d2=new Demo3(10);	// Para object creation


}




}