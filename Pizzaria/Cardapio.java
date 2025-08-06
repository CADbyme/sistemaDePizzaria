public class Cardapio {
    private String nomeDoProduto;
    private String descricaoDoProduto;
    private double preco;

    //construtor
    public Cardapio(String nomeDoProduto, String descricaoDoProduto, double preco){
        this.nomeDoProduto = nomeDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
        this.preco = preco;
    };

    //getters
    public String getNomeDoProduto(){
        return nomeDoProduto;
    };
    public String getDescricaoDoProduto(){
        return descricaoDoProduto;
    };
    public double getPreco(){
        return preco;
    };

    //setter
    public void setNomeDoProduto(){
        this.nomeDoProduto = nomeDoProduto;
    }

    public void setDescricaoDoProduto(){
        this.descricaoDoProduto = descricaoDoProduto;
    }
    public void setPreco(){
        this.preco = preco;
    }

}
