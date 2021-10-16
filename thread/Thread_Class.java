class A extends Thread
{
public void run()
{
System.out.println("Thread A"); for(int i=1;i<=1000;i++)
{
System.out.println("From thread A i = " + i);
}
System.out.println("Exit from A");

}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B"); for(int i=1;i<=1000;i++)
{
System.out.println("From thread B i = " + i);
}
System.out.println("Exit from B");
}
}
public class Thread_Class
{
public static void main(String[] args)
{
A t1=new A();//creating A class thread object 
B t2=new B();//creating B class thread object 
t1.start(); // calling run method
t2.start(); // calling run method 
System.out.println("End of main thread");
}
}
