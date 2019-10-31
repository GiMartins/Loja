package model;

public class produtos {

        private String nome;
        private String tipoProduto;
        private String marca;
        private String fornecedor;
        private String quantidade;
        private String precoCompra;
        private String nota;
        private String validade;
        private String codigoProduto;

    public produtos(String nome, String tipoProduto, String marca, String fornecedor, String quantidade, String precoCompra, String nota, String validade, String codigoProduto) {
        this.nome = nome;
        this.tipoProduto = tipoProduto;
        this.marca = marca;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.precoCompra = precoCompra;
        this.nota = nota;
        this.validade = validade;
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;


    }

    @Override
    public String toString() {
        return "produtos{" +
                "nome='" + nome + '\'' +
                ", tipoProduto='" + tipoProduto + '\'' +
                ", marca='" + marca + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", precoCompra='" + precoCompra + '\'' +
                ", nota='" + nota + '\'' +
                ", validade='" + validade + '\'' +
                ", codigoProduto=" + codigoProduto +
                '}';
    }
}





