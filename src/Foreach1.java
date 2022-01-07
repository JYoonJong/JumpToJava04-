import java.util.ArrayList;

public class Foreach1 {

	public static void main(String[] args) {
		String [] numbers = {"one","two","three"};
		for(String number : numbers) {
			System.out.println(number);
		}
		
		ArrayList<String> number2 = new ArrayList<>();
		number2.add("one");
		number2.add("two");
		number2.add("three");
		for(String number1 : number2) {
			System.out.println(number1);
		}
		

	}

}
