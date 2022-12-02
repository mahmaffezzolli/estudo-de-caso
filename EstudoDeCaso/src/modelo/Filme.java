package modelo;

public class Filme {

	private String nomeFilme;
	private Integer horarioFilme;
	private Integer codFilme;
	private Integer diaFilme;

	public Filme(String nomeFilme, Integer horarioFilme, Integer codFilme, Integer diaFilme) {
		this.nomeFilme = nomeFilme;
		this.horarioFilme = horarioFilme;
		this.codFilme = codFilme;
		this.diaFilme = diaFilme;
	}

	public Filme() {
	}

	public Integer getCodFilme() {
		return codFilme;
	}

	public void setCodFilme(Integer codFilme) {
		this.codFilme = codFilme;
	}

	public Integer getDiaFilme() {
		return diaFilme;
	}

	public void setDiaFilme(Integer diaFilme) {
		this.diaFilme = diaFilme;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public Integer getHorarioFilme() {
		return horarioFilme;
	}

	public void setHorarioFilme(Integer horarioFilme) {
		this.horarioFilme = horarioFilme;
	}
}
