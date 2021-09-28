//Default construtor & /para construtor

class Day2P4
{
int a,b;
	public static void main(String args[])
	{
	
	Day2P4 d2=new Day2P4();		// Creating object for calling constructor
	Day2P4 d3=new Day2P4(50,60);	// Creating object for calling para constructor
				
	}
	
	public Day2P4()				//Default construtor
	{
	a=0;
	b=0;	
	System.out.println("Default construtor A= "+a+" B = "+b);
	}
	
	public Day2P4(int x, int y)				//para construtor
	{
	a=x;
	b=y;	
	System.out.println("Parat construtor A= "+a+" B = "+b);
	}

}
