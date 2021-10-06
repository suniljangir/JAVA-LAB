///Java SequenceInputStream Example that reads the data from two files and writes into another file
///In this example, we are writing the data of two files Abc.txt and Bbc.txt into another file named
///Cbc.txt.
import java.io.*; 
class IODemo6 {
public static void main(String args[])
 { try
{
FileInputStream fin1=new FileInputStream("E:..\\FILE IO\\abc.txt"); 
FileInputStream fin2=new FileInputStream("E:..\\FILE IO\\test.txt"); 
SequenceInputStream sis = new SequenceInputStream(fin1,fin2); 
FileOutputStream fo=new FileOutputStream("E:..\\FILE IO\\Cbc.txt");
int ch; 
while((ch=sis.read())!=-1)
{
fo.write(ch);
}
fo.close();
sis.close();
fin2.close();
fin1.close();
}
catch(IOException e)
{
}
}
}
