import java.util.Arrays;
import java.util.Random;
//������ 1~ 45�� ���� ���� �迭�� �־����, �ߺ��˻� �ʼ�, ��ǻ�� ��ȣ ���
//���ʽ� ��ȣ ����
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
		System.out.println("��ǻ���� ��ȣ��?");
		Arrays.sort(mix);
		System.out.println(Arrays.toString(mix));

		return mix;
	}
}
