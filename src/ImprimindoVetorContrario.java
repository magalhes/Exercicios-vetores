import java.util.Locale;
import java.util.Scanner;

public class ImprimindoVetorContrario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*Ler um vetor A com 10 elemtnos e construir um vetor B de mesmo tipo e 
		tamanho e com os mesmos elementos de A, sendo que estes deverão estar
		invertidos,ou seja o primeiro elemento de A passa ser o ultimo de B.*/
		int vectA[] = new int[10];
		int vectB[] = new int[vectA.length];

		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Entre com um numero para a posição do Vetor A " + (i + 1) + ":");
			vectA[i] = sc.nextInt();
		}
		int tamanhoDoVetorOriginal = vectA.length;
		int tamanhoDoVetorComZero = tamanhoDoVetorOriginal - 1;
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = vectA[tamanhoDoVetorComZero - i];
			System.out.println(vectB[i]);
		}
	}

}
