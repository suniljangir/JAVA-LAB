class Demo4
{
private int x;
private int y;

void input (int a, int b)
{
x=a;
y=b;
}

void show()
{
System.out.println(x);
System.out.println(y);
}

public static void main(String args[])
{
Demo4 d1=new Demo4();	
Demo4 d2=new Demo4();
d1.input(10,20);
d2.input(30,40);
d1.show();
d2.show();
}

}