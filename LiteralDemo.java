class LiteralDemo{
public static void main(String a[]){
   		int decVal = 26;//decimal literal
 		int hexVal = 0x1a;//hexadecimal literal
int octVal = 012;//octal literal

System.out.println("decVal is "+decVal);
System.out.println("octVal is "+octVal);
System.out.println("hexVal is "+hexVal);
double d1 = 123.4;//double literal
double d2 = 1.234e2;//double literal with scientific notation
float f1  = 123.4f;//float literal

System.out.println("d1 is "+d1);
System.out.println("d2 is "+d2);
System.out.println("f1 is "+f1);

   		 char cc = '\u0063';//character literal with unicode escape
   	 char cd = 'd';//character literal
   		
 System.out.println("cc is "+cc);
   		 System.out.println("cd is "+cd);
}
}

///Literals of types char may contain any Unicode (UTF-16) characters.If your editor and file system allow it, you can use such characters directly in your code. If not,
///you can use a "Unicode escape" such as '\u0063' for alphabet c. Always use 'single quotes' for char literals.