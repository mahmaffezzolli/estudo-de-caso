package controle;

import java.util.ArrayList;

import modelo.Filme;
import modelo.IFilmeDAO;

public class FilmeDAO implements IFilmeDAO {

	private static ArrayList<Filme> tabelaFilmes;
	private static FilmeDAO instancia;

	private FilmeDAO() {
	}

	public static FilmeDAO getInstancia() {

		if (instancia == null) {
			instancia = new FilmeDAO();
			tabelaFilmes = new ArrayList<>();
			
			
		}

		return instancia;
	}

	// inserir
	@Override
	public boolean inserir(Filme f) {
		if (f != null) {
			tabelaFilmes.add(f);
			return true;

		}
		return false;
	}

	// update
	@Override
	public boolean atualizar(Filme f, int codFilme) {

		for (Filme filme : tabelaFilmes) {

			if (filme.getCodFilme() == codFilme) {

			}
		}
		return false;
	}

	// delete
	@Override
	public boolean excluir(Filme f, int codFilme) {

		for (Filme filme : tabelaFilmes) {
			if (filme.getCodFilme() == codFilme) {
				tabelaFilmes.remove(filme);
				return true;
			}
		}

		return false;
	}

	// select all
	@Override
	public ArrayList<Filme> listaFilmes() {

		return tabelaFilmes;
	}
}