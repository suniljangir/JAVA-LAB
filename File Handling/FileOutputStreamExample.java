import java.io.FileOutputStream;

public class FileOutputStreamExample 
{ 
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("E:..\\File IO\\abc.txt"); 
fout.write(97);
fout.close(); 
System.out.println("written to file...");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
