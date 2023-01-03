package learning;


// Method Overloading or Static Polymorphism or Compile time Polymorphism

// Method overloading, multiple methods can have the same name with different parameters.
// Method overloading is a compile-time polymorphism.
// It occurs within the class.
// Method overloading may or may not require inheritance.

public class MethodOverloadingExamples {
	
	public void Form(String name, long phoneno, String emailaddress) {
		System.out.println("Customer Name: " +name);
		System.out.println("Customer Phone Number: " +phoneno);
		System.out.println("Customer Email Address: " +emailaddress+ "\n");		
	}

	public void Form(String name, long phoneno1, long phoneno2, String emailaddress) {	
		System.out.println("Customer Name: " +name);
		System.out.println("Customer First Phone Number: " +phoneno1);
		System.out.println("Customer Second Phone Number: " +phoneno2);
		System.out.println("Customer Email Address: " +emailaddress);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingExamples customer = new MethodOverloadingExamples();
				
		customer.Form("Kamalakannan", 414249153, "kamalakannan.anandan@gmail.com");
		customer.Form("Kamalakannan", 515519061, 414808664, "anandan.kamal12@gmail.com");
		
	}

}


/*			
// Get Customer Name
System.out.println("Enter the Customer name, Phone no and Email address:");
Scanner firstCustName = new Scanner(System.in);
String firstName = firstCustName.nextLine();
		
// Get Customer Phone Number
Scanner firstCustPhoneNo = new Scanner(System.in);  
Long firstPhoneNo = firstCustPhoneNo.nextLong();

// Get Customer Email Address
Scanner firstCustEmail = new Scanner(System.in);  
String firstEmail = firstCustEmail.nextLine();
*/
