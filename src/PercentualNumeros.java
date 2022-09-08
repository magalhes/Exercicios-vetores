import java.util.Locale;
import java.util.Scanner;

public class PercentualNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*Gerar aleatoriamente um vetor A com 10 elementos inteiros iguais, determine o
		  percentual numeros 0 e 1 existentes no vetor A. */

		double vectA[] = new double[10];

		int qtdNumeros1 = 0;
		int qtdNumeros0 = 0;
		double perceNumeros1 = 0;
		double perceNumeros0 = 0;
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = (int) Math.round(Math.random() * 1);
			System.out.println(vectA[i]);
			if (vectA[i] == 0) {
				qtdNumeros1++;

			} else {
				qtdNumeros0++;

			}
		}
		perceNumeros1 = (qtdNumeros1 * 100) / vectA.length;
		perceNumeros0 = (qtdNumeros0 * 100) / vectA.length;
		System.out.println(perceNumeros1);
		System.out.println(perceNumeros0);
	}

}
