import java.util.Scanner;

public class Player {
	public int player() {
		System.out.println("��� ���� �Է� : ");
		Scanner scan=new Scanner(System.in);
		int pe = scan.nextInt();
		if(pe>6) {
			System.out.println("1~6������ �Է��ϼ���");
		}
		else if (pe<0) {
		System.out.println("1~6������ �Է��ϼ���");
		}
		else {
		System.out.println("���� �Ѿ�ϴ�~");
	}
		return pe;
	}
}
