import java.util.Scanner;

public class Player {
	public int player() {
		System.out.println("사람 숫자 입력 : ");
		Scanner scan=new Scanner(System.in);
		int pe = scan.nextInt();
		if(pe>6) {
			System.out.println("1~6까지만 입력하세요");
		}
		else if (pe<0) {
		System.out.println("1~6까지만 입력하세요");
		}
		else {
		System.out.println("값이 넘어갑니다~");
	}
		return pe;
	}
}
