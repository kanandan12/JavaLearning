package learning;

class Demo {
	
	private String empname;
	
	//Get method
	public String getEmpName() {
		return empname;
	}
	
	// Set method	
	public void setEmpName(String strName) {
		empname = strName;
	}
}

public class EncapsulationExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new Demo();
		obj.setEmpName("Harry");
		
		System.out.println(obj.getEmpName());

	}

}
