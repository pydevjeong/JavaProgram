//두개의 값을 받아와서 비교해주기
//반복시켜서 스트라이크값과 볼값 올리기
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
		System.out.println(strike+"<-스트라이크 || 볼->"+ball);
		if(strike==3) {
			break;
		}
		cnt++;
	}
		System.out.println("횟수:"+cnt);
		System.out.println("게임종료");
}
}
