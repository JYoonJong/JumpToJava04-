
public class While1 {

	public static void main(String[] args) {
		int treeHit = 0;
		while(treeHit < 10) {
			treeHit++;
			System.out.println("������" + treeHit + "�� ������ϴ�.");
			if(treeHit == 10) {
				System.out.println("���� �Ѿ�ϴ�.");
			}
		}

		int coffee = 10;
		int money = 300;
		
		while(money > 0 ) {
			System.out.println("���� �޾����� Ŀ�Ǹ� �ݽô�.");
			coffee --;
			System.out.println("���� Ŀ�Ǵ�" + coffee +" �Դϴ�.");
			if(coffee == 0) {
				System.out.println("Ŀ�ǰ� �����Ǿ����ϴ�");
				break;
			}
		}
		
		int a = 0;
		while(a<10) {
			a++;
			if(a %2 ==0) {
				continue;
			}
			System.out.println(a);
			}
		
		
		
		
	}

}
