package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import excecoes.ExcecaoEntradaJogador;

public class ShowMenu {

	public void executaMenu() {

		Scanner sc = new Scanner(System.in);

		ExcecaoEntradaJogador tratamentoDeEntradasJogador = new ExcecaoEntradaJogador(null);

		int escolhaCaminhoJogador = 0;

		System.out.println("####################################################################");
		System.out.println("#                                                                  #");
		System.out.println("#                SEJA BEM-VINDO AO DEVINGAME                       #");
		System.out.println("#                   ++ A batalha final ++                          #");
		System.out.println("#                                                                  #");
		System.out.println("####################################################################\n");

		System.out.println(
				"A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, \ne sob a luz do crepúsculo você está prestes a entrar na fase final da \n"
						+ "sua missão. Você olha para o portal à sua frente, e sabe que a partir\n"
						+ "desse ponto, sua vida mudará para sempre.\n"

						+ "\nMemórias do caminho percorrido para chegar até aqui invadem sua mente.\n"
						+ "Você se lembra de todos os inimigos já derrotados para alcançar o covil\n"
						+ "do líder maligno. Olha para seu equipamento de combate, já danificado\n"
						+ "e desgastado depois de tantas lutas. Você está a um passo de encerrar\n"
						+ "para sempre esse mal.\n" + "\n"
						+ "Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");

		System.out.println("\nEscolha sua motivação para invadir a caverna do inimigo e derrotá-lo:");

		while (true) {

			System.out.print("1- VINGANÇA\n2- GLÓRIA\n-->");
			try {

				escolhaCaminhoJogador = sc.nextInt();

				if (!tratamentoDeEntradasJogador.trataEscolhaJogador(escolhaCaminhoJogador)) {
					throw new ExcecaoEntradaJogador("Digite uma opção válida!\n");
				} else {

					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Digite somente números!\n");

				sc.nextLine();
			} catch (ExcecaoEntradaJogador e) {

				System.out.println(e.getMessage());
			}
		}

		if (escolhaCaminhoJogador == 1) {

			System.out.println("Imagens daquela noite trágica invadem sua mente. Você nem precisa se \n"
					+ "esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo \n"
					+ "que de pano de fundo, quando você tem outros pensamentos em foco, elas \n"
					+ "nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. \n"
					+ "E você sabe que não irá desistir até ter vingado a morte daqueles que \n"
					+ "foram - e pra sempre serão - sua fonte de amor e desejo de continuar \n"
					+ "vivo. O maldito líder finalmente pagará por tanto mal causado na vida de \n"
					+ "tantos (e principalmente na sua).\n");

		} else {

			System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo \n"
					+ "de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres \n"
					+ "te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar \n"
					+ "por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando \n"
					+ "a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz \n"
					+ "de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra \n"
					+ "na missão. A glória o aguarda, mas não antes da última batalha.\n");

		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

		System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em \n"
				+ "chamas, suas mãos formigarem em volta da sua arma. Você a segura com firmeza. \n"
				+ "Seu foco está renovado. Você avança pelo portal.\n" + "\n"
				+ "A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. \n"
				+ "À sua frente, só é possível perceber que você se encontra em um corredor extenso. \n"
				+ "Você só pode ir à frente, ou desistir.");

		while (true) {

			System.out.println("\n1- SEGUIR EM FRENTE\n2- DESISTIR\n-->");
			try {

				escolhaCaminhoJogador = sc.nextInt();

				if (!tratamentoDeEntradasJogador.trataEscolhaJogador(escolhaCaminhoJogador)) {
					throw new ExcecaoEntradaJogador("Digite uma opção válida!\n");
				} else {

					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Digite somente números!\n");

				sc.nextLine();
			} catch (ExcecaoEntradaJogador e) {

				System.out.println(e.getMessage());
			}
		}
		
		if(escolhaCaminhoJogador == 1) {
			
			System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a \n"
					+ "frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta."
					+ "\n"
					+ "Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre \n"
					+ "como passar pela porta.\n");
			
		} else {
			
			System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio. \n"
					+ "Você se volta para a noite lá fora e corre em direção à segurança.\n");
			
		}

		
		
	}
}
