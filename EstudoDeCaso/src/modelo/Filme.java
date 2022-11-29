package modelo;

import java.time.LocalDate;

public class Filme {

	private String nomeFilme;
	private LocalDate horarioFilme;
	private Integer codFilme;
	private LocalDate diaFilme;

	public Filme(String nomeFilme, LocalDate horarioFilme, Integer codFilme, LocalDate diaFilme) {
		this.nomeFilme = nomeFilme;
		this.horarioFilme = horarioFilme;
		this.codFilme = codFilme;
		this.diaFilme = diaFilme;
	}

	public Integer getCodFilme() {
		return codFilme;
	}

	public void setCodFilme(Integer codFilme) {
		this.codFilme = codFilme;
	}

	public LocalDate getDiaFilme() {
		return diaFilme;
	}

	public void setDiaFilme(LocalDate diaFilme) {
		this.diaFilme = diaFilme;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public LocalDate getHorarioFilme() {
		return horarioFilme;
	}

	public void setHorarioFilme(LocalDate horarioFilme) {
		this.horarioFilme = horarioFilme;
	}
}
