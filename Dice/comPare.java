
public class comPare {
	public void compBoth(int st,int c) {
		Dice di=new Dice();
		if(st>c) {
			System.out.println("사람 승리");
			System.out.println(st+"<- 사람 || 컴퓨터->"+c);
			di.gmStart();
		}
		else if (st<c) {
			System.out.println("컴퓨터 승리");
			System.out.println(st+"<- 사람 || 컴퓨터->"+c);
			di.gmStart();
		}
		else if (st==c) {
			System.out.println("비김");
			System.out.println(st+"<- 사람 || 컴퓨터->"+c);
			di.gmStart();
		}
	}
}

