import java.util.Iterator;

//�ΰ��� �迭�� �� ���ʽ���ȣ ����
public class compare {
	public void compNum() {
		user ur=new user();
		computer co=new computer();
		int[] buy=ur.buyer();
		int[] com=co.com();
		int count=0;
		int bonus=0;
		System.out.println("��÷�� Ȯ���ϴ� �ð� ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(buy[i]==com[j]) {
					count++;
				}
			}
		}
		
		if(count==6 || (count==5 && bonus==1)) {
			System.out.println("1���÷");
		}
		else if(count==5 || (count==4 && bonus==1)) {
			System.out.println("2���÷");
		}
		else if(count==4 || (count==3 && bonus==1) ) {
			System.out.println("3���÷");
		}
		else if(count==3 || (count==2 && bonus==1)) {
			System.out.println("4���÷");
		}
		else if(count==2 || (count==1 && bonus==1)) {
			System.out.println("5���÷");
		}
		else if(count==1) {
			System.out.println("��");
		}
		else {
			System.out.println("�β�");
		}
	}
}
