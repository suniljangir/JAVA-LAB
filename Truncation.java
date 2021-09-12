///Truncation
///When a floating-point value is assigned to an integer type, 
///the fractional component is lost, because integers do not have fractional components. 
///such type of conversion in called truncation.
///An Example:


class Truncation{
public static void main(String args[]) {
byte b;
int i = 260;
double d = 330.14;
System.out.println("\nConversion of double to int.");
i = (int) d;
System.out.println("d and i " + d + " " + i);

System.out.println("\nConversion of double to byte.");
b = (byte) d;
System.out.println("d and b " + d + " " + b);
}
}
