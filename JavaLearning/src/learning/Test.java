package learning;

/*public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/


/*public class Test{
	
	public static void main(String[] args){
		
		double d1 = Double.NaN;		
		double d2 = d1;
		
		if(d1 == d2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	
}*/


// Java treats value in single quotes as characters, so they are promoted to int value while
// using arithmetic operations. ASCII value of space character is 32. 
// So arithmetic expression will be like 10 + 32 + 25 = 67.
/*public class Test{	
	
	public static void main(String[] args){
		int i = 10;
		int j = 25;
		System.out.println(i + ' ' + j);
	}
}*/


/*public class Test {
	
	public static void main(String[] args){		
		
		int i = 10;
		int j = 12;
		i+=++j;
		System.out.println(i);

	}
}*/


// If the number starts with 0, it is considered to be an octal number in Java.
// 010 is 8 in octal, so when you run the code, it will print 8 instead of 10.
/*public class Test {
	
	public static void main(String[] args){
		int i = 010;
		System.out.println(i);
	}
}*/


/*public class Test{
	
	public static void main(String[] args){	
		byte b1 = 5, b2 = 2;
		byte b = (byte) (b1 % b2);
		System.out.println(b);
	}
}*/


// This is a trick question which makes you think of == vs equals method.
// The boolean (with small b) data type is a primitive type which does not have equals method and 
// hence the code will not compile. So options 1, 2 and 3 are incorrect. 
// Boolean (with capital B) is a wrapper class which has equals method.
/*public class Test{
	
	public static void main(String[] args){
		
		boolean b1 = true;
		boolean b2 = true;

		if(b1 == b2){
			System.out.print("==");
		}

		if(b1.equals(b2)){
			System.out.print("equals");
		}
	}
}*/


//  length is a property of an array, not a method. Hence code will show compile time error. 
/*public class Test{
	
	public static void main(String[] args){		
		int array[] = new int[1];
		array[0] = 100;

		System.out.println(array.length());
	}
}*/


/*public class Test{
	
	static String szName = "Test";

	public Test(){
		szName = "TestObject";
	}
	
	public static void main(String[] args){	
		System.out.println("Name is " + szName);
	}	
}*/


// In Java, all the floating point literals like “10.2” are of type double by default. 
// In order to assign this value to a float variable, the expression either needs an 
// explicit cast or the literal needs to mention f or F at the end, for example, 10.2f.
/*public class Test{
	
	public static void main(String[] args){
		
		float f = 10.2;
		double d = 10.2;
		
		if(f == d)
			System.out.println("Same");
		else
			System.out.println("Not same");		
	}
}*/


// The code will throw run time error. The code does not declare main method using correct syntax. 
// Correct syntax of the main method is,
/*public class Test{
	
	public static void main(String args) {
		int i = 5, j = 2;
		System.out.println( i % j );
	}
}*/



