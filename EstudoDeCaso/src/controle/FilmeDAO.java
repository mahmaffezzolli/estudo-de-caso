package controle;

import java.util.ArrayList;

import modelo.Filme;
import modelo.IFilmeDAO;

public class FilmeDAO implements IFilmeDAO {

	public static final String System = null;
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
	
		Filme filme001 = new Filme();

		filme001.setNomeFilme("Clube da Luta");
		filme001.setDiaFilme(5);
		filme001.setHorarioFilme(16);
		filme001.setCodFilme(001);

		tabelaFilmes.add(filme001);

		Filme filme002 = new Filme();

		filme002.setNomeFilme("Joker");
		filme002.setDiaFilme(5);
		filme002.setHorarioFilme(17);
		filme002.setCodFilme(002);

		tabelaFilmes.add(filme002);

		Filme filme003 = new Filme();

		filme003.setNomeFilme("Parasita");
		filme003.setDiaFilme(5);
		filme003.setHorarioFilme(14);
		filme003.setCodFilme(003);

		tabelaFilmes.add(filme003);
		
		return tabelaFilmes;
	}
	
	
	
}