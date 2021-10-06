import java.util.Scanner;

//사람이 입력을해야함
public class Hitter {
	public int[] hit() {
		Scanner scan=new Scanner(System.in);
		int[] man=new int[3];
		System.out.println("사용자 번호");
		System.out.println("3개의 자연수를 입력하세요");
		for (int i = 0; i < man.length; i++) {
			man[i]=scan.nextInt();
			if(man[i]>10 || man[i]<1) {
				System.out.println("1~9사이의 정수를 입력하세요");
			}
		}
		return man;
	}
}
