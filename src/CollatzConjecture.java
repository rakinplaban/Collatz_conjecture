import java.util.*;

public class CollatzConjecture {
	
	
	public int seqGenerate(int number) {
		
		if(number==1) {
			return 1;
		}
		else if(number%2==0) {
			System.out.printf("%d ",number);
			return seqGenerate(number/2);
		}else {	
			System.out.printf("%d ",number);
			return seqGenerate((number*3)+1);
		}
		
	}
}
