package ContaAbstrata;

public abstract class ContaEspecial extends Conta{
	private double bonus;
	public ContaEspecial(int n, double s, double b) {
		super(n, s);
		bonus = b;
	}
	public double adBonus(double Vbonus) {
		super.Depositar(Vbonus);
		double aux = this.getSaldo()  + (Vbonus/100);
		setSaldo(aux);
		return aux;
	}
	
}
