package paradigmaLinguagens.matrizes;

import java.util.Random;

public class Matriz {
//variaveis usadas para implementar a matriz
	static int numMtz = 2; // quantidade de matrizes
	static int quantj = 2; // tamanho da matriz relacao linhas
	static int quantk = 2; // tamanho da matriz relacao colunas
	static int i = 0;
	static int j = 0;
	static int k = 0;
	static int[] ve = new int[i];
	static int[] vd = new int[i];
	static int[] vresult = new int[i];

	public static void main(String[] args) {

		for (i = 0; i < numMtz; i++) {
			System.out.println("####### " + (i + 1) + "ª MATRIZ #######");
			for (j = 0; j < quantj; j++) {
				for (k = 0; k < quantk; k++) {
					if (i % 2 == 0) {
						vd[j * 10 + k * 1] = random();
					} else {
						ve[k * 10 + k * 1] = random();
					}
					System.out.print(random() + "  ");
				}
				System.out.println("");
			}
		}
	}

	// método randomico para preencher a matriz
	static int random() {
		Random rand = new Random();
		return rand.nextInt(10);
	}

	static void possivelMultipliar() {
		if ((numMtz % 2 == 0) && (k == j)) {
			multiplica();
		}
	}

	static void multiplica() {
		while ((j > -1) && (k > -1)) {

		}
	}

}
