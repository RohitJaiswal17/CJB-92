package Practise.decisionmaking;

public class Method {

	public static void M1() {
		System.out.println("In M1, Outside the main method");
	}
	
	public void M2() {
		
		//Method m= new Method();
	
		Method.M1();
	
	}
	
	public static void main(String[] args) {
		
		Method obj=new Method();
		
		obj.M2();
	}
}
