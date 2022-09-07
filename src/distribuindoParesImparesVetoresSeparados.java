import java.util.Locale;
import java.util.Scanner;

public class distribuindoParesImparesVetoresSeparados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int vectA[] = new int[10];
		int vectB[] = new int[vectA.length];
		int vectC[] = new int[vectA.length];
		
		int par =0;
		int impar =0;
		
		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Entre com um numero para a posição do Vetor A " + (i + 1) + ":");
			vectA[i] = sc.nextInt();
			if(vectA[i] %2 ==0) {
				vectB[par] = vectA[i];
				par++;
			}
			else {
				vectC[impar] = vectA[i];
				impar++;
			}			
		}
		System.out.println("Vetor B = ");
		for (int i = 0; i <par; i++) {
			
			System.out.println(vectB[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor C = ");
		for (int i = 0; i <impar; i++) {
			
			System.out.println(vectC[i] + " ");
		}		
	}
}