
public class While1 {

	public static void main(String[] args) {
		int treeHit = 0;
		while(treeHit < 10) {
			treeHit++;
			System.out.println("나무를" + treeHit + "번 찍었습니다.");
			if(treeHit == 10) {
				System.out.println("나무 넘어갑니다.");
			}
		}

		int coffee = 10;
		int money = 300;
		
		while(money > 0 ) {
			System.out.println("돈을 받았으니 커피를 줍시다.");
			coffee --;
			System.out.println("남은 커피는" + coffee +" 입니다.");
			if(coffee == 0) {
				System.out.println("커피가 소진되었습니다");
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
