package heranca;

public class Principal000 extends Pessoa000{
	public static void main(String[] args) {
		Trabalhador000 t = new Trabalhador000();
		Pessoa000 p = new Pessoa000();
		Miseravel000 m = new Miseravel000();
		System.out.print("Nome: "+ p.getNome());
		System.out.print("\nIdade: "+ p.getIdade());
		System.out.print("\nA pessoa trabralha?: "+ t.isTrabalhar());
		System.out.print("\nA pessoa mendiga: "+ m.isMendigar());
	}
}
