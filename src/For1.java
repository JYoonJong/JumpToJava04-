
public class For1 {

	public static void main(String[] args) {
		String[] number = {"one","two","three"};
		for(int i=0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	
		int[] marks = {90,25,67,45,80};
		for(int i=0; i<marks.length; i++ ) {
			if(marks[i] >60) {
				System.out.println((i+1)+"번 학생은 합격입니다.");
			}
			else
				System.out.println((i+1)+"번 학생은 불합격입니다.");
		}
	
		int[] marks1 = {90,25,67,45,80};
		for(int j=0; j<marks1.length; j++) {
			if (marks1[j] < 60) {
				continue;
			}
			System.out.println((j+1)+"번 학생 합격입니다.");
		}
		for(int k=2; k<10; k++) {
			for(int m=1; m<10; m++){
				System.out.print(k+" * " + m + " = " + k*m + " ");
			}
			System.out.println(" ");
			}
		
	}
}

