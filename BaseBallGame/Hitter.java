import java.util.Scanner;

//����� �Է����ؾ���
public class Hitter {
	public int[] hit() {
		Scanner scan=new Scanner(System.in);
		int[] man=new int[3];
		System.out.println("����� ��ȣ");
		System.out.println("3���� �ڿ����� �Է��ϼ���");
		for (int i = 0; i < man.length; i++) {
			man[i]=scan.nextInt();
			if(man[i]>10 || man[i]<1) {
				System.out.println("1~9������ ������ �Է��ϼ���");
			}
		}
		return man;
	}
}
