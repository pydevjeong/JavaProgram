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
			System.out.println("금액이 부족합니다");
			System.out.println("금액을 더 넣어주세요 (y\n)");
			sel =scan.next().charAt(0);
			
			if (sel=='y' || sel == 'Y') {
				mon.moreMon();
			}else if (sel=='n' || sel == 'N') {
				System.out.println("거스름돈 반환");
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
			
			System.out.println("뽑으신 음료수는"+drink+ "이며 거스름돈은"+money +"원 입니다.");
			System.out.println("5000원"+m_5000+" , ");
			System.out.println("1000원"+m_1000+" , ");
			System.out.println("500원"+m_500+" , ");
			System.out.println("100원"+m_100+" , ");
			System.out.println("50원"+m_50+" , ");
			System.out.println("10원"+m_10+" , ");
		}
	}
}

