import java.util.Random;
import java.util.Scanner;

public class game {
	
	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		
		String nickname;
		int classe;
		String skill = "";
		
		System.out.println("Ol� humano, eu me chamo IAra.\n");	
		System.out.println("Sim uma piada bem de mal gosto do meu criador...\n");
		System.out.println("Continuando nossa conversa, seja bem vindo a demo de Fantasy, nosso jogo totalmente imerviso em realidade virtual em que voc� pode ser quem quiser em um mundo de fantasia.\n");
		System.out.println("Primeiramente como gostaria de ser chamado? \n");	
		System.out.println("Por favor digite o seu nickname: ");		
		nickname = in.nextLine();
		System.out.println("\nOl� JoazinhoNoobGamer, seja bem vindo a Fantasy\n");
		System.out.println("Desculpe-me falei o nickname de outro de nossos jogadores, por conta da chuva nossos sistemas est�o instaveis, ent�o ja aproveite o momento e olhe nosso pacote de skins de inverno.\n");
		System.out.println("Seja bem vindo a Fantasy " + nickname);
		
		System.out.println("A partir de agora vamos escolher com qual classe deseja jogar, escolha algum dos numeros para selecionar: \n");
		System.out.println("1 - Guerreiro (Voc� pode partir para a luta sem freios gritando) ");
		System.out.println("2 - Mago (O mago � implacavel) ");
		System.out.println("3 - Arqueiro (Ser� voc� o proximo Legolas ou Stormtrooper?) ");
		classe = in.nextInt();
		
		if(classe == 1) {
			System.out.println("Parab�ns voc� ganhou uma espada de madeira e um saco de batata de armadura ");
			System.out.println("Foi desbloqueado uma skill: Grito de Guerra ");
			System.out.println("Voc� achou mesmo que come�aria cheio de equipamentos? Hahahaha para isso precisa comprar o nosso pacote de iniciante que ir� sair em breve ");
			System.out.println("Sem mais delongas vamos come�ar nossa aventura \n");
			
			skill = "Voc� grita Leeeeeeroy Jeeeeenkins e o inimigo bate em retirada, o esperado de um guerreiro";
			
		}else if(classe == 2) {
			System.out.println("Parab�ns voc� ganhou uma varinha (para os mais intimos um graveto) e um manto que mais parece um pano de ch�o \n");
			System.out.println("Foi desbloqueado uma skill: Explosion \n");
			System.out.println("Voc� achou mesmo que come�aria cheio de equipamentos? Hahahaha para isso precisa comprar o nosso pacote de iniciante que ir� sair em breve \n");
			System.out.println("Sem mais delongas vamos come�ar nossa aventura \n");			

			skill = "Parab�ns voc� explodiu a sala e tudo que estava nela, uma grande audacia da sua parte n�o � voc� que construiu o labirinto n�??";
					
		}else if(classe == 3) {
			System.out.println("Parab�ns voc� ganhou um arco de madeira e flechas de pedra, e uns panos para se cobrir para n�o termos problema de nudez\n");
			System.out.println("Foi desbloqueado uma skill: Grande Salto Ninja \n");
			System.out.println("Voc� achou mesmo que come�aria cheio de equipamentos? Hahahaha para isso precisa comprar o nosso pacote de iniciante que ir� sair em breve \n");
			System.out.println("Sem mais delongas vamos come�ar nossa aventura \n");
			
			skill = "Voc� deu um pulo de susto e conseguiu esquivar do ataque inimigo seguindo em frente, as olimpiadas que aguardem";
		}
		
		boolean chave = false;		
		
		Random random = new Random();
		
		String comando = in.nextLine();
		
