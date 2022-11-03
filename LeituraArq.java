package aaaaaa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArq {
	public static void main(String[] args) {
		try {
			
			String f = "";
			BufferedReader in = new BufferedReader(new FileReader("/home/puc/eclipse-workspace/aaaaaa/Atividade"));
			String frase = "";
			while(in.ready()) {
				ManipulacaoDeString x = new ManipulacaoDeString();
				frase = in.readLine();
				//f += frase +"\n\r";
				x.separaFrase(frase);
				System.out.print(x.getSequencia()+" - "+x.getNome()+" - "+x.getSalario() +" - "+ x.getGratificacao()+"\n"+ x.getMostraDep());
			}
			//System.out.print(x.getNome());

		}catch(IOException e) {
			System.out.print("ERRO!");
		}
	}
}
