import java.util.Scanner;

public class Rectangle {
	public void calRec() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int s=0;
		int t=0;
		System.out.println("���簢���� ���ϴ� ���α׷��Դϴ�");
		System.out.println("�κ��� ���̸� �Է��ϼ��� : ");
		
		s= scan.nextInt();
		t= scan.nextInt();
		
		System.out.println("���� ���̴� "+s+"�̰� ���̴� "+s*t+"�Դϴ�.");
		
		mor.moreCalCul();
	}
}
