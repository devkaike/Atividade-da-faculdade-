package Funcionario;

public class Funcionario001 {
	private String nome;
	private long cpf, rg;
	protected float salario;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Funcionario001(String n, long c, long r, float s) {
		nome = n;
		cpf = c;
		rg = r;
		salario = s;
	}
	
	public Funcionario001() {
		// TODO Auto-generated constructor stub
	}

	public float almento() {
		salario += (float) (salario * 0.1);
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}
}
