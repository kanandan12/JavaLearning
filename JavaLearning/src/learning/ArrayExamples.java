package learning;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"BMW", "Benz", "Tesla", "Volvo", "Toyota", "Honda"};
		
		/*
		 * // For loop for(int i=0; i<cars.length; i++) { System.out.println(cars[i]); }
		 */
		 
		
		// For each loop 
		for(String i: cars) {
			System.out.println(i);
		}

	}

}
