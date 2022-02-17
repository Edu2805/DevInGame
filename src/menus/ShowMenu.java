package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import danos.Dano;
import excecoes.ExcecaoEntradaJogador;

public class ShowMenu {

	public void executaMenu() {

		Dano exibeDanoJogador = new Dano();
		
		Scanner sc = new Scanner(System.in);

		ExcecaoEntradaJogador tratamentoDeEntradasJogador = new ExcecaoEntradaJogador(null);

		int escolhaCaminhoJogador = 0;
		int escolhaComoPassarPelaPorta = 0;
		int pegarArmadurasDosInimigos = 0;
		int escolhaBeberliquido = 0;
		int atacarOuEsperarLider = 0;
		
		String nomeJogador = null;

		System.out.println("####################################################################");
		System.out.println("#                                                                  #");
		System.out.println("#                SEJA BEM-VINDO AO DEVINGAME                       #");
		System.out.println("#                   ++ A batalha final ++                          #");
		System.out.println("#                                                                  #");
		System.out.println("####################################################################\n");

		
		while (true) {
			System.out.print("Digite um nome para o seu personagem: ");
			nomeJogador = sc.nextLine();

			try {

				if (!tratamentoDeEntradasJogador.trataExcecaoNomeJogador(nomeJogador)) {
					throw new ExcecaoEntradaJogador(
							"Digite corretamente um nome para o seu personagem, somente letras!");
				} else {

					break;
				}

			} catch (ExcecaoEntradaJogador e) {
				System.out.println("\n" + e.getMessage() + "\n");
			}
		}
		
		
		System.out.println("\nA noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, "
				+ "\ne sob a luz do crepúsculo você está prestes a entrar na fase final da \n"
				+ "sua missão. Você olha para o portal à sua frente, e sabe que a partir\n"
				+ "desse ponto, sua vida mudará para sempre.\n"

				+ "\nMemórias do caminho percorrido para chegar até aqui invadem sua mente.\n"
				+ "Você se lembra de todos os inimigos já derrotados para alcançar o covil\n"
				+ "do líder maligno. Olha para seu equipamento de combate, já danificado\n"
				+ "e desgastado depois de tantas lutas. Você está a um passo de encerrar\n" + "para sempre esse mal.\n"
				+ "\n" + "Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");

		System.out.println("\nEscolha sua motivação para invadir a caverna do inimigo e derrotá-lo:");

		while (true) {

			System.out.print("1- VINGANÇA\n2- GLÓRIA\n-->");
			try {

				escolhaCaminhoJogador = sc.nextInt();

				if (!tratamentoDeEntradasJogador.trataEscolhaJogador(escolhaCaminhoJogador)) {
					throw new ExcecaoEntradaJogador("\nDigite uma opção válida!\n");
				} else {

					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("\nDigite somente números!\n");

				sc.nextLine();
			} catch (ExcecaoEntradaJogador e) {

				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("\nBARRA DE DANO");
		exibeDanoJogador.exibeDano();
		
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

			System.out.print("\n1- SEGUIR EM FRENTE\n2- DESISTIR\n-->");
			try {

				escolhaCaminhoJogador = sc.nextInt();

				if (!tratamentoDeEntradasJogador.trataEscolhaJogador(escolhaCaminhoJogador)) {
					throw new ExcecaoEntradaJogador("\nDigite uma opção válida!\n");
				} else {

					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("\nDigite somente números!\n");

				sc.nextLine();
			} catch (ExcecaoEntradaJogador e) {

				System.out.println(e.getMessage());
			}
		}

		System.out.println("\nBARRA DE DANO");
		exibeDanoJogador.exibeDano();
		
		if (escolhaCaminhoJogador == 1) {

			System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a \n"
					+ "frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta."
					+ "\n"
					+ "Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre \n"
					+ "como passar pela porta.\n");

			while (true) {

				System.out.print("1- ANDAR CUIDADOSAMENTE\n2- CORRER\n3- SALTAR\n-->");
				try {

					escolhaComoPassarPelaPorta = sc.nextInt();

					if (!tratamentoDeEntradasJogador.trataEscolhaJogador(escolhaComoPassarPelaPorta)) {
						throw new ExcecaoEntradaJogador("\nDigite uma opção válida!\n");
					} else {

						break;
					}

				} catch (InputMismatchException e) {
					System.out.println("\nDigite somente números!\n");

					sc.nextLine();
				} catch (ExcecaoEntradaJogador e) {

					System.out.println(e.getMessage());
				}
			}

			if (escolhaComoPassarPelaPorta == 1) {

				System.out.println(
						"\nVocê toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente \n"
								+ "embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. \n"
								+ "Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, \n"
								+ "no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém \n"
								+ "uma delas te acerta na perna.\n");
				
				//mostrar dano
				System.out.println("BARRA DE DANO");
				exibeDanoJogador.jogadorTomaDanoFlecha(true);

			} else if (escolhaComoPassarPelaPorta == 2) {

				System.out.println("\nBARRA DE DANO");
				exibeDanoJogador.exibeDano();
				
				System.out.println(
						"Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou \n"
								+ "em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à \n"
								+ "procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, \n"
								+ "e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma \n"
								+ "armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e \n"
								+ "conseguiu escapar desse ataque surpresa.\n");

			} else {

				System.out.println("\nBARRA DE DANO");
				exibeDanoJogador.exibeDano();
				
				System.out.println(
						"\nVocê se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.\n");

			}

			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			
			System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma \n"
					+ "delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta \n"
					+ "à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe \n"
					+ "ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e \n"
					+ "percebe que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro \n"
					+ "derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.\n");
			
			System.out.println("Você se aproxima da porta direita, tentando ouvir o que acontece porta adentro, mas não \n"
					+ "escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao \n"
					+ "entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas \n"
					+ "paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde \n"
					+ "estão guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas \n"
					+ "cidades e vilas da região.\n");
			
			System.out.println("Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para \n"
					+ "olhar para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está \n"
					+ "um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de \n"
					+ "combate. Ele avança em sua direção.\n");
			
			
			while(true) {
				
				//iniciar o loop de batalha
				
				//Lógica para combate....
				
				boolean batalhaVencida = false;
				
				if(!batalhaVencida) {
					//venceu o orque
					
					System.out.println("\nSeus equipamentos estão muito danificados, existem muitas opções boas armas nesta sala.");

					while (true) {

						System.out.print("1- PEGAR ARMADURAS NOVAS\n2- NÃO PEGAR ARMADURAS NOVAS\n-->");
						try {

							pegarArmadurasDosInimigos = sc.nextInt();

							if (!tratamentoDeEntradasJogador.trataEscolhaJogador(pegarArmadurasDosInimigos)) {
								throw new ExcecaoEntradaJogador("\nDigite uma opção válida!\n");
							} else {

								break;
							}

						} catch (InputMismatchException e) {
							System.out.println("\nDigite somente números!\n");

							sc.nextLine();
						} catch (ExcecaoEntradaJogador e) {

							System.out.println(e.getMessage());
						}
					}
					
					System.out.println("\nBARRA DE DANO");
					exibeDanoJogador.exibeDano();
					
					if(pegarArmadurasDosInimigos == 1) {
						
						System.out.println("\nVocê resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, \n"
								+ "que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se \n"
								+ "sente mais protegido para os desafios à sua frente.\n");
						
						//acrescentar 5 pontos de defesa ao jogador....
						
						
						
					} else {
						
						System.out.println("\nVocê decide que não precisa utilizar nada que venha das mãos do inimigo.\n");
						
					}
					
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
					
					System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das \n"
							+ "fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva \n"
							+ "presa ao cinto.\n");
					
					System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando \n"
							+ "ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, \n"
							+ "enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, \n"
							+ "mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores \n"
							+ "diversas, e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, \n"
							+ "criando poções utilizadas pelos soldados para aterrorizar a região.\n"
							+ "\n"
							+ "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de \n"
							+ "armadura, cajado em punho, em posição de combate. Ele avança em sua direção.\n");
					
					if(!batalhaVencida) {
						
						//logica de batalha
						//barra de dano
						System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque \n"
								+ "do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, \n"
								+ "pega a garrafa e pondera se deve beber um gole.");
						
						
						while (true) {

							System.out.println("1- BEBER\n2- NÃO BEBER\n-->");
							try {

								escolhaBeberliquido = sc.nextInt();

								if (!tratamentoDeEntradasJogador.trataEscolhaJogador(escolhaBeberliquido)) {
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
						
						if(escolhaBeberliquido == 1) {
							
							System.out.println("\nVocê se sente revigorado para seguir adiante!");
							
							System.out.println("\nBARRA DE DANO ESTÁ EM 100%");
							exibeDanoJogador.jogadorBebePocaoRecuperaDano(true);
							
							//recuperar 100% dos pontos de vida do jogador
							
						} else {
							
							System.out.println("\nVocê fica receoso de beber algo produzido pelo inimigo\n");
							
						}
						
						
						System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre \n"
								+ "a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa \n"
								+ "ao cinto.\n"
								+ "\n"
								+ "De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se \n"
								+ "abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está muito \n"
								+ "próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que irá se \n"
								+ "seguir, e adentra a porta.\n"
								+ "\n"
								+ "Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros \n"
								+ "acorrentados às paredes.\n"
								+ "\n"
								+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");
						
						
						
						
						while (true) {

							System.out.println("1- ATACAR!!!\n2- ESPERAR!!!\n-->");
							try {

								atacarOuEsperarLider = sc.nextInt();

								if (!tratamentoDeEntradasJogador.trataEscolhaJogador(atacarOuEsperarLider)) {
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
						
						if(atacarOuEsperarLider == 1) {
							
							System.out.println("\nEntão você parte para o ataque como se fosse a última coisa que fará em sua vida!!!\n");
							
						} else {
							
							System.out.println("\nVocê estrategicamente espera o líder atacar, ele vem vindo com toda a sua fúria e força!!!\n");
						}
						
						if(!batalhaVencida) {
							
							System.out.println("\n++++++++++++++++++++++++++++++++++ VOCê VENCEU!!!! +++++++++++++++++++++++++++++++++++++++\n");
							
							if(escolhaCaminhoJogador == 1) {
								
								System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de \n"
										+ "alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.\n");
								
								System.out.println("\nVocê se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês\n"
										+ " saem em direção à noite, retornando à cidade. Seu dever está cumprido.\n");
								
								break;
								
							} else {
								
								System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. \n"
										+ "A glória o aguarda, você a conquistou.");
								
								System.out.println("\nVocê se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês \n"
										+ "saem em direção à noite, retornando à cidade. Seu dever está cumprido.\n");
								
								break;
							}
							
						} else {
							//não venceu
							
							break;
							
						}
						
					} else {
						//não venceu
						
						break;
						
					}
					
					
				} else {
					//não venceu
					
					
					break;
					
				}
				
			}
			
		} else {

			System.out.println("\nO medo invade o seu coração e você sente que ainda não está à altura do desafio. \n"
					+ "Você se volta para a noite lá fora e corre em direção à segurança.\n");

		}
		
		sc.close();
	}
}
