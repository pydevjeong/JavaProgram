import java.util.Scanner;

public class moreMon {
	
	static int add=0;
	
	public void moreMon() {
		Scanner scan=new Scanner(System.in);
		Screen sc=new Screen();
		Selector tor=new Selector();
		
		System.out.println("돈을 더 넣으실건가요?? 좋습니다");
		System.out.println("추가할 금액 : ");
		add= scan.nextInt();
		sc.money+=add;
		tor.selectDrink(sc.money);
	}
}
