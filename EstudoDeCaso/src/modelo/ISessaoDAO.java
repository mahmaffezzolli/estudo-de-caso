package modelo;

import java.util.ArrayList;

public interface ISessaoDAO {
	
	public boolean inserir(Sessao sessao);

	public boolean atualizar(Sessao sessao, String codSessao);

	public boolean excluir(Sessao sessao, String codSessao);

	public ArrayList<Sessao> listarSessao();

}
