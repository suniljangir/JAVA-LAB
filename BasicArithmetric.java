///Basic arithmetic expressions include addition, subtraction, 
///multiplication and division. - and + both also have unary form.

///An Example:
class BasicArithmetric {
	public static void main(String args[]) {
    	int ia = 10 + 10;
    	int ib = ia - 10;
    	int ic = ib * 10;
    	int id = ic/ib;
   	 
    	System.out.println("Integer Addition is " + ia);
    	System.out.println("Integer Subtraction is " + ib);
    	System.out.println("Integer Multiplication is " + ic);
    	System.out.println("Integer Division is " + id);
   	 
    	double da = 1 + 1;
    	double db = da - 1;
    	double dc = db * 1;
    	double dd = dc/db;
   	 
    	System.out.println("Floating point Addition is " + da);
    	System.out.println("Floating point Subtraction is " + db);
    	System.out.println("Floating point Multiplication is " + dc);
    	System.out.println("Floating point Division is " + dd);
	}
}
