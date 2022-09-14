import java.util.Random;

public class Aluno {
    private int matricula, idade;
    private String nome;
    
    Random aleatorio = new Random();
    int num;

    public void criaSeq(){
        int n = aleatorio.nextInt(9000)+1000;
        System.out.print(n);
    }
	public void criaNome(){
		nome = "";
		char l;
        num = aleatorio.nextInt(26)+ 65;
        l = (char)num;
        nome += l;
        for(int i = 0; i < 7; i++) {
        	num = aleatorio.nextInt(26) + 97;
            l = (char)num;
            nome += l;
        }
        nome += " ";
        num = aleatorio.nextInt(26)+ 65;
        l = (char)num;
        nome += l;
        for(int i = 0; i < 7; i++) {
        	num = aleatorio.nextInt(26) + 97;
            l = (char)num;
            nome += l;
        }
        System.out.print(nome);
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}