//�ΰ��� ���� �޾ƿͼ� �����ֱ�
//�ݺ����Ѽ� ��Ʈ����ũ���� ���� �ø���
public class Baseball {
	public void compareBoth() {
		Hitter hit=new Hitter();
		Picther pit=new Picther();
		int cnt=0;
		int strike = 0,ball=0;

		while(true) {
			int[] h=hit.hit();
			int[] p=pit.pitch();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(h[i]==p[i] && i==j) {
					strike++;
				}
				else if(h[i]==p[i] && i!=j) {
					ball++;
				}
			}
		}
		System.out.println(strike+"<-��Ʈ����ũ || ��->"+ball);
		if(strike==3) {
			break;
		}
		cnt++;
	}
		System.out.println("Ƚ��:"+cnt);
		System.out.println("��������");
}
}
