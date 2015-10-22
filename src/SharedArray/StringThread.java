package SharedArray;

import java.util.List;

public class StringThread extends Thread {

	private String letra;
	
	private List<String> conteudo;
	
	public StringThread(List<String> conteudo, String letra) {
		this.conteudo = conteudo;
		this.letra = letra;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) { 
			 conteudo.add(letra);
			// System.out.println(letra);
		}
	}
}
