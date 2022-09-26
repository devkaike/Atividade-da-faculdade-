import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InterfaceGrafica {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        Random aleatorio = new Random();
        try{
            int op;
            String s = JOptionPane.showInputDialog(null, "Informe um valor inteiro", "entrada de dados", 1);
            op = Integer.parseInt(s);
            for(int x = 0; x < op; x++){
                String nome = "";
                char l;
                int num;
                num = aleatorio.nextInt(26)+ 65;
                l = (char)num;
                nome += l;
                for(int i = 0; i < 7; i++) {
                    num = aleatorio.nextInt(26) + 97;
                    l = (char)num;
                    nome += l;
                }
                String sobreNome = "";
                num = aleatorio.nextInt(26)+ 65;
                l = (char)num;
                sobreNome += l;
                for(int i = 0; i < 7; i++) {
                    num = aleatorio.nextInt(26) + 97;
                    l = (char)num;
                    sobreNome += l;
                }
                String dia = "", mes = "", ano = "", data = "";
                num = aleatorio.nextInt(30)+1;
                if(num < 10){
                    dia = "0";
                }
                dia += num;
                num = aleatorio.nextInt(12)+1;
                if(num < 10){
                    mes = "0";
                }
                mes += num;
                if(mes == "02"){
                    dia = "";
                    num = aleatorio.nextInt(28)+1;
                    dia += num;
                }
                num = aleatorio.nextInt(200)+1822;
                ano += num;
                data += dia;
                data += "/";
                data += mes;
                data += "/";
                data += ano;
                JOptionPane.showMessageDialog(null,"NOME         SOBRENOME       DATA \n"+ nome +"    "+ sobreNome+ "           "+data, "entrada de dados", 1);
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro!", "entrada de dados", 1);
        }
    }
}
