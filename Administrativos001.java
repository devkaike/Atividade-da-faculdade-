package Funcionario;

public class Administrativos001 extends Tecnicos001{
	private static long matricula;
	private boolean Tdia, Tnoite;
	
	public Administrativos001(boolean dia, boolean noite) {
		super(matricula);
		Tdia = dia;
		Tnoite = noite;
	}


	public float Adicional() {
		if(Tnoite) 
		salario += 500;
		return salario;
	}
	
	public boolean isTdia() {
		return Tdia;
	}

	public void setTdia(boolean tdia) {
		Tdia = tdia;
	}

	public boolean isTnoite() {
		return Tnoite;
	}

	public void setTnoite(boolean tnoite) {
		Tnoite = tnoite;
	}
}
