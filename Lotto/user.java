import java.util.Arrays;
import java.util.Scanner;

public class user {
	public int[] buyer() {
		int[] buy=new int[6];
		Scanner scan=new Scanner(System.in);
		System.out.println("�ζǹ�ȣ 6���� �Է��ϼ���");
		for (int i = 0; i < buy.length; i++) {
			buy[i]=scan.nextInt();
			if(buy[i]>45 || buy[i]<0) {
				System.out.println("1~45������ �Է����ּ���.");
				i--;
			}
		}
		Arrays.sort(buy);
		System.out.println(Arrays.toString(buy));

		return buy;
	}
}
