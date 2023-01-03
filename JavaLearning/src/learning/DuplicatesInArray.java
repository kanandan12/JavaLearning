package learning;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		// Define your java int array
        int[] nIntArray = new int[] {4,5,6,7,8,5,6,7};
        int nLenArray = nIntArray.length;
        
        System.out.println("Duplicate of Integer Array:");
        
        // Find duplicate in java int array
        for (int i=0; i<nIntArray.length; i++)
        {
            int nFirstIntArray = i + 1;
            int nFirstArrayValue = 0;
            
            while(nFirstIntArray < nLenArray){
                nFirstArrayValue = nIntArray[nFirstIntArray];
                if(nIntArray[i] == nFirstArrayValue ){
                    System.out.println(nIntArray[i]);
                    
                }
                 nFirstIntArray++;
                
            }
        }

	}

}
