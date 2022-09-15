import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        Scanner dado = new Scanner(System.in);
        System.out.print("Quantidade de pedidos: ");
        int qtd = dado.nextInt();
        Pedido p[] = new Pedido[qtd];
        
        for(int i = 0; i < qtd; i++){
            Pedido aux = new Pedido();
            System.out.print("Produto "+(i + 1)+": ");
            aux.setProduto(dado.next());
            System.out.print("Preço do produto "+(i + 1)+": ");
            aux.setPrecoProd(dado.nextFloat());
            System.out.print("Quantidade do produto "+(i + 1)+": ");
            aux.setQuantidade(dado.nextInt());
            p[i] = aux;
        }
        /*System.out.println("pedido    produto     preço     quantidade");
        for(int j = 0; j < qtd; j++){
            System.out.println("  "+j+"        "+p[j].getProduto()+"    "+p[j].getPrecoProd()+"   "+p[j].getQuantidade()); 
        }*/
    }
}
