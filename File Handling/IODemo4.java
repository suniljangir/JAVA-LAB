///Example of Java BufferedInputStream and BufferedOutputStream
import java.io.*; 
class IODemo4
{
public static void main(String args[]) 
{ 
try
{
FileInputStream fin=new FileInputStream("E:..\\FILE IO\\abc.txt"); 
BufferedInputStream bin=new BufferedInputStream(fin);
FileOutputStream fo=new FileOutputStream("E:..\\FILE IO\\test.txt"); 
BufferedOutputStream bo=new BufferedOutputStream(fo);
int ch; 
while((ch=bin.read())!=-1)
{
bo.write(ch); 
System.out.print(ch);
}
bo.close();
fo.close();
bin.close();
fin.close();
}
catch(IOException e)
{
}
 
}
}

