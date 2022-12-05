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
		FilmeDAO bancoFilmes = FilmeDAO.getInstancia(0);
		SessaoDAO bancoSessao = SessaoDAO.getInstancia();
		IngressoDAO bancoIngresso = IngressoDAO.getInstancia();

		bancoFilmes.criarFilmes();
		bancoSessao.criarSessao();

		ArrayList<Filme> listaFilmes = bancoFilmes.listaFilmes();
		ArrayList<Sessao> listaSessao = bancoSessao.listarSessao();
		ArrayList<Ingresso> listaIngresso = bancoIngresso.listarIngressos();

		System.out.println("Seja bem vindo ao site de compra de ingresso da AGM cinemas!");
		System.out.println("============================================\n");

		while (opcaoSelecionada != 0) {

			System.out.println("=============OPCOES DISPONIVEIS:=============\n");
			System.out.println("0 SAIR");
			System.out.println("1 LISTAR FILMES");
			System.out.println("2 VER SESSOES");
			System.out.println("3 COMPRAR INGRESSO");
			System.out.println("4 CANCELAR INGRESSO");
			System.out.println("\n============================================");

			System.out.println("\n- Selecione uma opcao: ");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				System.out.println("Volte sempre!");

				break;
			}

			case 1: {
				System.out.println("\n Filmes em cartaz: \n");

				for (Filme filme : listaFilmes) {

					System.out.println(filme.getNomeFilme());
				}

				System.out.println("\n============================================\n");

				break;

			}
			case 2: {
				System.out.println("\n Informe o filme desejado: \n");

				int f = 1;

				for (Filme filme : listaFilmes) {

					System.out.println("Filme " + f + ": " + filme.getNomeFilme());
					f++;
				}

				System.out.println("\nEscolha uma das opcoes acima: ");
				Integer filmeEscolhido = Integer.valueOf(leitura.nextLine());

				Filme filme1 = new Filme();

				for (Filme filme : listaFilmes) {

					if (filme.getCodFilme() != filmeEscolhido) {
						continue;
					}

					System.out.println("\nFilme: " + filme.getNomeFilme());
					System.out.println("Dia: " + filme.getDiaFilme());
					System.out.println("Horario: " + filme.getHorarioFilme());

					for (Sessao sessao : listaSessao) {

						filme1 = sessao.getFilme();
						if (filme1.getCodFilme() != filmeEscolhido) {
							continue;
						}

						System.out.println("Sala: " + sessao.getNumeroSala());
						System.out
								.println("Quantidade de ingressos disponiveis: " + sessao.getQuantIngressoDisponivel());
						System.out.println("Codigo da sessao: " + sessao.getCodSessao());

					}
				}

				System.out.println("\n============================================\n");

				break;

			}
			case 3: {
				System.out.println("\nSessooes disponiveis: ");

				for (Sessao sessao : listaSessao) {

					Filme filme = sessao.getFilme();
					System.out.println(filme.getNomeFilme());
					System.out.println(sessao.getCodSessao() + "\n");
				}

				System.out.println("Informe a sessao escolhida: ");

				String sessaoEscolhida = String.valueOf(leitura.nextLine());

				for (Sessao sessao : listaSessao) {
					if (sessaoEscolhida.equals(sessao.getCodSessao())) {
						System.out.println("\nInforme a quantidade de ingressos desejados: ");
						Integer ingressos = Integer.valueOf(leitura.nextLine());

						int ingressosDisponivel = sessao.getQuantIngressoDisponivel() - ingressos;

						if (ingressosDisponivel == 0) {
							System.out.println("Sessão finalizada");
						} else {
							if (ingressosDisponivel < 0) {
								System.out.println("Impossivel a compra, sessao lotada!");
								break;
							} else {
								System.out.println("Ingressos ainda disponivel : " + ingressosDisponivel);
							}

						}

						if (ingressos >= 1) {

							System.out.println("\n============================================\n");

							System.out.println("Tipos de ingressos: \n");

							System.out.println("Quantidade de Meia Entrada: ");
							Integer meia = Integer.valueOf(leitura.nextLine());

							System.out.println("\nQuantidade de Entrada Inteira: ");
							Integer inteira = Integer.valueOf(leitura.nextLine());

							if ((inteira + meia) > ingressos || (inteira + meia) == 0) {

								System.out.println("Soma dos tipos nao corresponde a quantidade dos ingressos\n");
								break;
							}

							int valorInteira = 0;
							int valorMeia = 0;

							if (meia >= 1) {
								valorMeia = meia * 10;
							}
							if (inteira >= 1) {
								valorInteira = inteira * 20;

							}

							int total = valorMeia + valorInteira;

							System.out.println("\nValor total: R$" + total);

							System.out.println("\n============================================\n");

							System.out.println("\nForma de pagamento: ");

							System.out.println("1 - Cartao de debito");
							System.out.println("2 - Cartao de credito");

							System.out.println("Forma escolhida: ");

							Integer pagamento = Integer.valueOf(leitura.nextLine());

							while (pagamento != 1 && pagamento != 2) {
								System.out.println("Informe uma forma de pagamento valida: ");
								pagamento = Integer.valueOf(leitura.nextLine());

							}

							if (pagamento == 1 || pagamento == 2) {
								System.out.println("\n- Numero do cartao: ");
								Long numCartao = Long.valueOf(leitura.nextLine());

								System.out.println("\n- Data de validade: (MMAA)");
								Integer validade = Integer.valueOf(leitura.nextLine());

								System.out.println("\nCVV: ");
								Integer cvv = Integer.valueOf(leitura.nextLine());

								System.out.println("\n- Nome no cartao: ");
								String nome = String.valueOf(leitura.nextLine());

							} else {
								System.out.println("Forma incorreta de pagamento!");
								break;
							}

							Ingresso ingresso = new Ingresso();

							Integer quantIngressos = ingresso.getCodIngresso();

							int n = 1;

							for (int i = quantIngressos; i < ingressos; i++) {
								System.out.println("Compra realizada com sucesso. O codigo do ingresso " + n + " e: "
										+ (ingresso.getCodIngresso() + quantIngressos) + "\n");
								quantIngressos++;
								n++;
							}
						}

					}
				}

				break;
			}
			case 4: {

				System.out.println("- Informe o codigo do ingresso para o cancelamento: ");
				Integer cancela = Integer.valueOf(leitura.nextLine());
				
				if (bancoIngresso.excluir(cancela)) {
					System.out.println("Compra cancelada com sucesso.");
					
				} else {
					System.out.println("Cancelamento invalido.");
					
					
				}

			}

			}

		}

	}

}
