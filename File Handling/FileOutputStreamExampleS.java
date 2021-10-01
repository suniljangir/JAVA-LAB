//Java FileOutputStream example 2: write string

import java.io.FileOutputStream;

public class FileOutputStreamExampleS 
{ 
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("E:..\\FILE IO\\test.txt"); 
String s="Welcome to Chandigarh University.";
byte b[]=s.getBytes();//converting string into byte array 
fout.write(b);
fout.close(); 
System.out.println("success...");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
