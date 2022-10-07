package ContaAbstrata;

public abstract class Poupanca extends Conta{

	public Poupanca(int n, double s) {
		super(n, s);
		// TODO Auto-generated constructor stub
	}
	
	public double RendeJuros(double Tjuros) {
		saldo += (Tjuros/ 100);
		return saldo;
	}
}
