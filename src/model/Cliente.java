package model;

public class Cliente {

    private java.lang.String nome;
    private java.lang.String sobreNome;
    private java.lang.String idade;
    private java.lang.String cpf;
    private java.lang.String cnpj;
    private java.lang.String codigo;
    private Endereco endereco;

    public Cliente(String nome, String sobreNome, String idade, String cpf, String cnpj, String codigo, Endereco endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", idade='" + idade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", codigo='" + codigo + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
