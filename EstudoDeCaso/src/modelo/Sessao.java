package modelo;

public class Sessao {

    private String codSessao;
    private Integer numeroSala;
    private String nomeFilme;
    private Integer quantIngressoDisponivel;

    public Sessao(String codSessao, Integer numeroSala, String nomeFilme, Integer quantIngressoDisponivel) {
        this.codSessao = codSessao;
        this.numeroSala = numeroSala;
        this.nomeFilme = nomeFilme;
        this.quantIngressoDisponivel = quantIngressoDisponivel;
    }

    public Sessao() {
    }

    public String getCodSessao() {
        return codSessao;
    }

    public void setCodSessao(String codSessao) {
        this.codSessao = codSessao;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getFilme() {
        return nomeFilme;
    }

    public void setFilme(String string) {
        this.nomeFilme = string;
    }

    public Integer getQuantIngressoDisponivel() {
        return quantIngressoDisponivel;
    }

    public void setQuantIngressoDisponivel(Integer quantIngressoDisponivel) {
        this.quantIngressoDisponivel = quantIngressoDisponivel;
    }

	
}
