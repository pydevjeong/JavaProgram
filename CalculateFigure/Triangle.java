import java.util.Scanner;

public class Triangle {
	public void calTriangle() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int s=0;
		int h=0;
		System.out.println("삼각형을 구하는 프로그램입니다");
		System.out.println("한변의 길이와 높이를 입력하세요 : ");
		
		s= scan.nextInt();
		h= scan.nextInt();
		
		System.out.println("변의 길이는 "+s+"이고 넓이는 "+s*h/2+"입니다.");
		
		mor.moreCalCul();
	}
}
