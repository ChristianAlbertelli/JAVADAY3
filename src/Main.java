
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1,num2;
		float result;

		num1="34";
		num2="3.7";
		
		try {
		
		result =Float.parseFloat(num1)/Float.parseFloat(num2);
		System.out.println("Result is: "+result);
		}
		
		catch(ArithmeticException ref2) {
			
			System.out.println("Cant divide by 0");
		}
		catch(Exception ref) {
			System.out.println("Something went wrong");
			
		}
		/*catch(ArithmeticException ref2) {
			
			System.out.println("Cant divide by 0");
		}*/
		
	}

}
