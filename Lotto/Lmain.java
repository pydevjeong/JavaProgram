import java.util.Scanner;

public class Lmain {
	static int s;
	public static void main(String[] args) {
		user ur=new user();
		computer co=new computer();
		compare pare=new compare();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("로또~~~~~~");
		System.out.println("0이면 종료 || 1이면 시작");
		while(true) {
			s=scan.nextInt();
			if(s==0) {
				System.exit(0);
			}
			else if(s==1) {
				System.out.println("게임 시작");
				pare.compNum();
			}
		}

	}
}
