import java.util.Arrays;
import java.util.Random;
//무작위 1~ 45의 수를 만들어서 배열에 넣어야함, 중복검사 필수, 컴퓨터 번호 출력
//보너스 번호 존재
public class computer {
	public int[] com() {
		Random rand=new Random();
		user u=new user();
		int[] mix=new int[6];
		
		for (int i = 0; i < mix.length; i++) {
			mix[i]=(int)(rand.nextInt(45)+1);
			for (int j = 0; j < i; j++) {
				if(mix[i]==mix[j]) {
					i--;
				}
			}
		}
		System.out.println();
		System.out.println("컴퓨터의 번호는?");
		Arrays.sort(mix);
		System.out.println(Arrays.toString(mix));

		return mix;
	}
}
