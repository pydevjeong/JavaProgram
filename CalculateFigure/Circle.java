import java.util.Scanner;

public class Circle {
	public void calCircle() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int r=0;
		System.out.println("원을 구하는 프로그램입니다");
		System.out.println("원의 반지름을 입력하세요 : ");
		
		r= scan.nextInt();
		
		System.out.println("반지름의 길이는 "+r+"이고 넓이는 "+r*r*3.14+"입니다.");
		
		mor.moreCalCul();
	}
}
