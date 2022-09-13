
import java.util.Random;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Random al = new Random();
        Scanner dado = new Scanner(System.in);
        String turma;
        int tam, i; 
        System.out.print("Informe a quantidade de alunos: ");
        tam = dado.nextInt();
        Aluno a[] = new Aluno[tam];
        for(i = 0; i < tam; i++){
            Aluno x = new Aluno();
            System.out.print("Nome do aluno "+(i+1)+": ");
            x.setNome(dado.next());
            System.out.print("Matricula do aluno "+(i+1)+": ");
            x.setMatricula(dado.nextInt());
            //System.out.print("Idade do aluno "+(i+1)+": ");
            x.setIdade(al.nextInt(30) + 7);
            a[i] = x;
        }

        for (i = 0; i < tam; i++){
            if(a[i].getIdade() <= 10){
                turma = "INFÂNCIA";
            }else{
                if(a[i].getIdade() <= 20){
                    turma = "ADOLESCÊNCIA";
                }else{
                    turma = "ADULTO";
                } 
            } 
            System.out.println("       TURMA "+ turma+"\n");  
            System.out.println((00+ i+1)+" Nome | Matricula | Idade");
            System.out.println(a[i].getNome()+"   |   "+ a[i].getMatricula()+"    |    "+a[i].getIdade());
        }
    }
}
