
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
            x.setMatricula(al.nextInt(1999) + 1000);
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

            System.out.println("\n               TURMA "+ turma+"\n");  
            System.out.println("Seq  | Nome              | Matricula  | Idade");
            a[i].criaSeq();
            System.out.print(" | "); a[i].criaNome();
            System.out.println(" | "+ a[i].getMatricula()+"       |   "+a[i].getIdade());
        }
    }
}