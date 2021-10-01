
///A java File object can represent a directory also.

import java.io.*; 
class FileDirDemo
{
public static void main(String[] args)throws IOException
{
File f=new File("abc123");
System.out.println(f.exists());//false 
f.mkdir(); 
System.out.println(f.exists());//true
}
}


///Note: in UNIX everything is a file, java file IO 
///is based on UNIX operating system hence in 
///java also we can represent both files and directories by File object only.