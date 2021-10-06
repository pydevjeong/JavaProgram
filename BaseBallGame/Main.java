import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("야구 게임이다 규칙-> 자릿수와 번호가 일치(스트라이크)");
		System.out.println("번호만 맞으면 볼");
		System.out.println("3개의 숫자를 입력해서 컴퓨터가 생성한 숫자를 맞춰라");
		Hitter hit=new Hitter();
		Picther pit=new Picther();
		Baseball ball=new Baseball();
		Scanner scan=new Scanner(System.in);
		int start;
		System.out.println("시작하려면 1 || 종료하려면 0");
		while (true) {
			start=scan.nextInt();
			if(start==0) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			if(start==1) {
				ball.compareBoth();
			}
		}
		
		
	}
}
