package Funcionario;

public class NivelGerente001 extends Funcionario001{
	public float Almento() {
		salario += (float) (salario * 0.15);
		return salario;
	}
}
