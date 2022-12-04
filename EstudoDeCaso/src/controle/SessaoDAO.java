package controle;

import java.util.ArrayList;

import modelo.Filme;
import modelo.ISessaoDAO;
import modelo.Sessao;

public class SessaoDAO implements ISessaoDAO {

	private static ArrayList<Sessao> tabelaSessao;
	private static SessaoDAO instancia;

	private SessaoDAO() {
	}

	public static SessaoDAO getInstancia() {

		if (instancia == null) {
			instancia = new SessaoDAO();
			tabelaSessao = new ArrayList<>();
		}

		return instancia;
	}

	// inserir
	@Override
	public boolean inserir(Sessao s) {
		if (s != null) {
			tabelaSessao.add(s);
			return true;
		}
		return false;
	}

	// update
	@Override
	public boolean atualizar(Sessao s, String codSessao) {

		for (Sessao sessao : tabelaSessao) {

			if (sessao.getCodSessao() == codSessao) {

			}
		}
		return false;
	}

	// delete
	@Override
	public boolean excluir(Sessao s, String codSessao) {

		for (Sessao sessao : tabelaSessao) {
			if (sessao.getCodSessao() == codSessao) {
				tabelaSessao.remove(sessao);
				return true;
			}
		}

		return false;
	}

	// select all
	@Override
	public ArrayList<Sessao> listarSessao() {

		return tabelaSessao;
	}

	public void criarSessao() {

		Integer ingDisp = 30;

		Sessao sessao = new Sessao();
		Filme filme = new Filme(); 
		
		filme.setNomeFilme("Clube da Luta");
		filme.setDiaFilme(5);
		filme.setHorarioFilme(16);
		filme.setCodFilme(001);
		sessao.setFilme(filme);
		sessao.setNumeroSala(1);
		sessao.setQuantIngressoDisponivel(ingDisp);
		sessao.setCodSessao("001A");

		tabelaSessao.add(sessao);
		
		Sessao sessaoA = new Sessao();
		Filme filmeA = new Filme(); 
		
		filmeA.setNomeFilme("Joker");
		filmeA.setDiaFilme(5);
		filmeA.setHorarioFilme(17);
		filmeA.setCodFilme(002);
		sessaoA.setFilme(filmeA);
		sessaoA.setNumeroSala(2);
		sessaoA.setQuantIngressoDisponivel(ingDisp);
		sessaoA.setCodSessao("001B");
		
		tabelaSessao.add(sessaoA);
		
		Sessao sessaoB = new Sessao();
		Filme filmeB = new Filme(); 
		
		filmeB.setNomeFilme("Parasita");
		filmeB.setDiaFilme(5);
		filmeB.setHorarioFilme(14);
		filmeB.setCodFilme(003);
		sessaoB.setFilme(filmeB);
		sessaoB.setNumeroSala(2);
		sessaoB.setQuantIngressoDisponivel(ingDisp);
		sessaoB.setCodSessao("001C");
		
		tabelaSessao.add(sessaoB);
		
	}

}
