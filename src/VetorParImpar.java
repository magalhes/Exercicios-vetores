import java.util.Locale;
import java.util.Scanner;

public class VetorParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*Criar um vetor A com 10 elementos inteiros.Construir um vetor B de mesmo tipo
		  e tamanho, obedecendo as seguintes regras de formação: 
		  a) B devera receber 1  quando A for par; 
		  b) B devera receber 0 quando A for impar; */

		int vectA[] = new int[10];
		int vectB[] = new int[vectA.length];

		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Entre com um numero para a posição " + (i + 1) + ":");
			vectA[i] = sc.nextInt();
			if (vectA[i] % 2 == 0) {
				vectB[i] += 1;
			} else {
				vectB[i] += 0;
			}
		}
		System.out.println("Vetor B = ");
		for (int i = 0; i < vectB.length; i++) {
			System.out.println(" " + vectB[i]);
		}

	}

}
