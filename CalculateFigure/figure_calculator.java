import java.util.Scanner;

/* 
도형구하기 => 어떤 도형을 구할지, 도형의 변과 높이
 */

public class figure_calculator {
	public void whichFigure() {
		int selectFigure=0;
		Scanner scan=new Scanner(System.in);
		Square sq=new Square();
		Triangle tri=new Triangle();
		Rectangle rec=new Rectangle();
		Circle cir=new Circle();
		System.out.println("1: 직사각형 , 2: 삼각형 , 3: 정사각형  4:원");
		System.out.println("멈추려면 0을 입력하세요");
		selectFigure=scan.nextInt();
		
		while(true) {
			if(selectFigure==0) {
				System.out.println("종료되엇습니다.");
				System.exit(0);
			}
			if(selectFigure==1) {
				sq.calSquare();
			}
			else if(selectFigure==2) {
				tri.calTriangle();
			}
			else if(selectFigure==3) {
			rec.calRec();
			}
			else if(selectFigure==4) {
				cir.calCircle();
			}
			else {
				System.out.println("1~4중에만 선택하시오");
				whichFigure();
			}
		}
	
	}
}
