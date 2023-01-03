package learning;

public class AbstractImplementExample extends  AbstractClassExample implements InterfaceExample{
	
	// Extends Abstract Method
	public void sportsBike() {
		System.out.println("Extends Abstract Methods");
		System.out.println("Yamaha R1, R6, R3 and R15 are Sports Bike"); 
	}
	
	// Interface class only implements
	// and provide functions to the method in another class.
	public void animalsound() {
		System.out.println("Implements Iterface Methods");
		System.out.println("All Animal Make Sounds");
	}
	
	public void sleep() {
		System.out.println("All animal can sleep");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractImplementExample obj = new AbstractImplementExample();
		obj.sportsBike();
		obj.commercialBike();
		
		obj.animalsound();
		obj.sleep();

	}

}
