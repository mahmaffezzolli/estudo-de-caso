package modelo;

import java.util.ArrayList;

public interface ISessaoDAO {
	
	public boolean inserir(Sessao sessao);

	public boolean atualizar(Sessao sessao, int codSessao);

	public boolean excluir(Sessao sessao, int codSessao);

	public ArrayList<Sessao> listarSessao();

}
