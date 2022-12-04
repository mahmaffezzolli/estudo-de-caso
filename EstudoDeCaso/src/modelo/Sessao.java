package modelo;

public class Sessao {

	private String codSessao;
	private Filme filme;
	private Integer numeroSala;
	private Integer quantIngressoDisponivel;

	public Sessao(String codSessao, Integer numeroSala, Filme filme, Integer quantIngressoDisponivel) {
		this.codSessao = codSessao;
		this.numeroSala = numeroSala;
		this.filme = filme;
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

	public Integer getQuantIngressoDisponivel() {
		return quantIngressoDisponivel;
	}

	public void setQuantIngressoDisponivel(Integer quantIngressoDisponivel) {
		this.quantIngressoDisponivel = quantIngressoDisponivel;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Filme getFilme() {
		return filme;
	}

}
