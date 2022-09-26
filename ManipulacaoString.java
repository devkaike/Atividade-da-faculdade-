import java.util.Scanner;
public class ManipulacaoString {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        String n, banco, moeda = "", agencia, valor, diav, mesv, anov, diap,mesp, anop;
        int qtdVogal = 0;
        System.out.println("< 1 > para a questão 1");
        System.out.println("< 2 > para a questão 2");
        System.out.println("< 3 > para a questão 3");
        System.out.println("< 4 > para a questão 4");
        System.out.println("< 5 > para a questão 5");
        System.out.println("< 6 > para a questão 6");
        System.out.println("< 7 > para finalizar");
        int op = dado.nextInt();
        switch(op){
            case 1:
                //Atividade 1
                System.out.print("Digite uma frase: ");
                n = dado.next();
                // inicio da letra A
                System.out.println("\nLetra A\n");
                System.out.print("O numero da caracteres da frase é: "+n.length());
                // fim da letra A

                // inicio da letra B
                System.out.println("\nLetra B\n");
                System.out.println("Todas as letras minusculas: "+n.toLowerCase());
                // fim da letra B

                // inicio da letra C
                System.out.println("\n\nLetra C\n");
                for(int i = 0; i < n.length(); i++){
                    if((n.charAt(i) == 'a' || n.charAt(i) == 'A') || (n.charAt(i) == 'e'|| n.charAt(i) == 'E') || (n.charAt(i) == 'i' || n.charAt(i) == 'I') || (n.charAt(i) == 'o' || n.charAt(i) == 'O') || (n.charAt(i) == 'u' || n.charAt(i) == 'U')){
                        qtdVogal++;
                    }
                }
                if(qtdVogal == 0){
                    System.out.println("Não a vogal na frase.");
                }else{
                    System.out.println("Quantidade de vogal: "+ qtdVogal);
                }
                //fim da letra C

                //inicio da letra D
                System.out.println("\nLetra D\n");
                if((n.charAt(0) == 'u' || n.charAt(0) == 'U') && (n.charAt(1) == 'n' || n.charAt(1) == 'N') && (n.charAt(2) == 'i' || n.charAt(2) == 'I')){
                    System.out.println("A string começa com UNI");
                }else{
                    System.out.println("A string não começa com UNI");
                }
                //fim da letra D

                //inicio da letra E
                System.out.println("\nLetra E\n");
                if((n.charAt(n.length() - 3) == 'r' || n.charAt(n.length() - 3) == 'R') && (n.charAt(n.length() - 2) == 'i' || n.charAt(n.length() - 2) == 'I') && (n.charAt(n.length() - 1) == 'o' || n.charAt(n.length() - 1) == 'O')){
                    System.out.println("A string termina com RIO");
                }else{
                    System.out.println("A string não termina com RIO");
                }
                //fim da letra E

                //inicio da letra F
                int qtdN = 0;
                System.out.println("\nLetra F\n");
                System.out.print("\nNumeros da string: ");
                for(int x = 0; x < n.length(); x++){
                    if(n.charAt(x) == '0' || n.charAt(x) == '1' || n.charAt(x) == '2' || n.charAt(x) == '3' || n.charAt(x) == '4' || n.charAt(x) == '5' || n.charAt(x) == '6' || n.charAt(x) == '7' ||  n.charAt(x) == '8' || n.charAt(x) == '9'){
                        System.out.print(n.charAt(x)+" - ");
                        qtdN++;
                    }   
                }
                if(qtdN == 0){
                        System.out.print("não foi encontrado numeros na frase");
                }
                //fim da letra F

                break;
            case 2:
                //Atividade 2
                int num;
                System.out.print("Digite um numero inteiro: ");
                num = dado.nextInt();
                String aux = String.valueOf(num);
                for(int y = 0; y < aux.length(); y++){
                    switch(aux.charAt(y)){
                        case '0':
                            System.out.print("Zero ");
                            break;
                        case '1':
                            System.out.print("Um ");
                            break;
                        case '2':
                            System.out.print("Dois ");
                            break;
                        case '3':
                            System.out.print("Três ");
                            break;
                        case '4':
                            System.out.print("Quantro ");
                            break;
                        case '5':
                            System.out.print("Cinco ");
                            break;
                        case '6':
                            System.out.print("Seis ");
                            break;
                        case '7':
                            System.out.print("Sete ");
                            break;
                        case '8':
                            System.out.print("Oito ");
                            break;
                        case '9':
                            System.out.print("Nove ");
                            break;
                    }
                }
                
                break;
            case 3:
                //Atividade 3
                String nome, pNome, sNome, tNome;
                System.out.println("Digite um nome completo: ");
                nome = dado.next();
                String[] nomes = mome.split(" ");
                pNome = nomes[0];
                sNome = nomes[1];
                tNome = nomes[2];
                char inicial = pNome.charAt(0);
                System.out.println(inicial);
                break;
            case 4:
                //Atividade 4
                break;
            case 5:
                //atividade 5
                break;
            case 6:
                //Atividade 6
                System.out.print("Informe a sequência de numeros do boleto: ");
                n = dado.next();
                if(n.charAt(3) == '1'){
                    moeda = "Real";
                }
                if(n.charAt(3) == '2'){
                    moeda = "Dólar";
                }
                if(n.charAt(3) == '3'){
                    moeda = "Euro";
                }
                if(n.charAt(3) == '4'){
                    moeda = "Peso";
                }
                if(n.charAt(3) == '5'){
                    moeda = "Libra";
                }
                anop = n.substring(31, 35);
                mesp = n.substring(29, 31);
                diap = n.substring(27, 29);
                anov = n.substring(23, 27);
                mesv = n.substring(21, 23);
                diav = n.substring(19, 21);
                valor = n.substring(13, 19);
                agencia = n.substring(4, 9);
                banco = n.substring(0, 3);

                System.out.println("Banco......: "+banco);
                System.out.println("Moeda......: "+moeda);
                System.out.println("Agencia....: "+agencia);
                System.out.println("Valor......: "+valor);
                System.out.println("Vence......: "+diav+"/"+mesv+"/"+anov);
                System.out.println("Pago.......: "+diap+"/"+mesp+"/"+anop);
                break;
            case 7:
                System.out.println("fim...");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
