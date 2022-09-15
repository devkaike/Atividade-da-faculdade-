public class Pedido {
    private String produto;
    private float precoProd;
    private int quantidade;

    public String getProduto(){
        return produto;
    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    public float getPrecoProd(){
        return precoProd;
    }

    public void setPrecoProd(Float precoProd){
        this.precoProd = precoProd;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
