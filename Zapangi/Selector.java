import java.util.Scanner;

public class Selector {
	final static int COKE=1000;
	final static int FANTA=800;
	final static int COFFEE=600;
	final static int WATER=1500;
	
	final static String D1= "COKE";
	final static String D2= "FANTA";
	final static String D3= "COFFEE";
	final static String D4= "WATER";
	
	static void selectDrink(int money) {
		Changer ch=new Changer();
		Scanner scan=new Scanner(System.in);
		int sel;
		System.out.println("음료수를 선택하시오 : ");
		sel= scan.nextInt();
		
		if (sel <1 || sel >4) {
			System.out.println("선택오류 : 1~4중 다시선택");
			selectDrink(money);
		} else {
			switch (sel) {
			case 1: {
				ch.change(money,COKE,D1);
				break;
			}
			case 2: {
				ch.change(money,FANTA,D2);
				break;
			}
			case 3: {
				ch.change(money,COFFEE,D3);
				break;
			}
			case 4: {
				ch.change(money,WATER,D4);
				break;
			}
			
			default:
				System.out.println("오류");
				break;
			}
		}
	}
	}