		System.out.println("Agora estamos no labirinto: Onde � Que Eu To, um grande castelo de pedra separado por v�rias portas \n");
		System.out.println("Na entrada voc� se depara com uma porta a esquerda \n");
		System.out.println("Digite (e) para continuar \n");
		comando = in.nextLine();
		
		
		//Sala da Chave
		 if (comando.equals("e")) {
			System.out.println("Voc� entra em um grande quarto com uma chave em cima de uma mesa chique, voc� pode escolher entre pegar ou continuar a seguir seu caminho\n");
			System.out.println("Para pegar digite (p) para continuar digite (c) \n");
			comando = in.nextLine();
			
			if(comando.equals("p")) {
				System.out.println("Parece que essa chave � uma daqueles que vai servir mais a frente, agora voc� pode continuar o caminho ja que so tem uma op��ao de caminho a frente \n");
				chave = true;
				System.out.println("Na proxima sala tem uma porta a sua frente escrito PERIGO e uma a direita escrita SAL�O PRINCIPAL \n");
				System.out.println("Para seguir em frente na porta PERIGO digite (f) e para continuar no caminho a direita no SAL�O PRINCIPAL (d) \n");
				comando = in.nextLine();
				if (comando.equals("f")) {
					System.out.println("Bom n�o foi falta de aviso, voc� morreu... \n");
				}else if(comando.equals("d")) {
					System.out.println("Voc� se depara com um enorme sal�o muito chique, mas n�o tem nada aqui para voc�, nesse sal�o tem 1 porta a frente \n");
					System.out.println("Digite (f) para continuar \n");
					comando = in.nextLine();
					if(comando.equals("f")) {
						System.out.println("Ao entrar no quarto JoazinhoNoobGamer lhe prop�e um desafio no qual voc� n�o pode recusar, pois ele n�o ir� deixar voc� passar \n");
						if(classe == 1) {
							System.out.println("Voc� deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
							comando = in.nextLine();
							if(comando.equals("s")) {
								System.out.println(skill);
								System.out.println("Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
								System.out.println("Escolha algum dos caminhos: \n");
								comando = in.nextLine();
								if(comando.equals("f")) {
									System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}else if(comando.equals("d")) {
									System.out.println("Voc� encontrou um b�u com uma excalibur e a sa�da do castelo \n");
									System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}
							}else if(comando.equals("a")) {
								int resultado = random.nextInt(1);
								if(resultado == 0) {
									System.out.println("Voc� perdeu a batalha e sua jornada acaba por aqui... \n");
								}else if(resultado == 2) {
									System.out.println("Voc� ganhou a batalha, Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("Voc� encontrou um b�u com uma excalibur e a sa�da do castelo \n");
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}
							}
							}else if(classe == 2) {
								System.out.println("Voc� deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("Era pra ter um bau nessa sala mas como voc� explodiu tudo n�o esta merecendo e tem uma sa�da do castelo \n");
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Voc� perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Voc� ganhou a batalha, Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("Era pra ter um bau nessa sala mas como voc� explodiu tudo n�o esta merecendo e tem uma sa�da do castelo \n");
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}
									}
								}
							}else if(classe == 3) {
								System.out.println("Voc� deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("Voc� adquiriu uma bazuka extravagante e tem uma sa�da do castelo \n");
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Voc� perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Voc� ganhou a batalha, Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("Voc� adquiriu uma bazuka extravagante e tem uma sa�da do castelo \n");
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}
									}
								}
							}
						}
					}
				}
			}else if(comando.equals("c")) {
				System.out.println("A chave era importante mas tudo bem cada um com suas escolhas, agora voc� pode continuar o caminho ja que so tem uma op��ao de caminho a frente \n");
				chave = false;
				System.out.println("Na proxima sala tem uma porta a sua frente escrito PERIGO e uma a direita escrita SAL�O PRINCIPAL \n");
				System.out.println("Para seguir em frente na porta PERIGO digite (f) e para continuar no caminho a direita no SAL�O PRINCIPAL (d) \n");
				if (comando.equals("f")) {
					System.out.println("Bom n�o foi falta de aviso, voc� morreu... \n");
				}else if(comando.equals("d")) {
					System.out.println("Voc� se depara com um enorme sal�o muito chique, mas n�o tem nada aqui para voc�, nesse sal�o tem 1 porta a frente \n");
					System.out.println("Digite (f) para continuar \n");
					comando = in.nextLine();
					if(comando.equals("f")) {
						System.out.println("Ao entrar no quarto JoazinhoNoobGamer lhe prop�e um desafio no qual voc� n�o pode recusar, pois ele n�o ir� deixar voc� passar \n");
						if(classe == 1) {
							System.out.println("Voc� deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
							comando = in.nextLine();
							if(comando.equals("s")) {
								System.out.println(skill);
								System.out.println("Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
								System.out.println("Escolha algum dos caminhos: \n");
								comando = in.nextLine();
								if(comando.equals("f")) {
									System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}else if(comando.equals("d")) {
									System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
									System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}
							}else if(comando.equals("a")) {
								int resultado = random.nextInt(1);
								if(resultado == 0) {
									System.out.println("Voc� perdeu a batalha e sua jornada acaba por aqui... \n");
								}else if(resultado == 2) {
									System.out.println("Voc� ganhou a batalha, Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}
							}
							}else if(classe == 2) {
								System.out.println("Voc� deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Voc� perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Voc� ganhou a batalha, Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}
									}
								}
							}else if(classe == 3) {
								System.out.println("Voc� deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
										System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Voc� perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Voc� ganhou a batalha, Agora tem uma porta a sua frente (f) onde � possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
											System.out.println("Parab�ns voc� conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}
									}
								}
							}
						}
				}
			
						
			
		}
		
		
		
		
		
	}

}