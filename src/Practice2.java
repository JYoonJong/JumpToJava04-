
public class Practice2 {

	public static void main(String[] args) {
		// * ��� �ϴ� ���
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println(" ");
		}

		// 1~100���� ����ϴ� ���
		for(int k =1; k<101; k++) { 
			System.out.println(k);
		}
		
		// ��� ���ϴ� ���
		int[] marks = {70,60,55,75,96,90,80,80,85,100};
		int total = 0;
		for(int mark : marks) {
			total += mark;
		}
		double average = total/marks.length;
		System.out.println(average);
	}

}
