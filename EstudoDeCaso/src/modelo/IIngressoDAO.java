package modelo;

import java.util.ArrayList;

public interface IIngressoDAO {
	
	public boolean inserir(Ingresso ingresso);
	
	public boolean atualizar(Ingresso ingresso, int codIngresso);

	public boolean excluir(int codIngresso);
	
	public ArrayList<Ingresso> listarIngressos();
}
