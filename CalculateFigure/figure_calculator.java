import java.util.Scanner;

/* 
�������ϱ� => � ������ ������, ������ ���� ����
 */

public class figure_calculator {
	public void whichFigure() {
		int selectFigure=0;
		Scanner scan=new Scanner(System.in);
		Square sq=new Square();
		Triangle tri=new Triangle();
		Rectangle rec=new Rectangle();
		Circle cir=new Circle();
		System.out.println("1: ���簢�� , 2: �ﰢ�� , 3: ���簢��  4:��");
		System.out.println("���߷��� 0�� �Է��ϼ���");
		selectFigure=scan.nextInt();
		
		while(true) {
			if(selectFigure==0) {
				System.out.println("����Ǿ����ϴ�.");
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
				System.out.println("1~4�߿��� �����Ͻÿ�");
				whichFigure();
			}
		}
	
	}
}
