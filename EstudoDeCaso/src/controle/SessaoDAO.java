package controle;

import java.util.ArrayList;

import modelo.ISessaoDAO;
import modelo.Sessao;

public class SessaoDAO implements ISessaoDAO{

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
	public boolean atualizar(Sessao s, int codSessao) {

		for (Sessao sessao : tabelaSessao) {

			if (sessao.getCodSessao() == codSessao) {

			}
		}
		return false;
	}

	// delete
	@Override
	public boolean excluir(Sessao s, int codSessao) {

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
	
	
}
