///Java FileWriter Example
///In this example, we are writing the data in the file Abc.txt using Java FileWriter class. 
import java.io.FileWriter;
public class FileWriterExample 
{
public static void main(String args[])
{ try
{
FileWriter fw=new FileWriter("E:..\\FILE IO\\Abc1.txt");
 fw.write("Welcome to Chandigarh University."); 
fw.close();
}
catch(Exception e)
{
System.out.println(e);
} 
System.out.println("Success...");
}
}
