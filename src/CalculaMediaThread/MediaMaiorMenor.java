/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaMediaThread;

import java.util.*;

/**
 *
 * @author jeanmarcoslaine
 */
public class MediaMaiorMenor {

	// declaracoes globais
	public static int[] vetor;
	public static int N = 8;
	public static int[] maior_menor;
	public static int soma1, soma2;
	public static float media;

	public static void main(String[] args) throws InterruptedException {
		// TODO code application logic here
		vetor = new int[N];
		maior_menor = new int[4];

		int cores = Runtime.getRuntime().availableProcessors();

		System.out.print("Vetor Gerado:");
		System.out.println();

		Random num = new Random();

		for (int i = 0; i < N; i++) {
			vetor[i] = num.nextInt(20);
			System.out.print("  " + vetor[i]);
		}

		System.out.println();
		System.out.println();

		CalculaMedia thread_a = new CalculaMedia(0, N / 2, 0);
		CalculaMedia thread_b = new CalculaMedia(N / 2, N, 1);

		// iniciando as threads
		thread_a.start();
		thread_b.start();

		thread_a.join();
		thread_b.join();

		media = (soma1 + soma2) / N;

		System.out.println("Media calculada: " + media);

		ContaMaiorMenor thread_c = new ContaMaiorMenor(0, N / 2, 0);
		ContaMaiorMenor thread_d = new ContaMaiorMenor(N / 2, N, 2);

		// iniciando as threads
		thread_c.start();
		thread_d.start();

		thread_c.join();
		thread_d.join();

		int maiores = maior_menor[0] + maior_menor[2];
		int menores = maior_menor[1] + maior_menor[3];

		System.out.println("Numeros > media: " + maiores);
		System.out.println("Numeros < ou = media: " + menores);

	}

}
