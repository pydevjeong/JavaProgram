
public class comPare {
	public void compBoth(int st,int c) {
		Dice di=new Dice();
		if(st>c) {
			System.out.println("��� �¸�");
			System.out.println(st+"<- ��� || ��ǻ��->"+c);
			di.gmStart();
		}
		else if (st<c) {
			System.out.println("��ǻ�� �¸�");
			System.out.println(st+"<- ��� || ��ǻ��->"+c);
			di.gmStart();
		}
		else if (st==c) {
			System.out.println("���");
			System.out.println(st+"<- ��� || ��ǻ��->"+c);
			di.gmStart();
		}
	}
}

