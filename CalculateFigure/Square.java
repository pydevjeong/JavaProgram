import java.util.Scanner;

public class Square {
	public void calSquare() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int s=0;
		System.out.println("정사각형을 구하는 프로그램입니다");
		System.out.println("한변의 길이를 입력하세요 : ");
		
		s= scan.nextInt();
		
		System.out.println("변의 길이는 "+s+"이고 넓이는 "+s*s+"입니다.");
		
		mor.moreCalCul();
		
		
	}
}
