package heranca;

public class Trabalhador000 extends Pessoa000{
	private boolean trabalhar, fazCompras;
	private float dinhero;
	
	public Trabalhador000() {
		super();
		trabalhar = false;
	}

	public boolean isTrabalhar() {
		return trabalhar;
	}

	public void setTrabalhar(boolean trabalhar) {
		this.trabalhar = trabalhar;
	}

	public boolean isFazCompras() {
		return fazCompras;
	}

	public void setFazCompras(boolean fazCompras) {
		this.fazCompras = fazCompras;
	}

	public float getDinhero() {
		return dinhero;
	}

	public void setDinhero(float dinhero) {
		this.dinhero = dinhero;
	}
	
}
