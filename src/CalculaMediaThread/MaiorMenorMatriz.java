/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaMediaThread;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeanmarcoslaine
 */
public class MaiorMenorMatriz {
	public static int[][] matriz;
	public static int[] resultados;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o tamanho da matriz: ");
		int tam = in.nextInt();
		matriz = new int[tam][tam];

		Random number = new Random();

		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++)
				matriz[i][j] = number.nextInt(100);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++)
				System.out.print("\t" + matriz[i][j]);
			System.out.println();
		}
		// System.out.print("Digite a qde de threads para o programa: ");
		// int nthreads = in.nextInt();

		// ou entao...usar recursos da linguagem e criar um codigo
		// que se ajusta a arquitetura

		// NO JAVA PODEMOS OBTER
		// INFORMACOES DO SISTEMA, EXEMPLOS:
		Runtime runTime = Runtime.getRuntime();
		/*
		 * String osName = System.getProperty("os.name"); String osVersion=
		 * System.getProperty("os.version"); System.out.println(osName+" "
		 * +osVersion);
		 * 
		 * //INFORMACOES DO HARDWARE, EXEMPLOS:
		 * 
		 * 
		 * System.out.print("Memoria livre: ");
		 * System.out.println(runTime.freeMemory()); System.out.print(
		 * "Memoria total: "); System.out.println(runTime.totalMemory());
		 * System.out.print("Processadores: ");
		 * System.out.println(runTime.availableProcessors());
		 */

		// BuscaNaMatriz[] t = new BuscaNaMatriz[nthreads];

		// RECURSO PARA AJUSTAR O CODIGO AO HARDWARE
		int nthreads;
		nthreads = runTime.availableProcessors();
		BuscaNaMatriz[] t = new BuscaNaMatriz[nthreads];

		resultados = new int[nthreads * 2];

		for (int k = 0; k < nthreads; k++) {
			t[k] = new BuscaNaMatriz(k * (tam / nthreads), (k + 1) * (tam / nthreads), k * 2);
			t[k].start();
		}

		System.out.println("Esperando as Threads acabarem!");
		for (int k = 0; k < nthreads; k++) {
			try {
				t[k].join();
			} catch (InterruptedException ex) {
				Logger.getLogger(MaiorMenorMatriz.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		System.out.println("Threads acabaram!");

		// LOGICA PARA ENCONTRAR O MAIOR E O MENOR ELEMENTO DO VET RESULTADOS

		int menor = resultados[0];
		int maior = resultados[1];
		for (int i = 2; i <= nthreads + 2; i = i + 2) {
			if (resultados[i] < menor)
				menor = resultados[i];
			if (resultados[i + 1] > maior)
				maior = resultados[i + 1];
		}
		System.out.println("Maior: " + maior + " Menor: " + menor);
	}

}
