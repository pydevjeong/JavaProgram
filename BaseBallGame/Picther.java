import java.util.Iterator;
import java.util.Random;
//���⼭�� ��ǻ�Ͱ� ������ �����ؾ���
public class Picther {
	public int[] pitch() {
		int[] com =new int[9];
		int tmp=0;
		Random rand=new Random();
		
		for (int i = 0; i < com.length; i++) {
			com[i]=i+1;
		}
		
		for (int j = 0; j < com.length; j++) {
			com[j]=rand.nextInt(9)+1;
			
			tmp=com[0];
			com[0]=com[j];
			com[j]=tmp;
			
		}
		return com;
	}
	
}
