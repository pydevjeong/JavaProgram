import java.util.Random;

public class Computer {
	public int com() {
		Random rand=new Random();
		Dice di=new Dice();
		int c;
		System.out.println("컴퓨터가 무작위로 1~6의 수를 생성합니다.");
		c=rand.nextInt(6)+1; //1~6까지 생성
		return c;
	}
}
