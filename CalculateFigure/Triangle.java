import java.util.Scanner;

public class Triangle {
	public void calTriangle() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int s=0;
		int h=0;
		System.out.println("�ﰢ���� ���ϴ� ���α׷��Դϴ�");
		System.out.println("�Ѻ��� ���̿� ���̸� �Է��ϼ��� : ");
		
		s= scan.nextInt();
		h= scan.nextInt();
		
		System.out.println("���� ���̴� "+s+"�̰� ���̴� "+s*h/2+"�Դϴ�.");
		
		mor.moreCalCul();
	}
}
