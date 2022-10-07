package ContaAbstrata;

public class Conta extends ContaAbstrata{

	public Conta(int n, double s) {
		super(n, s);
		// TODO Auto-generated constructor stub
		numero = n;
		saldo = s;
	}

	@Override
	public String Sacar(double Vsacar) {
		if(Vsacar <= saldo) {
			saldo -= Vsacar;
			return "Saque feito";
		}else return "Saldo insuficiente";
	}
	
}
