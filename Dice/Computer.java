import java.util.Random;

public class Computer {
	public int com() {
		Random rand=new Random();
		Dice di=new Dice();
		int c;
		System.out.println("��ǻ�Ͱ� �������� 1~6�� ���� �����մϴ�.");
		c=rand.nextInt(6)+1; //1~6���� ����
		return c;
	}
}
