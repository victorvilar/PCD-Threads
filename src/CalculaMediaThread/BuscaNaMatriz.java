/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaMediaThread;

/**
 *
 * @author jeanmarcoslaine
 */
public class BuscaNaMatriz extends Thread {
	int inicio, fim, pos;

	public BuscaNaMatriz(int a, int b, int c) {
		inicio = a;
		fim = b;
		pos = c;
	}

	public void run() {
		System.out.println("Intervalo: " + inicio + " a " + fim);

		int menor = MaiorMenorMatriz.matriz[inicio][0];
		int maior = MaiorMenorMatriz.matriz[inicio][0];
		for (int i = inicio; i < fim; i++)
			for (int j = 0; j < MaiorMenorMatriz.matriz.length; j++) {
				if (MaiorMenorMatriz.matriz[i][j] < menor)
					menor = MaiorMenorMatriz.matriz[i][j];
				if (MaiorMenorMatriz.matriz[i][j] > maior)
					maior = MaiorMenorMatriz.matriz[i][j];
			}

		MaiorMenorMatriz.resultados[pos] = menor;
		MaiorMenorMatriz.resultados[pos + 1] = maior;
		System.out.println("Thread " + pos + " Maior: " + maior + " Menor: " + menor);

	}
}
