package controle;

import java.util.ArrayList;

import modelo.Ingresso;
import modelo.IIngressoDAO;

public class IngressoDAO implements IIngressoDAO {

	private static ArrayList<Ingresso> tabelaIngressos;
	private static IngressoDAO instancia;

	private IngressoDAO() {
	}

	public static IngressoDAO getInstancia() {

		if (instancia == null) {
			instancia = new IngressoDAO();
			tabelaIngressos = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Ingresso i) {
		if (i != null) {
			tabelaIngressos.add(i.getCodIngresso(),i);
			return true;
		}
		return false;
	}

	@Override
	public boolean atualizar(Ingresso i, int codIngresso) {
		for (Ingresso ingresso : tabelaIngressos) {

			if (ingresso.getCodIngresso() == codIngresso) {
				ingresso.setCodIngresso(ingresso.getCodIngresso());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Ingresso i, int codIngresso) {
		for (Ingresso ingresso : tabelaIngressos) {

			if (ingresso.getCodIngresso() == codIngresso) {
				tabelaIngressos.remove(ingresso);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Ingresso> listarIngressos() {
		

		return tabelaIngressos;
	}
	
	

}
