package model;

public class Cliente {

    private String nome;
    private String sobreNome;
    private String dataNascimento;
    private String cpfCnpj;
    private String codigo;
    private Endereco endereco;

    public Cliente(String nome, String sobreNome, String dataNascimento, String cpfCnpj, String codigo, Endereco endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.cpfCnpj = cpfCnpj;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
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
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", codigo='" + codigo + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
