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

<<<<<<< HEAD:EstudoDeCaso/src/visao/MainCompra.java
		ArrayList<Sessao> listaSessao = bancoSessao.listarSessao();
=======
		Filme filme001 = new Filme();

		filme001.setNomeFilme("Clube da Luta");
		filme001.setDiaFilme(5);
		filme001.setHorarioFilme(16);
		filme001.setCodFilme(001);

		listaFilmes.add(filme001);

		Filme filme002 = new Filme();

		filme002.setNomeFilme("Joker");
		filme002.setDiaFilme(5);
		filme002.setHorarioFilme(17);
		filme002.setCodFilme(002);

		listaFilmes.add(filme002);

		Filme filme003 = new Filme();

		filme003.setNomeFilme("Parasita");
		filme003.setDiaFilme(5);
		filme003.setHorarioFilme(14);
		filme003.setCodFilme(003);

		listaFilmes.add(filme003);

		ArrayList<Sessao> listaSessao = bancoSessao.listarSessao();

		Sessao sessao001A = new Sessao();

		sessao001A.setFilme(filme001.getNomeFilme());
		sessao001A.setNumeroSala(1);
		sessao001A.setQuantIngressoDisponivel(30);
		sessao001A.setCodSessao("001A");

		listaSessao.add(sessao001A);

>>>>>>> 1e51ecb7b19345a6991c9a3fed924771bd503e56:EstudoDeCaso/EstudoDeCaso/src/visao/MainCompra.java

		System.out.println("Seja bem vindo ao site de compra de ingresso da !");
		System.out.println("=============================================");

		while (opcaoSelecionada != 0) {

			System.out.println("====OPÇÕES DISPONIVEIS====");
			System.out.println("0 SAIR");
			System.out.println("1 LISTAR FILMES");
			System.out.println("2 VER SESSÕES");
			System.out.println("3 COMPRAR INGRESSO");
			System.out.println("4 CANCELAR INGRESSO");
			System.out.println("=============================================");

			System.out.println("Escolha uma das opções a cima: ");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				System.out.println("Até logo!");
				break;
			}

			case 1: {
				System.out.println("\nOs filmes em cartaz são: \n");

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

<<<<<<< HEAD:EstudoDeCaso/src/visao/MainCompra.java
				System.out.println("\nEscolha uma das opcoes a cima: ");
=======
				System.out.println("Escolha uma das opções a cima: ");
>>>>>>> 1e51ecb7b19345a6991c9a3fed924771bd503e56:EstudoDeCaso/EstudoDeCaso/src/visao/MainCompra.java
				Integer filmeEscolhido = Integer.valueOf(leitura.nextLine());

				if (filmeEscolhido == 1) {

<<<<<<< HEAD:EstudoDeCaso/src/visao/MainCompra.java
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
					
=======
					System.out.println("Sessao 001A : ");
					
					for (Filme filme : listaFilmes) {
						System.out.println("Filme: " + filme.getNomeFilme());
						System.out.println("Dia: " + filme.getDiaFilme());
						System.out.println("Horario: " + filme.getHorarioFilme());
					}
					for (Sessao sessao : listaSessao) {
						System.out.println("Sala: " + sessao.getNumeroSala());
						System.out.println("Ingressos disponiveis: " + sessao.getQuantIngressoDisponivel());
					}
>>>>>>> 1e51ecb7b19345a6991c9a3fed924771bd503e56:EstudoDeCaso/EstudoDeCaso/src/visao/MainCompra.java
					
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
