package learning;

import java.util.Arrays;

public class ForEachExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"Kamal", "Kannan", "Anandan","Mari","Koushi"};
		
		System.out.println("For each method");
		//for each example 
		for (String string : name) {
			System.out.println(string);
		}
		
		// Sorting Method
		String temp;
		int nValue = name.length; 
		
		for(int i=0; i<nValue; i++) {
			for(int j=i+1; j<nValue; j++) {
				if(name[i].compareTo(name[j])>0) {
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		
		System.out.println( "\n\n" + "Soring order is:");
		for (String string : name) {
			System.out.println(string);
		}
		
		
		//In-Build sorting functions
		String[] names = {"zebra", "lion", "tiger","deer","buffalo"};
        Arrays.sort(names);
        
        System.out.println("\n\n" + "The names in alphabetical order are: ");
        for (String string : names) {
			System.out.println(string);
		}

	}

}
