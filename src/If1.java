import java.util.ArrayList;

public class If1 {

	public static void main(String[] args) {
		int money = 2000;
		boolean Card = true;
		if(money >= 3000 || Card) {
			System.out.println("�ýø� Ÿ����.");
		}
		else
			System.out.println("�ɾ����.");
		
		
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("�ý�Ÿ����.");
			
		}
		else
			System.out.println("�ɾ�ʽÿ�.");
		
		ArrayList<String> pocket1 = new ArrayList<>();
		pocket1.add("paper");
		pocket1.add("handphone");
		if(pocket1.contains("money")) {
			System.out.println("�ý�");			
		}
		else if(Card) {
			System.out.println("�ý�1"); 
		}
		else
			System.out.println("�ɾ");
	}		
}
