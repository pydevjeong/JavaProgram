import java.util.Scanner;

public class Rectangle {
	public void calRec() {
		Scanner scan=new Scanner(System.in);
		moreCal mor=new moreCal();
		int s=0;
		int t=0;
		System.out.println("직사각형을 구하는 프로그램입니다");
		System.out.println("두변의 길이를 입력하세요 : ");
		
		s= scan.nextInt();
		t= scan.nextInt();
		
		System.out.println("변의 길이는 "+s+"이고 넓이는 "+s*t+"입니다.");
		
		mor.moreCalCul();
	}
}
