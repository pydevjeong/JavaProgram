import java.util.Scanner;

/* �ֻ��� ���ӿ� �ʿ��Ѱ�:
 * 
 * ��� , ��ǻ�� , �ΰ��� �� ��(����) , �������� �ݺ��Ұ��� , ����
 */


public class Dice {
	static int st;
	public int gmStart() {
		comPare pare=new comPare();
		Computer com=new Computer();
		Player play=new Player();
		Scanner scan=new Scanner(System.in);
		System.out.println("������ 1 || ����� 0");
		while(true) {
			st=scan.nextInt();
			if(st==0) {
				System.out.println("������ �����մϴ�");
				System.exit(0);
			}
			if(st==1) {
				System.out.println("�ֻ��� ���ӽ��� ��ǻ�� vs �ΰ�");
				System.out.println("��ǻ�ʹ� ���� : ����� �Է�");
				System.out.println("�ֽ��� ���� ����");
				int me=play.player();
				int bot=com.com();
				pare.compBoth(me, bot);
			}
		}
	}
}
