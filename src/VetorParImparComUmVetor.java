import java.util.Locale;
import java.util.Scanner;

public class VetorParImparComUmVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*Ler um vetor A com 20 elementos. Separar os elemtnos pares e ímpares de A utilizando
		apenas um vetor extra B. sugestão: no inicio do vetor B armazene os elementos pares
		de A e nas posições restantes do vetor B armazene os elementos de A que sao impares*/

		int vectA[] = new int[20];
		int vectB[] = new int[vectA.length];
		int par = 0;
		int impar = 5;
		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Entre com um numero para a posição do Vetor A " + (i + 1) + ":");
			vectA[i] = sc.nextInt();
			if (vectA[i] % 2 == 0) {
				vectB[par] = vectA[i];
				par++;
			} else {
				vectB[impar] = vectA[i];
				impar++;
			}
		}
		System.out.println("Vetor B =");
		for (int i = 0; i < vectB.length; i++) {
			System.out.print(vectB[i] + " ");
		}
	}

}
