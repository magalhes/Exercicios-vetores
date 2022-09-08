import java.util.Locale;
import java.util.Scanner;

public class VetoresComChar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		

		int vectA[] = new int[10];
		char vectB[] = new char[10];
		
		
		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Entre com um numero para a posição do Vetor A " + (i + 1) + ":");
			vectA[i] = sc.nextInt();			
		}
		System.out.print("Vetor B =");
		for (int i = 0; i < vectA.length; i++) {
			if(vectA[i] < 7) {
				vectB[i] += 'a';
			}
			if(vectA[i] == 7) {
				vectB[i] += 'b';
			}
			if(vectA[i] > 7 && vectA[i] <10) {
				vectB[i] += 'c';
			}
			if(vectA[i] == 10) {
				vectB[i] += 'd';
			}
			if(vectA[i] > 10) {
				vectB[i] += 'e';
			}
			System.out.print(" " + vectB[i] + " ");
		}
		
	}
}