import java.util.Random;
import java.util.Scanner;

public class game {
	
	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		
		String nickname;
		int classe;
		String skill = "";
		
		System.out.println("Olá humano, eu me chamo IAra.\n");	
		System.out.println("Sim uma piada bem de mal gosto do meu criador...\n");
		System.out.println("Continuando nossa conversa, seja bem vindo a demo de Fantasy, nosso jogo totalmente imerviso em realidade virtual em que você pode ser quem quiser em um mundo de fantasia.\n");
		System.out.println("Primeiramente como gostaria de ser chamado? \n");	
		System.out.println("Por favor digite o seu nickname: ");		
		nickname = in.nextLine();
		System.out.println("\nOlá JoazinhoNoobGamer, seja bem vindo a Fantasy\n");
		System.out.println("Desculpe-me falei o nickname de outro de nossos jogadores, por conta da chuva nossos sistemas estão instaveis, então ja aproveite o momento e olhe nosso pacote de skins de inverno.\n");
		System.out.println("Seja bem vindo a Fantasy " + nickname);
		
		System.out.println("A partir de agora vamos escolher com qual classe deseja jogar, escolha algum dos numeros para selecionar: \n");
		System.out.println("1 - Guerreiro (Você pode partir para a luta sem freios gritando) ");
		System.out.println("2 - Mago (O mago é implacavel) ");
		System.out.println("3 - Arqueiro (Será você o proximo Legolas ou Stormtrooper?) ");
		classe = in.nextInt();
		
		if(classe == 1) {
			System.out.println("Parabéns você ganhou uma espada de madeira e um saco de batata de armadura ");
			System.out.println("Foi desbloqueado uma skill: Grito de Guerra ");
			System.out.println("Você achou mesmo que começaria cheio de equipamentos? Hahahaha para isso precisa comprar o nosso pacote de iniciante que irá sair em breve ");
			System.out.println("Sem mais delongas vamos começar nossa aventura \n");
			
			skill = "Você grita Leeeeeeroy Jeeeeenkins e o inimigo bate em retirada, o esperado de um guerreiro";
			
		}else if(classe == 2) {
			System.out.println("Parabéns você ganhou uma varinha (para os mais intimos um graveto) e um manto que mais parece um pano de chão \n");
			System.out.println("Foi desbloqueado uma skill: Explosion \n");
			System.out.println("Você achou mesmo que começaria cheio de equipamentos? Hahahaha para isso precisa comprar o nosso pacote de iniciante que irá sair em breve \n");
			System.out.println("Sem mais delongas vamos começar nossa aventura \n");			

			skill = "Parabéns você explodiu a sala e tudo que estava nela, uma grande audacia da sua parte não é você que construiu o labirinto né??";
					
		}else if(classe == 3) {
			System.out.println("Parabéns você ganhou um arco de madeira e flechas de pedra, e uns panos para se cobrir para não termos problema de nudez\n");
			System.out.println("Foi desbloqueado uma skill: Grande Salto Ninja \n");
			System.out.println("Você achou mesmo que começaria cheio de equipamentos? Hahahaha para isso precisa comprar o nosso pacote de iniciante que irá sair em breve \n");
			System.out.println("Sem mais delongas vamos começar nossa aventura \n");
			
			skill = "Você deu um pulo de susto e conseguiu esquivar do ataque inimigo seguindo em frente, as olimpiadas que aguardem";
		}
		
		boolean chave = false;		
		
		Random random = new Random();
		
		String comando = in.nextLine();
		
