package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.FilmeDAO;
import controle.SessaoDAO;
import modelo.Filme;
import modelo.Sessao;

public class MainCompra {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		FilmeDAO bancoFilmes = FilmeDAO.getInstancia();
		SessaoDAO bancoSessao = SessaoDAO.getInstancia();

		ArrayList<Filme> listaFilmes = bancoFilmes.listaFilmes();

		ArrayList<Sessao> listaSessao = bancoSessao.listarSessao();

		System.out.println("Seja bem vindo ao site de compra de ingresso da !");
		System.out.println("=============================================");

		while (opcaoSelecionada != 0) {

			System.out.println("====OPCOES DISPONIVEIS====");
			System.out.println("0 SAIR");
			System.out.println("1 LISTAR FILMES");
			System.out.println("2 VER SESSOES");
			System.out.println("3 COMPRAR INGRESSO");
			System.out.println("4 CANCELAR INGRESSO");
			System.out.println("=============================================");

			System.out.println("Opcao escolhida: ");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				System.out.println("Até logo");
				break;
			}

			case 1: {
				System.out.println("\nLista de filmes em cartaz: \n");

				for (Filme filme : listaFilmes) {

					System.out.println(filme.getNomeFilme());
				}

				System.out.println("\n=============================================\n");
				
				break;

			}
			case 2: {
				System.out.println("\nInforme o filme desejado: \n");

				int f = 1;

				for (Filme filme : listaFilmes) {

					System.out.println("Filme " + f + ": " + filme.getNomeFilme());
					f++;
				}

				System.out.println("\nEscolha uma das opcoes a cima: ");
				Integer filmeEscolhido = Integer.valueOf(leitura.nextLine());

				if (filmeEscolhido == 1) {

					//System.out.println("Sessao 001A : ");
					
					for (Filme filme : listaFilmes) {
						System.out.println("\nFilme: " + filme.getNomeFilme());
						System.out.println("Dia: " + filme.getDiaFilme());
						System.out.println("Horario: " + filme.getHorarioFilme());
						
						for (Sessao sessao : listaSessao) {
							System.out.println("Sala: " + sessao.getNumeroSala());
							System.out.println("Ingressos disponiveis: " + sessao.getQuantIngressoDisponivel());
							System.out.println("Codigo sessao: " + sessao.getCodSessao());
						}
					}
					
					
				}

				System.out.println("\nSessoes disponiveis: \n");

				for (Sessao sessao : listaSessao) {

					// System.out.println(sessao.get);
				}

				System.out.println("\n=============================================\n");
				
				break;

			}

			}

		}

	}

}
