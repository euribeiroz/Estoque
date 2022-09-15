package controleEstoque;

public class Produto {
    public String nome;
    public double preço;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preço*quantidade;
    }

    public void addProduto( int quantidade){
        this.quantidade += quantidade;
    }

    public void deleteProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
                +"R$"
                +String.format("%.2f", preço)
                +", quantidade: "
                +quantidade
                +"Total R$"
                +String.format("%.2f", valorTotalEmEstoque());
    }
}

