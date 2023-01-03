package learning;

public class Code_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0; i < 5; i++) {
			if( i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		for (int j = 0; j <= 5; j++) {
			if( j == 2) {
				continue;
			}
			System.out.println(j);
		}
		
	}
}
