import java.util.ArrayList;
import java.util.Random;

public class PrincipalUsandoCollections {
	public static void main(String[] args) {
		Random r = new Random();
		String nome= "", cpf = "", fone = "";
		ArrayList<ClienteUsandoCollections> lista = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			int aux = r.nextInt(10);
			cpf = Integer.toString(aux);
			
			aux = r.nextInt(25)+65;
			char c = (char) aux;
			nome = Character.toString(c);
			
			aux = r.nextInt(10);
			fone = Integer.toString(aux);
			
			ClienteUsandoCollections cli = new ClienteUsandoCollections();
			cli.setCelular(fone);
			cli.setCpf(cpf);
			cli.setNome(nome);
			
			lista.add(cli);
		}
		for(int i = 0; i <lista.size(); i++) {
			ClienteUsandoCollections cli = new ClienteUsandoCollections();
			cli = lista.get(i);
			System.out.println("Nome: "+cli.getNome()+
								" Cpf: "+cli.getCpf()+
								" Telefone: "+cli.getCelular());
		}
	}
}
