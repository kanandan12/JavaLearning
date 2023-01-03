package learning;
import java.util.Scanner;

public class SpiralPatternExample {

	public static void main(String[] args) {
		
		System.out.print("Enter The Value For N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] spiral = new int[n][n];
        
        int minRow = 0;
        int maxRow = n-1;
        int minCol = 0;
        int maxCol = n-1;
        int value = 1;
        
        while (value <= n*n) {
        	
        	for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;     
                value++;
            }
        	for (int i = minRow+1; i <= maxRow; i++) {
        		spiral[i][maxCol] = value;
        		value++; 
            }
        	
        	for (int i = maxCol-1; i >= minCol; i--) {
            	spiral[maxRow][i] = value;
            	value++;
            }
        	for (int i = maxRow-1; i >= minRow+1; i--) {
            	spiral[i][minCol] = value;
            	value++;
            }
             
            
            
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;  
        }
         
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
            	System.out.print(spiral[i][j]+ "\t");
            }
            System.out.println();
        }
        
        sc.close();
        
		/*
		 * // TODO Auto-generated method stub int my_input , i, j,my_pattern_size ;
		 * System.out.println("Required packages have been imported"); my_input = 5;
		 * System.out.println("The size is defined as " +my_input);
		 * System.out.print("The spiral pattern "); System.out.println();
		 * my_pattern_size = 1 * my_input;
		 * 
		 * for( i = 1; i <= my_pattern_size; i++){ for( j = 1; j <= my_pattern_size;
		 * j++){ System.out.print(Math.max(Math.abs(i - my_input), Math.abs(j -
		 * my_input)) + 1 + " "); } System.out.println(); }
		 */
		
		
		

	}

}
