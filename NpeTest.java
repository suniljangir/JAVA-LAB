///NullPointerException:-
///If we are having „null‟ in any variable in that variable we are performing any operation we are getting 
///NullpointerException. 
//Example:-
class NpeTest 
{ 
public static void main(String[] args) 
{ 
try 
{ 
String str="sunil"; 
System.out.println(str.length());//5 
String str1=null; 
System.out.println(str1.length());//NullPointerException 
} 
catch (NullPointerException ne) 
{ 
System.out.println("getting Null Pointer Exception"); 
} 
} 
}