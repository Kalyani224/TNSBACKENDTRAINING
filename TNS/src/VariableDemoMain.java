
public class VariableDemoMain {

	public static void main(String[] args) {
		VariableDemo ob=new VariableDemo();
		System.out.println("This is instance variable");
		ob.display();
		//calling Static variable
		System.out.println(VariableDemo.college);
	}

}
