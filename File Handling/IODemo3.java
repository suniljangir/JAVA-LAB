///Example of Reading the data of current file and writing it into another file
//We can read the data of any file using the FileInputStream class whether it is java file, image file, video file etc. In this example, we are reading the data of Abc.txt file and writing it into another file Bbc.txt in d:/test directory.

import java.io.*; 
class IODemo3
{
public static void main (String[] args) throws IOException 
{ 
FileInputStream fin=new FileInputStream("E:..\\FILE IO\\abc.txt"); 
FileOutputStream fout=new FileOutputStream("E:..\\FILE IO\\test.txt"); 
int i=0;
while((i=fin.read())!=-1)
{
fout.write(i); i++;
}
}
}
