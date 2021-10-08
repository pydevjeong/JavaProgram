
public class Zapangi {
	public static void main(String[] args) {
		System.out.println("음료수 자판기 ~~~~");
		System.out.println("1.콜라 ( 1000 ) 2. 환타 ( 800 ) 3.커피 (600 ) 4.물 (1500)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("돈을 먼저 투입하시오");
		System.out.println();
		Screen s=new Screen();
		s.inputcoin();
	}
}
