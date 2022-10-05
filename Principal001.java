package Funcionario;

public class Principal001 {
	public static void main(String[] args) {
		NivelGerente001 n = new NivelGerente001();
		Funcionario001 f = new Funcionario001("kaike", 827363, 876545, 1897);
		Assistente001 as = new Assistente001(77667);
		Tecnicos001 t =  new Tecnicos001(33645);
		Administrativos001 a = new Administrativos001(true, true);
		
		System.out.println("            DADOS DO GERENTE\n");
		System.out.println("NOME....................: "+ f.getNome());
		System.out.println("CPF.....................: "+ f.getCpf());
		System.out.println("RG......................: "+ f.getRg());
		System.out.println("SALARIO.................: "+ n.getSalario());
		System.out.println("SALARIO COM ALMENTO.....: "+ n.Almento());
		
		System.out.println("\n            ASISTENTE TECNICO\n");
		System.out.println("NOME....................: "+ f.getNome());
		System.out.println("CPF.....................: "+ f.getCpf());
		System.out.println("RG......................: "+ f.getRg());
		System.out.println("MATRICULA DO ASSITEMTE..: "+ t.getMatricula());
		System.out.println("SALARIO.................: "+ t.getSalario());
		System.out.println("SALARIO COM ALMENTO.....: "+ t.Bonus());
		
		System.out.println("\n            ASSISTENTE ADMINISTRATIVO\n");
		System.out.println("NOME....................: "+ f.getNome());
		System.out.println("CPF.....................: "+ f.getCpf());
		System.out.println("RG......................: "+ f.getRg());
		System.out.println("MATRICULA DO ASSITEMTE..: "+ t.getMatricula());
		System.out.println("SALARIO.................: "+ a.getSalario());
		System.out.println("SALARIO COM ALMENTO.....: "+ a.Adicional());
		
	}
}
