import java.util.Random;

public class Aluno {
    private int matricula, idade;
    private String nome;

    public void criaNome(){
        String n;
    }

    Random aleatorio = new Random();

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
