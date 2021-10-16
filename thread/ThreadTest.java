class ThreadTest
{
public static void main(String [] args)
{
Test t1=new Test("Hello"); 
Test t2=new Test("World");
t1.start();
t2.start();
}
}
class Test extends Thread
{
String msg; Test(String m)
{
msg=m;
}
public void run()
{
for(int i=1;i<=1000;i++)
{
System.out.println(msg);
}
}
}
