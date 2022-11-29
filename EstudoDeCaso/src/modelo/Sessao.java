package modelo;

public class Sessao {

    private Integer codSessao;
    private Integer numeroSala;
    private Filme filme;
    private Integer quantIngressoDisponivel;

    public Sessao(Integer codSessao, Integer numeroSala, Filme filme, Integer quantIngressoDisponivel) {
        this.codSessao = codSessao;
        this.numeroSala = numeroSala;
        this.filme = filme;
        this.quantIngressoDisponivel = quantIngressoDisponivel;
    }

    public Sessao() {
    }

    public Integer getCodSessao() {
        return codSessao;
    }

    public void setCodSessao(Integer codSessao) {
        this.codSessao = codSessao;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Integer getQuantIngressoDisponivel() {
        return quantIngressoDisponivel;
    }

    public void setQuantIngressoDisponivel(Integer quantIngressoDisponivel) {
        this.quantIngressoDisponivel = quantIngressoDisponivel;
    }
}
