import java.util.Scanner;

public class Circle {
	public void calCircle() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int r=0;
		System.out.println("���� ���ϴ� ���α׷��Դϴ�");
		System.out.println("���� �������� �Է��ϼ��� : ");
		
		r= scan.nextInt();
		
		System.out.println("�������� ���̴� "+r+"�̰� ���̴� "+r*r*3.14+"�Դϴ�.");
		
		mor.moreCalCul();
	}
}
