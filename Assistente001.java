package Funcionario;

public class Assistente001 extends Funcionario001{
	protected long matricula;
	
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Assistente001(long mat) {
		super();
		matricula = mat;
	}
}
