package model;

public class Fornecedor {


    private String nomeFornecedor;
    private String nomeFantasia;
    private String cnpj;
    private String telefoneFornecedor;
    private String codigoFornecedor;
    private String enderecoFornecedor;
    private String logradouro;
    private String complementoFornecedor;
    private String numeroLocalFornecedor;
    private String ufFornecedor;
    private String bairroFornecedor;
    private String cepFornecedor;


    public Fornecedor(String nomeFornecedor, String nomeFantasia, String cnpj, String telefoneFornecedor, String codigoFornecedor,
                      String enderecoFornecedor, String logradouro, String complementoFornecedor, String numeroLocalFornecedor,
                      String ufFornecedor, String bairroFornecedor, String cepFornecedor) {

        this.nomeFornecedor = nomeFornecedor;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.telefoneFornecedor = telefoneFornecedor;
        this.codigoFornecedor = codigoFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        this.logradouro = logradouro;
        this.complementoFornecedor = complementoFornecedor;
        this.numeroLocalFornecedor = numeroLocalFornecedor;
        this.ufFornecedor = ufFornecedor;
        this.bairroFornecedor = bairroFornecedor;
        this.cepFornecedor = cepFornecedor;
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

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplementoFornecedor() {
        return complementoFornecedor;
    }

    public void setComplementoFornecedor(String complementoFornecedor) {
        this.complementoFornecedor = complementoFornecedor;
    }

    public String getNumeroLocalFornecedor() {
        return numeroLocalFornecedor;
    }

    public void setNumeroLocalFornecedor(String numeroLocalFornecedor) {
        this.numeroLocalFornecedor = numeroLocalFornecedor;
    }

    public String getUfFornecedor() {
        return ufFornecedor;
    }

    public void setUfFornecedor(String ufFornecedor) {
        this.ufFornecedor = ufFornecedor;
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        this.bairroFornecedor = bairroFornecedor;
    }

    public String getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(String cepFornecedor) {
        this.cepFornecedor = cepFornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nomeFornecedor='" + nomeFornecedor + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj=" + cnpj +
                ", telefoneFornecedor=" + telefoneFornecedor +
                ", codigoFornecedor=" + codigoFornecedor +
                ", enderecoFornecedor='" + enderecoFornecedor + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complementoFornecedor='" + complementoFornecedor + '\'' +
                ", numeroLocalFornecedor='" + numeroLocalFornecedor + '\'' +
                ", ufFornecedor='" + ufFornecedor + '\'' +
                ", bairroFornecedor='" + bairroFornecedor + '\'' +
                ", cepFornecedor=" + cepFornecedor +
                '}';
    }
}





