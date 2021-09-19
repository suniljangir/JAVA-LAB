///ArrayIndexOutOfBoundsException:-
///Whenever we are calling array with out of range at that moment we are getting 
///ArrayIndexOutOfBoundsException. 
///Example:-
class AiobeTest 
{ 
public static void main(String[] args) 
{ 
try 
{ 
int[] a={10,20,30}; 
System.out.println(a[0]);//10 
System.out.println(a[1]);//20 
System.out.println(a[2]);//30 
System.out.println(a[3]);//ArrayIndexOutOfBoundsException 
} 
catch (ArrayIndexOutOfBoundsException ae) 
{ 
System.out.println("geting ArrayIndexOutOfBoundsException"); 
} 
}
}