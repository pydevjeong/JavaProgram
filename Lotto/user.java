import java.util.Arrays;
import java.util.Scanner;

public class user {
	public int[] buyer() {
		int[] buy=new int[6];
		Scanner scan=new Scanner(System.in);
		System.out.println("로또번호 6개를 입력하세요");
		for (int i = 0; i < buy.length; i++) {
			buy[i]=scan.nextInt();
			if(buy[i]>45 || buy[i]<0) {
				System.out.println("1~45까지만 입력해주세요.");
				i--;
			}
		}
		Arrays.sort(buy);
		System.out.println(Arrays.toString(buy));

		return buy;
	}
}
