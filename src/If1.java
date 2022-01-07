import java.util.ArrayList;

public class If1 {

	public static void main(String[] args) {
		int money = 2000;
		boolean Card = true;
		if(money >= 3000 || Card) {
			System.out.println("택시를 타세요.");
		}
		else
			System.out.println("걸어가세요.");
		
		
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시타세요.");
			
		}
		else
			System.out.println("걸어가십시오.");
		
		ArrayList<String> pocket1 = new ArrayList<>();
		pocket1.add("paper");
		pocket1.add("handphone");
		if(pocket1.contains("money")) {
			System.out.println("택시");			
		}
		else if(Card) {
			System.out.println("택시1"); 
		}
		else
			System.out.println("걸어가");
	}		
}
