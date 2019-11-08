package model;

public class Fornecedor {


    private String nomeFornecedor;
    private String nomeFantasia;
    private String cnpj;
    private String telefoneFornecedor;
    private String codigoFornecedor;
   private Endereco endereco;

    public Fornecedor(String nomeFornecedor, String nomeFantasia, String cnpj, String telefoneFornecedor, String codigoFornecedor, Endereco endereco) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.telefoneFornecedor = telefoneFornecedor;
        this.codigoFornecedor = codigoFornecedor;
        this.endereco = endereco;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nomeFornecedor='" + nomeFornecedor + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", telefoneFornecedor='" + telefoneFornecedor + '\'' +
                ", codigoFornecedor='" + codigoFornecedor + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}





