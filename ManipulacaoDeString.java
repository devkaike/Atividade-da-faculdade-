
public class ManipulacaoDeString {
	private String salario, gratificacao, nome, sequencia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void separaFrase(String frase, int qtd) {
		String[] nSeparado = frase.trim().split("\n");//separa por quebra de linha
		String[] x = nSeparado[0].split("-");//separa por -
		String sal = x[2];
		String grat = x[3];
		nome = x[1];
		sequencia = x[0];
		mGratificacao(grat);
		mSalario(sal);	
	}
	
	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}

	public String getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(String gratificacao) {
		this.gratificacao = gratificacao;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String mGratificacao(String grat) {
		String aux = "";
		String aux1 = "";
		aux += "R$";
		int a = 0;
		while(grat.charAt(a) == '0') {
			a++;
		}
		//if(sal.charAt(0) == '0') {
			for(int i = a; i < grat.length(); i ++) {
				aux1 += grat.charAt(i);
			}
			grat = aux1;
		//}
		
		if(grat.length() == 7) {
			aux += grat.charAt(0);
			aux += grat.charAt(1);
			aux += ".";
			aux += grat.charAt(2);
			aux += grat.charAt(3);
			aux += grat.charAt(4);
			aux += ",";
			aux += grat.charAt(5);
			aux += grat.charAt(6);
		}
		if(grat.length() == 6) {
			aux += grat.charAt(0);
			aux += ".";
			aux += grat.charAt(1);
			aux += grat.charAt(2);
			aux += grat.charAt(3);
			aux += ",";
			aux += grat.charAt(4);
			aux += grat.charAt(5);
		}
		if(grat.length() == 5) {
			aux += grat.charAt(0);
			aux += grat.charAt(1);
			aux += grat.charAt(2);
			aux += ",";
			aux += grat.charAt(3);
			aux += grat.charAt(4);
		}
		if(grat.length() == 4) {
			aux += grat.charAt(0);
			aux += grat.charAt(1);
			aux += ",";
			aux += grat.charAt(2);
			aux += grat.charAt(3);
		}
		if(grat.length() == 3) {
			aux += grat.charAt(0);
			aux += ",";
			aux += grat.charAt(1);
			aux += grat.charAt(2);
		}
		gratificacao = aux;
		return gratificacao;
	}
	
	public String mSalario(String sal) {
		//salario = sal;
		String aux = "";
		String aux1 = "";
		aux += "R$";
		int a = 0;
		while(sal.charAt(a) == '0') {
			a++;
		}
		//if(sal.charAt(0) == '0') {
			for(int i = a; i < sal.length(); i ++) {
				aux1 += sal.charAt(i);
			}
			sal = aux1;
		//}
		
		if(sal.length() == 7) {
			aux += sal.charAt(0);
			aux += sal.charAt(1);
			aux += ".";
			aux += sal.charAt(2);
			aux += sal.charAt(3);
			aux += sal.charAt(4);
			aux += ",";
			aux += sal.charAt(5);
			aux += sal.charAt(6);
		}
		if(sal.length() == 6) {
			aux += sal.charAt(0);
			aux += ".";
			aux += sal.charAt(1);
			aux += sal.charAt(2);
			aux += sal.charAt(3);
			aux += ",";
			aux += sal.charAt(4);
			aux += sal.charAt(5);
		}
		if(sal.length() == 5) {
			aux += sal.charAt(0);
			aux += sal.charAt(1);
			aux += sal.charAt(2);
			aux += ",";
			aux += sal.charAt(3);
			aux += sal.charAt(4);
		}
		if(sal.length() == 4) {
			aux += sal.charAt(0);
			aux += sal.charAt(1);
			aux += ",";
			aux += sal.charAt(2);
			aux += sal.charAt(3);
		}
		if(sal.length() == 3) {
			aux += sal.charAt(0);
			aux += ",";
			aux += sal.charAt(1);
			aux += sal.charAt(2);
		}
		salario = aux;
		return salario;
	}
}
