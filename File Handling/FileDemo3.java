///Write code to create a file 
///named with demo.txt present in c:\xyz folder.
///Program:

import java.io.*; 
class FileDemo3
{
public static void main(String[] args)throws IOException
{
File f=new File("E:..\\File IO","demo1.txt"); 
f.createNewFile();
}
}
