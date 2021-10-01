///Requirement: Write code to create a file named with demo.txt in current working directory.
///Program:


import java.io.*; 
class FileDemo1
{
public static void main(String[] args)throws IOException
 
{
File f=new File("demo.txt"); 
f.createNewFile();
}
}
