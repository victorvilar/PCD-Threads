package CarroDeCorridaComThreads;

import java.lang.Thread;

public class SimulacaoComThreads {
	// Este metodo permite a execucao da classe.
	public static void main(String[] args) {
		// Criamos instancias da classe CarroDeCorrida.
		CarroDeCorridaComThreads penelope = new CarroDeCorridaComThreads("Penelope Charmosa", 80);
		CarroDeCorridaComThreads dick = new CarroDeCorridaComThreads("Dick Vigarista", 100);
		CarroDeCorridaComThreads quadrilha = new CarroDeCorridaComThreads("Quadrilha da Morte", 120);
		// Criados os carros, vamos executar as simulacoes.
		penelope.start();
		dick.start();
		quadrilha.start();
	}
}
