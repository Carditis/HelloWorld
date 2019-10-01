
public class Triag {
	public static void main(String[] args) {

		System.out.print(computeIndex(13));
	}
	public static int computeIndex(int n) {
		int i = 0;
		int T = 0;
	if(n == 0) {
		return 0;
	}
		do {
			i = i + 1;
			T = T + i;
		}
		while(T < n);
		//System.out.print(T);
		return i;
		
	}
	
}
