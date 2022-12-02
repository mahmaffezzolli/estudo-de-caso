package modelo;

public class Ingresso {

    private Integer codIngresso;
    private Sessao sessao;
    private Double valor;
    private String formaPagamento;
    private String nome;
    private String cpf;
    private String email;
    private Character fileira;
    private Integer numCadeira;

    public Ingresso(Integer codIngresso, Sessao sessao, Double valor, String formaPagamento, String nome, String cpf, String email, Character fileira, Integer numCadeira) {
        this.codIngresso = codIngresso;
        this.sessao = sessao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fileira = fileira;
        this.numCadeira = numCadeira;
    }

    public Ingresso() {
    }

    public Integer getCodIngresso() {
        return codIngresso;
    }

    public void setCodIngresso(Integer codIngresso) {
        this.codIngresso = codIngresso;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getFileira() {
        return fileira;
    }

    public void setFileira(Character fileira) {
        this.fileira = fileira;
    }

    public Integer getNumCadeira() {
        return numCadeira;
    }

    public void setNumCadeira(Integer numCadeira) {
        this.numCadeira = numCadeira;
    }
}
