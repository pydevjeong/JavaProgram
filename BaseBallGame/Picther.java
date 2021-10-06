import java.util.Iterator;
import java.util.Random;
//여기서는 컴퓨터가 난수를 생성해야함
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
