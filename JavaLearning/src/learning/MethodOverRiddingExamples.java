package learning;

// Method Overriding or Dynamic Polymorphism or Run time Polymorphism

//In method overriding, methods must have the same name and same parameters.
//Method overriding is a run-time Polymorphism.
//It is performed in two classes with inheritance relationships.
//Method overriding always needs inheritance.

// Class Parent
class Animal {
	public void move() {
		System.out.println("Animal can Move");
	}
}

// Class Child
class Dog  extends Animal{
	//@Override
	public void move() {
		System.out.println("Dog can Walk and Run");
	}
}


public class MethodOverRiddingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj1 = new Animal();
        obj1.move();
        
        Animal obj2 = new Dog();
        obj2.move();
        
	}
}

	





