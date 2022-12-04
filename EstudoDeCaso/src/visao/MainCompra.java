package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.FilmeDAO;
import controle.SessaoDAO;
import controle.IngressoDAO;
import modelo.Filme;
import modelo.Sessao;
import modelo.Ingresso;

public class MainCompra {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		FilmeDAO bancoFilmes = FilmeDAO.getInstancia();
		SessaoDAO bancoSessao = SessaoDAO.getInstancia();
		IngressoDAO bancoIngresso = IngressoDAO.getInstancia();

		ArrayList<Filme> listaFilmes = bancoFilmes.listaFilmes();

		ArrayList<Sessao> listaSessao = bancoSessao.listarSessao();

		ArrayList<Ingresso> listaIngresso = bancoIngresso.listarIngressos();

		System.out.println("Seja bem vindo ao site de compra de ingresso da !");
		System.out.println("============================================");

		while (opcaoSelecionada != 0) {

			System.out.println("=============OPCOES DISPONIVEIS=============");
			System.out.println("0 SAIR");
			System.out.println("1 LISTAR FILMES");
			System.out.println("2 VER SESSOES");
			System.out.println("3 COMPRAR INGRESSO");
			System.out.println("4 CANCELAR INGRESSO");
			System.out.println("============================================");

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

				System.out.println("\n============================================\n");

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

					// System.out.println("Sessao 001A : ");

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

				System.out.println("\n============================================\n");

				break;

			}
			case 3: {
				System.out.println("Informe a sessao escolhida: ");
				String sessaoEscolhida = String.valueOf(leitura.nextLine());

				for (Sessao sessao : listaSessao) {
					if (sessaoEscolhida.equals(sessao.getCodSessao())) {
						System.out.println("Informe a quantidade de ingressos desejados: ");
						Integer ingressos = Integer.valueOf(leitura.nextLine());

						// sessao.getQuantIngressoDisponivel() = QuantIngressoDisponivel - ingressos;

						System.out.println("\nTipos de ingressos: \n");
						System.out.println("Quantidade de Meia: \n");
						Integer meia = Integer.valueOf(leitura.nextLine());
						System.out.println("Quantidade de Inteira: \n");
						Integer inteira = Integer.valueOf(leitura.nextLine());

						int valorInteira = 0;
						int valorMeia = 0;

						if (meia >= 1) {
							valorMeia = meia * 10;
						}
						if (inteira >= 1) {
							valorInteira = inteira * 20;

						}

						int total = valorMeia + valorInteira;

						System.out.println("Valor total: " + total);

						System.out.println("\nForma de pagamento: ");
						System.out.println("1 - Cartao de debito");
						System.out.println("2 - Cartao de credito");

						Integer pagamento = Integer.valueOf(leitura.nextLine());

						while (pagamento != 1 && pagamento != 2) {
							System.out.println("Informe uma forma de pagamento valida: ");
							pagamento = Integer.valueOf(leitura.nextLine());

						}

						if (pagamento == 1) {
							System.out.println("\nNumero do cartao: ");
							Long numCartao = Long.valueOf(leitura.nextLine());

							System.out.println("\nData de validade: (MMAA)");
							Integer validade = Integer.valueOf(leitura.nextLine());

							System.out.println("\nCVV: ");
							Integer cvv = Integer.valueOf(leitura.nextLine());

							System.out.println("\nNome no cartao: ");
							String nome = String.valueOf(leitura.nextLine());

						} else if (pagamento == 2) {
							System.out.println("\nNumero do cartao: ");
							Long numCartao = Long.valueOf(leitura.nextLine());

							System.out.println("\nData de validade: (MMAA)");
							Integer validade = Integer.valueOf(leitura.nextLine());

							System.out.println("\nCVV: ");
							Integer cvv = Integer.valueOf(leitura.nextLine());

							System.out.println("\nNome no cartao: ");
							String nome = String.valueOf(leitura.nextLine());

						}

						Ingresso ingresso = new Ingresso();

						Integer quantIngressos = ingresso.getCodIngresso();
						
						int n =1;
						
						for (int i = quantIngressos; i < ingressos; i++) {
							System.out.println("Compra feita. codigo do ingresso " + n + "eh: " + (ingresso.getCodIngresso() + quantIngressos));
							quantIngressos++;
							n++;
						}

						// reinicia quant ingressos, nn devia

					}
				}

				break;
			}
			case 4: {
				
				System.out.println("Informe o codigo do ingresso: ");
				Integer cancela = Integer.valueOf(leitura.nextLine());

				Ingresso ingresso = new Ingresso();

				
				if (cancela == ingresso.getCodIngresso()) {
					
				}
				
			}

			}

		}

		
		
		// fim while

	}

}
