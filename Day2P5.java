class Day2P5
{
int a,b;
	public static void main(String args[])
	{
	

	Day2P5 d2=new Day2P5();			// Creating object for calling dafault constructor
	Day2P5 d3=new Day2P5(50,60);			// Creating object for calling para constructor
	Day2P5 d4=new Day2P5(d3);			// Creating object for calling copy constructor
				
	
	}
	
	public Day2P5()				//Default construtor
	{
	a=0;
	b=0;	
	System.out.println("Default construtor A= "+a+" B = "+b);
	}
	public Day2P5(int x, int y)				//Para construtor
	{
	a=x;
	b=y;	
	System.out.println("Parat construtor A= "+a+" B = "+b);
	}
	public Day2P5(Day2P5 obj)				//Copy construtor
	{
	this.a=obj.a;
	this.b=obj.b;
	
	System.out.println("Copy construtor A= "+a+" B = "+b);
	}
	

}