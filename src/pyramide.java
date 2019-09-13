
public class pyramide {
	
	public static void main(String[] args) {
		
		for(int linie=0; linie<5; linie++) {
			
		for(int i=0; i<5-linie; i++)
			System.out.print("-");
			
		int antal = 2*linie+1;
		for(int i = 0; i<antal; i++)
			System.out.print(antal);
		skrivminus(5-linie);
		
		System.out.println();
		}
		public static skrivminus(int antalminus) {
			for(int i = 0; i<antalminus; i++)
				System.out.print("-");
			
		}
	
	}
		
		

	
	
	}


