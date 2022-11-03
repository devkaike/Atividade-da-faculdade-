package aaaaaa;

public class ManipulacaoDeString {
	private String salario, gratificacao, nome, sequencia,
	nomeDep, dataDep, mostraDep, sexoDep;

	public String getMostraDep() {
		return mostraDep;
	}

	public void setMostraDep(String mostraDep) {
		this.mostraDep = mostraDep;
	}

	public String getNome() {
		return nome;
	}

	public String getDataDep() {
		return dataDep;
	}

	public void setDataDep(String dataDep) {
		this.dataDep = dataDep;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void separaFrase(String frase, int qtd) {
		String[] nSeparado = frase.split("\n");//separa por quebra de linha
		String[] x = nSeparado[0].split("-");//separa por -
		String sal = x[qtd+2];
		String grat = x[qtd+3];
		nome = x[qtd+1];
		sequencia = x[qtd];
		mGratificacao(grat);
		mSalario(sal);	
		if(x.length > 4) {
			mostraDep = "";
			nomeDep = x[qtd+4];
			String data = x[qtd+5];
			manipulaData(data);
			if(x[6].charAt(0) == 'M') {
				sexoDep = "MASCULINO";
			}else {
				sexoDep = "FEMININO";
			}
			mostraDep = "     "+nomeDep +" - "+ dataDep +" - "+ sexoDep;
		}else {
			
			mostraDep = "                <Sem filhos>";
		}
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
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
	public void manipulaData(String dt) {
		String aux ="";
		aux += dt.charAt(0);
		aux += dt.charAt(1);
		aux += "/";
		aux += dt.charAt(2);
		aux += dt.charAt(3);
		aux += "/";
		aux += dt.charAt(4);
		aux += dt.charAt(5);
		aux += dt.charAt(6);
		aux += dt.charAt(7);
		dataDep = aux;
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
