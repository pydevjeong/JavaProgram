import java.util.Scanner;

public class Square {
	public void calSquare() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int s=0;
		System.out.println("���簢���� ���ϴ� ���α׷��Դϴ�");
		System.out.println("�Ѻ��� ���̸� �Է��ϼ��� : ");
		
		s= scan.nextInt();
		
		System.out.println("���� ���̴� "+s+"�̰� ���̴� "+s*s+"�Դϴ�.");
		
		mor.moreCalCul();
		
		
	}
}
