///Requirement: Write code to create a directory named with sunil123 in current working directory 
///and create a file named with jangir.txt in that directory.
///Program:


import java.io.*; 
class FileDemo2
{
public static void main(String[] args)throws IOException
{
File f1=new File("sunil123");
f1.mkdir();
File f2=new File("sunil123","jangir.txt"); 
f2.createNewFile();
}
}
