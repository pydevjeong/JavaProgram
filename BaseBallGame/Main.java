import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("�߱� �����̴� ��Ģ-> �ڸ����� ��ȣ�� ��ġ(��Ʈ����ũ)");
		System.out.println("��ȣ�� ������ ��");
		System.out.println("3���� ���ڸ� �Է��ؼ� ��ǻ�Ͱ� ������ ���ڸ� �����");
		Hitter hit=new Hitter();
		Picther pit=new Picther();
		Baseball ball=new Baseball();
		Scanner scan=new Scanner(System.in);
		int start;
		System.out.println("�����Ϸ��� 1 || �����Ϸ��� 0");
		while (true) {
			start=scan.nextInt();
			if(start==0) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			if(start==1) {
				ball.compareBoth();
			}
		}
		
		
	}
}
