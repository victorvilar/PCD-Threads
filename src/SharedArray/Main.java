package SharedArray;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		List<String> conteudo = new ArrayList<String>();
		
		StringThread a = new  StringThread(conteudo, "A");
		StringThread b = new  StringThread(conteudo, "B");
		StringThread c = new  StringThread(conteudo, "C");
		
		a.start();
		b.start();
		c.start();
		
		a.join();
		b.join();
		c.join();

		for (String letra : conteudo) {
			System.out.println(letra + " - ") ;
		}
		System.out.println("-----" + conteudo.size());
	}

	
}
