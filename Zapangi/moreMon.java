import java.util.Scanner;

public class moreMon {
	
	static int add=0;
	
	public void moreMon() {
		Scanner scan=new Scanner(System.in);
		Screen sc=new Screen();
		Selector tor=new Selector();
		
		System.out.println("���� �� �����ǰǰ���?? �����ϴ�");
		System.out.println("�߰��� �ݾ� : ");
		add= scan.nextInt();
		sc.money+=add;
		tor.selectDrink(sc.money);
	}
}
