import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArq {
	public static void main(String[] args) {
		try {
			ManipulacaoDeString x = new ManipulacaoDeString();
			String f = "";
			BufferedReader in = new BufferedReader(new FileReader("/home/puc/eclipse-workspace/Att/Atividade"));
			String frase = "";
			int i = 0;
			while(in.ready()) {
				frase = in.readLine();
				f += frase +"\n\r";
				x.separaFrase(f, i);
				i++;
				System.out.print(x.getSequencia()+" - "+x.getNome()+" - "+x.getSalario() +" - "+ x.getGratificacao()+"\n");
			}
			
		}catch(IOException e) {
			System.out.print("ERRO!");
		}
	}
}
