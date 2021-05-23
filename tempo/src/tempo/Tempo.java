package tempo;

public class Tempo {

	public static void main(String[] args) {
		
		double segundos = 7199; 
		
		int h = (int)segundos / 3600;
		int m = (int)segundos % 3600 / 60;
		int s = (int)segundos % 60;
			
		System.out.printf("%02dh%02dm%02ds\n", h, m, s);
		
	}

}
