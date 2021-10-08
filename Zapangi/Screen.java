import java.util.Scanner;

public class Screen {
	static int money;
	static Scanner s=new Scanner(System.in);
	
	public void inputcoin() {
		Selector sel=new Selector();
		Changer chan=new Changer();
		moreMon mr=new moreMon();
		char exit;
		
		while(true) {
			if(money==0) {
				System.out.println("금액을 입력하세요 ");
				money=s.nextInt();
				sel.selectDrink(money);
			}
				
				System.out.println("추가 선택? y || n");
				exit =s.next().charAt(0);
				
				money=chan.t_money;
				if(exit=='y'||exit=='Y') {
					sel.selectDrink(money);
				}

				else if(exit == 'n' || exit == 'N') {
					System.out.println("종료합니다.");
					break;
				}
				else {
					System.out.println("y 나 n 만 입력하세요");
				}
				System.out.println();
		}
		}
	}

