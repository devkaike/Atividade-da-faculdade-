package ContaAbstrata;

abstract class ContaAbstrata {
	protected int numero;
	protected double saldo;
	
	public ContaAbstrata(int n, double s) {
		numero = n;
		//saldo = s;
	}
	
	public double Depositar(double s) {
		saldo += s;
		return saldo;
	}
	
	public abstract String Sacar(double Vsacar);

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
