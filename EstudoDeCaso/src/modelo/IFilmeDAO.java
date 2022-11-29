package modelo;

import java.util.ArrayList;

public interface IFilmeDAO {
	
	public boolean inserir(Filme filme) ;
	
	public boolean atualizar(Filme filme, int codFilme);
	
	public boolean excluir(Filme filme, int codFilme) ;
	
	public ArrayList<Filme> listaFilmes();

}
