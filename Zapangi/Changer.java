import java.util.Scanner;

public class Changer {
	static int t_money=0;
	
	public void change(int money,int s,String drink) {
		Selector cho=new Selector();
		Screen scr=new Screen();
		moreMon mon=new moreMon();
		Scanner scan=new Scanner(System.in);
		int tmp;
		int m_5000,m_1000,m_500,m_100,m_50,m_10;
		char sel;
		int changeSet=0;
		
		
		if (money < s) {
			System.out.println("�ݾ��� �����մϴ�");
			System.out.println("�ݾ��� �� �־��ּ��� (y\n)");
			sel =scan.next().charAt(0);
			
			if (sel=='y' || sel == 'Y') {
				mon.moreMon();
			}else if (sel=='n' || sel == 'N') {
				System.out.println("�Ž����� ��ȯ");
				System.exit(0);
			}else {
				cho.selectDrink(money);
			}
			
		}else {
			money=money-s;
			t_money=money;
			m_5000= money / 5000;
			tmp=money % 5000;
			
			m_1000 = tmp /1000;
			tmp=money%1000;
			
			m_500= money / 500;
			tmp=money % 500;
			
			m_100 = tmp /100;
			tmp=money%100;
			
			m_50= money / 50;
			tmp=money % 50;
			
			m_10 = tmp /10;
			
			System.out.println("������ �������"+drink+ "�̸� �Ž�������"+money +"�� �Դϴ�.");
			System.out.println("5000��"+m_5000+" , ");
			System.out.println("1000��"+m_1000+" , ");
			System.out.println("500��"+m_500+" , ");
			System.out.println("100��"+m_100+" , ");
			System.out.println("50��"+m_50+" , ");
			System.out.println("10��"+m_10+" , ");
		}
	}
}

