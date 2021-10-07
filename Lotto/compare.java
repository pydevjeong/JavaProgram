import java.util.Iterator;

//두개의 배열을 비교 보너스번호 생각
public class compare {
	public void compNum() {
		user ur=new user();
		computer co=new computer();
		int[] buy=ur.buyer();
		int[] com=co.com();
		int count=0;
		int bonus=0;
		System.out.println("당첨을 확인하는 시간 ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(buy[i]==com[j]) {
					count++;
				}
			}
		}
		
		if(count==6 || (count==5 && bonus==1)) {
			System.out.println("1등당첨");
		}
		else if(count==5 || (count==4 && bonus==1)) {
			System.out.println("2등당첨");
		}
		else if(count==4 || (count==3 && bonus==1) ) {
			System.out.println("3등당첨");
		}
		else if(count==3 || (count==2 && bonus==1)) {
			System.out.println("4등당첨");
		}
		else if(count==2 || (count==1 && bonus==1)) {
			System.out.println("5등당첨");
		}
		else if(count==1) {
			System.out.println("꽝");
		}
		else {
			System.out.println("꽝꽝");
		}
	}
}
