import java.util.Scanner;

/* 주사위 게임에 필요한것:
 * 
 * 사람 , 컴퓨터 , 두개의 값 비교(승패) , 언제까지 반복할건지 , 메인
 */


public class Dice {
	static int st;
	public int gmStart() {
		comPare pare=new comPare();
		Computer com=new Computer();
		Player play=new Player();
		Scanner scan=new Scanner(System.in);
		System.out.println("시작은 1 || 종료는 0");
		while(true) {
			st=scan.nextInt();
			if(st==0) {
				System.out.println("게임을 종료합니다");
				System.exit(0);
			}
			if(st==1) {
				System.out.println("주사위 게임시작 컴퓨터 vs 인간");
				System.out.println("컴퓨터는 랜덤 : 사람은 입력");
				System.out.println("주시위 게임 시작");
				int me=play.player();
				int bot=com.com();
				pare.compBoth(me, bot);
			}
		}
	}
}