		System.out.println("Agora estamos no labirinto: Onde é Que Eu To, um grande castelo de pedra separado por várias portas \n");
		System.out.println("Na entrada você se depara com uma porta a esquerda \n");
		System.out.println("Digite (e) para continuar \n");
		comando = in.nextLine();
		
		
		//Sala da Chave
		 if (comando.equals("e")) {
			System.out.println("Você entra em um grande quarto com uma chave em cima de uma mesa chique, você pode escolher entre pegar ou continuar a seguir seu caminho\n");
			System.out.println("Para pegar digite (p) para continuar digite (c) \n");
			comando = in.nextLine();
			
			if(comando.equals("p")) {
				System.out.println("Parece que essa chave é uma daqueles que vai servir mais a frente, agora você pode continuar o caminho ja que so tem uma opçõao de caminho a frente \n");
				chave = true;
				System.out.println("Na proxima sala tem uma porta a sua frente escrito PERIGO e uma a direita escrita SALÃO PRINCIPAL \n");
				System.out.println("Para seguir em frente na porta PERIGO digite (f) e para continuar no caminho a direita no SALÃO PRINCIPAL (d) \n");
				comando = in.nextLine();
				if (comando.equals("f")) {
					System.out.println("Bom não foi falta de aviso, você morreu... \n");
				}else if(comando.equals("d")) {
					System.out.println("Você se depara com um enorme salão muito chique, mas não tem nada aqui para você, nesse salão tem 1 porta a frente \n");
					System.out.println("Digite (f) para continuar \n");
					comando = in.nextLine();
					if(comando.equals("f")) {
						System.out.println("Ao entrar no quarto JoazinhoNoobGamer lhe propõe um desafio no qual você não pode recusar, pois ele não irá deixar você passar \n");
						if(classe == 1) {
							System.out.println("Você deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
							comando = in.nextLine();
							if(comando.equals("s")) {
								System.out.println(skill);
								System.out.println("Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
								System.out.println("Escolha algum dos caminhos: \n");
								comando = in.nextLine();
								if(comando.equals("f")) {
									System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}else if(comando.equals("d")) {
									System.out.println("Você encontrou um báu com uma excalibur e a saída do castelo \n");
									System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}
							}else if(comando.equals("a")) {
								int resultado = random.nextInt(1);
								if(resultado == 0) {
									System.out.println("Você perdeu a batalha e sua jornada acaba por aqui... \n");
								}else if(resultado == 2) {
									System.out.println("Você ganhou a batalha, Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("Você encontrou um báu com uma excalibur e a saída do castelo \n");
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}
							}
							}else if(classe == 2) {
								System.out.println("Você deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("Era pra ter um bau nessa sala mas como você explodiu tudo não esta merecendo e tem uma saída do castelo \n");
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Você perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Você ganhou a batalha, Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("Era pra ter um bau nessa sala mas como você explodiu tudo não esta merecendo e tem uma saída do castelo \n");
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}
									}
								}
							}else if(classe == 3) {
								System.out.println("Você deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("Você adquiriu uma bazuka extravagante e tem uma saída do castelo \n");
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Você perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Você ganhou a batalha, Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("Você adquiriu uma bazuka extravagante e tem uma saída do castelo \n");
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}
									}
								}
							}
						}
					}
				}
			}else if(comando.equals("c")) {
				System.out.println("A chave era importante mas tudo bem cada um com suas escolhas, agora você pode continuar o caminho ja que so tem uma opçõao de caminho a frente \n");
				chave = false;
				System.out.println("Na proxima sala tem uma porta a sua frente escrito PERIGO e uma a direita escrita SALÃO PRINCIPAL \n");
				System.out.println("Para seguir em frente na porta PERIGO digite (f) e para continuar no caminho a direita no SALÃO PRINCIPAL (d) \n");
				if (comando.equals("f")) {
					System.out.println("Bom não foi falta de aviso, você morreu... \n");
				}else if(comando.equals("d")) {
					System.out.println("Você se depara com um enorme salão muito chique, mas não tem nada aqui para você, nesse salão tem 1 porta a frente \n");
					System.out.println("Digite (f) para continuar \n");
					comando = in.nextLine();
					if(comando.equals("f")) {
						System.out.println("Ao entrar no quarto JoazinhoNoobGamer lhe propõe um desafio no qual você não pode recusar, pois ele não irá deixar você passar \n");
						if(classe == 1) {
							System.out.println("Você deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
							comando = in.nextLine();
							if(comando.equals("s")) {
								System.out.println(skill);
								System.out.println("Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
								System.out.println("Escolha algum dos caminhos: \n");
								comando = in.nextLine();
								if(comando.equals("f")) {
									System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}else if(comando.equals("d")) {
									System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
									System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
									System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
								}
							}else if(comando.equals("a")) {
								int resultado = random.nextInt(1);
								if(resultado == 0) {
									System.out.println("Você perdeu a batalha e sua jornada acaba por aqui... \n");
								}else if(resultado == 2) {
									System.out.println("Você ganhou a batalha, Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}
							}
							}else if(classe == 2) {
								System.out.println("Você deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Você perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Você ganhou a batalha, Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}
									}
								}
							}else if(classe == 3) {
								System.out.println("Você deseja usar sua skill ou atacar o inimigo? Digite (s) para skill e (a) para atacar \n");
								comando = in.nextLine();
								if(comando.equals("s")) {
									System.out.println(skill);
									System.out.println("Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
									System.out.println("Escolha algum dos caminhos: \n");
									comando = in.nextLine();
									if(comando.equals("f")) {
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}else if(comando.equals("d")) {
										System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
										System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
										System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
									}
								}else if(comando.equals("a")) {
									int resultado = random.nextInt(1);
									if(resultado == 0) {
										System.out.println("Você perdeu a batalha e sua jornada acaba por aqui... \n");
									}else if(resultado == 2) {
										System.out.println("Você ganhou a batalha, Agora tem uma porta a sua frente (f) onde é possivel ver uma luz passando por baixo e uma a direita (d) bem suspeita \n");
										System.out.println("Escolha algum dos caminhos: \n");
										comando = in.nextLine();
										if(comando.equals("f")) {
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
											System.out.println("Obrigado por jogar nossa demo de Fantasy \n");
										}else if(comando.equals("d")) {
											System.out.println("A porta se encontra trancada, parece que a chave era util ne? \n");
											System.out.println("Parabéns você conseguiu passar de todos os desafios \n");
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