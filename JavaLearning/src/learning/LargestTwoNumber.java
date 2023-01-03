package learning;

public class LargestTwoNumber {
	
	// Function to find the largest number
    static int largestNum(int a, int b)
    {
        return a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 22, b = 1231;
	    System.out.print(largestNum(a, b));
	    
		
		

	}

}
