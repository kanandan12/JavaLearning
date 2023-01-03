package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {
	
	public void BufferMethod() {
		
		String given = "HarryPotter";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		
		System.out.println(buffer.reverse());
		
	}
	public void CharacterArrayMethod() {
		
		String given = "HarryPotter";
		String reverse = "";
		char[] characterArray = given.toCharArray();
						
		for(int i=characterArray.length-1; i>=0; i--) {
			reverse = reverse+characterArray[i];
				
		}
		System.out.println(reverse);
	}
	
	public void CollectionListMethod() {
		
		String given = "HarryPotter";
		char[] charArray = given.toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : charArray) {
			list.add(character);
		}
		
		Collections.reverse(list);
		ListIterator<Character> iteration = list.listIterator();
		
		while(iteration.hasNext()) {
			System.out.println(iteration.next());
		}
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseAString aString = new ReverseAString();
		aString.CollectionListMethod();
				
	}

}
