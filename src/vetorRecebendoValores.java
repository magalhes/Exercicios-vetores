import java.util.Locale;
import java.util.Scanner;

public class vetorRecebendoValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int vectA[] = new int[10];
		int vectB[] = new int[10];
		int vectC[] = new int[10];

		for (int i = 0; i < vectA.length; i++) {
			System.out.println("Entre com um numero para a posição do  " + (i + 1) + ":");
			vectA[i] = sc.nextInt();
		}
		System.out.println();

		for (int i = 0; i < vectB.length; i++) {
			System.out.print("Entre com um numero para a posição " + (i + 1) + ":");
			vectB[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Vetor C = ");
		for (int i = 0; i < vectC.length; i++) {
			if (vectA[i] > vectB[i]) {
				vectC[i] += 1;
			}
			if (vectA[i] == vectB[i]) {
				vectC[i] += 0;
			}
			if (vectA[i] < vectB[i]) {
				vectC[i] += -1;
			}
			System.out.println(vectC[i] + " ");
		}

	}

}
