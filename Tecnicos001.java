package Funcionario;

public class Tecnicos001 extends Assistente001{
	
	public Tecnicos001(long mat) {
		super(mat);
		// TODO Auto-generated constructor stub
	}

	public float Bonus() {
		salario += 300;
		return salario;
	}
}
