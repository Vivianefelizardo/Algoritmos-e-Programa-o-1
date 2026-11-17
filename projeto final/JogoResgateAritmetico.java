import java.util.Scanner;
import java.util.Random;

public class JogoResgateAritmetico {

    static int[] historicoPontuacao = new int[10];
    static int totalPartidas = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        boolean executando = true;

        while (executando) {
            System.out.println("\n\n==================================================");
            System.out.println(" MENU PRINCIPAL - O RESGATE ARITMETICO ");
            System.out.println("==================================================");
            System.out.println("1 - Iniciar Novo Jogo");
            System.out.println("2 - Ver Historico de Pontuacoes");
            System.out.println("3 - Sair do Jogo");
            System.out.println("==================================================");
            System.out.print("Escolha uma opcao: ");
            
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    jogarPartida(entrada, rand); 
                    break;
                case 2:
                    exibirHistorico(); 
                    break;
                case 3:
                    System.out.println("\nObrigado por jogar! Ate a proxima.");
                    executando = false;
                    break;
                default:
                    System.out.println("\n[!] Opcao invalida! Tente novamente.");
            }
        }
        entrada.close();
    }

    public static void jogarPartida(Scanner entrada, Random rand) {
        int vidaMaxima = 100;
        int pontuacao = 0;
        int tempoLimite = 30; 
        
        System.out.println("\n\n==================================================");
        System.out.println(" ESCOLHA SEU PERSONAGEM ");
        System.out.println("==================================================");
        System.out.println("1. Shreko (O Ogro da Adicao) - Bonus: +50 de Vida inicial");
        System.out.println("2. Burrito Mestre da Multiplicacao) - Bonus: Dobra pontos na multiplicacao");
        System.out.println("3. Miau de Botas (O As da Divisao) - Bonus: Dicas nas divisoes");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite o numero do seu personagem (1, 2 ou 3): ");
        int personagem = entrada.nextInt();

        if (personagem == 1) {
            vidaMaxima = 150;
            System.out.println("\nVoce escolheu o Shreko! Vida total: " + vidaMaxima + " HP");
        } else if (personagem == 2) {
            System.out.println("\nVoce escolheu o Burrito! Pontos de multiplicacao dobrados. Vida: " + vidaMaxima + " HP");
        } else if (personagem == 3) {
            System.out.println("\nVoce escolheu o Miau de Botas! Dicas ativadas. Vida: " + vidaMaxima + " HP");
        } else {
            System.out.println("\n[!] Opcao invalida. Jogando com estatisticas padrao. Vida: " + vidaMaxima + " HP");
        }
        
        int vida = vidaMaxima;

        System.out.println("\n\n==================================================");
        System.out.println(" PERGUNTA 1: A PONTE DO PANTANO");
        System.out.println("==================================================");
        int baldes = rand.nextInt(5) + 3;  
        int sapos = rand.nextInt(6) + 2;   
        int soltos = rand.nextInt(10) + 1; 
        int resp1 = (baldes * sapos) + soltos;

        System.out.println("Expressao: " + baldes + " * " + sapos + " + " + soltos);
        System.out.println("A) " + (resp1 - 2));
        System.out.println("B) " + resp1);
        System.out.println("C) " + (resp1 + 4));

        if (executarDesafio(entrada, 'B', resp1, tempoLimite)) {
            pontuacao += (personagem == 2) ? 20 : 10;
            System.out.println("\n[SUCESSO] Resposta Correta!");
        } else {
            int dano = rand.nextInt(21) + 20; 
            vida -= dano;
            System.out.println("\n[FALHA] Errou! O Troll te causou " + dano + " de dano! [HP]: " + Math.max(0, vida));
        }
        if (vida <= 0) { finalizarJogo(pontuacao, false); return; }

        System.out.println("\n\n==================================================");
        System.out.println(" PERGUNTA 2: A FLORESTA SOMBRIA");
        System.out.println("==================================================");
        int grupos = rand.nextInt(4) + 2;
        int totalFadas = grupos * (rand.nextInt(5) + 4);
        int fugiram = rand.nextInt(3) + 1;
        int resp2 = (totalFadas / grupos) - fugiram;

        if (personagem == 3) { 
            System.out.println("[DICA DO GATO]: Primeiro divida " + totalFadas + " por " + grupos + ", depois subtraia " + fugiram + "!");
        }
        System.out.println("Expressao: (" + totalFadas + " / " + grupos + ") - " + fugiram);
        System.out.println("A) " + resp2);
        System.out.println("B) " + (resp2 + 3));
        System.out.println("C) " + (resp2 - 1));

        if (executarDesafio(entrada, 'A', resp2, tempoLimite)) {
            pontuacao += 10;
            System.out.println("\n[SUCESSO] Resposta Correta!");
        } else {
            int dano = rand.nextInt(21) + 20; 
            vida -= dano;
            System.out.println("\n[FALHA] Errou! Uma fada maligna causou " + dano + " de dano! [HP]: " + Math.max(0, vida));
        }
        if (vida <= 0) { finalizarJogo(pontuacao, false); return; }

        System.out.println("\n\n==================================================");
        System.out.println(" PERGUNTA 3: O LABIRINTO (MATRIZ)");
        System.out.println("==================================================");
        int[][] mapaTorre = { {1, 0, 1}, {0, 2, 0}, {1, 0, 3} };
        System.out.print("Digite a linha da sala segura (0 a 2): ");
        int linha = entrada.nextInt();
        System.out.print("Digite a coluna da sala segura (0 a 2): ");
        int coluna = entrada.nextInt();

        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            int dano = rand.nextInt(16) + 15;
            vida -= dano;
            System.out.println("\n[!] Fora do mapa! Caiu no buraco. Dano: " + dano + " [HP]: " + Math.max(0, vida));
        } else if (mapaTorre[linha][coluna] == 0) {
            int dano = rand.nextInt(26) + 25;
            vida -= dano;
            System.out.println("\n[!] Armadilha! Uma flecha te atingiu. Dano: " + dano + " [HP]: " + Math.max(0, vida));
        } else {
            System.out.println("\n[SUCESSO] Sala segura encontrada!");
        }
        if (vida <= 0) { finalizarJogo(pontuacao, false); return; }

        System.out.println("\n\n==================================================");
        System.out.println(" PERGUNTA 4: A CAVERNA DOS MORCEGOS");
        System.out.println("==================================================");
        int resp4 = 12 * 3 - (10 / 2); // 36 - 5 = 31
        System.out.println("Expressao: 12 * 3 - (10 / 2)");
        System.out.println("A) 28");
        System.out.println("B) 35");
        System.out.println("C) 31");

        if (executarDesafio(entrada, 'C', resp4, tempoLimite)) {
            pontuacao += 10;
            System.out.println("\n[SUCESSO] Resposta Correta!");
        } else {
            int dano = rand.nextInt(21) + 20; 
            vida -= dano;
            System.out.println("\n[FALHA] Errou! Os morcegos te atacaram. Dano: " + dano + " [HP]: " + Math.max(0, vida));
        }
        if (vida <= 0) { finalizarJogo(pontuacao, false); return; }

        System.out.println("\n\n==================================================");
        System.out.println(" PERGUNTA 5: O PORTAO DE FOGO");
        System.out.println("==================================================");
        int resp5 = (8 + 7) * 4; // 60
        System.out.println("Expressao: (8 + 7) * 4");
        System.out.println("A) 60");
        System.out.println("B) 52");
        System.out.println("C) 64");

        if (executarDesafio(entrada, 'A', resp5, tempoLimite)) {
            pontuacao += 10;
            System.out.println("\n[SUCESSO] Resposta Correta!");
        } else {
            int dano = rand.nextInt(21) + 20; 
            vida -= dano;
            System.out.println("\n[FALHA] Errou! O fogo te queimou. Dano: " + dano + " [HP]: " + Math.max(0, vida));
        }
        if (vida <= 0) { finalizarJogo(pontuacao, false); return; }

        System.out.println("\n\n==================================================");
        System.out.println(" PERGUNTA 6: MINI-CHEFE - O GOLEM DE CRISTAIS");
        System.out.println("==================================================");
        System.out.println("Se voce errar, o Golem te esmagara e sera FIM DE JOGO!");
        System.out.println("Se acertar, sua vida sera completamente restaurada.");
        int resp6 = (20 * 3) / 2 + 15; // 30 + 15 = 45
        System.out.println("\nExpressao: (20 * 3) / 2 + 15");
        System.out.println("A) 40");
        System.out.println("B) 45");
        System.out.println("C) 50");

        if (executarDesafio(entrada, 'B', resp6, tempoLimite + 5)) {
            pontuacao += 30;
            vida = vidaMaxima;
            System.out.println("\n[SUCESSO ABSOLUTO] Voce destruiu o Golem!");
            System.out.println("[+] Sua vida foi totalmente restaurada para " + vida + " HP!");
        } else {
            vida = 0;
            System.out.println("\n[FALHA CRITICA] O Golem esmagou voce em um unico golpe!");
            finalizarJogo(pontuacao, false);
            return;
        }

        System.out.println("\n\n==================================================");
        System.out.println(" A ESCALADA DA TORRE (PERGUNTAS 7 A 12) ");
        System.out.println("==================================================");
        
        for (int i = 7; i <= 12; i++) {
            System.out.println("\n--- PERGUNTA " + i + " ---");
            int valA = rand.nextInt(3 * i) + 5; 
            int valB = rand.nextInt(2 * i) + 2;
            int valC = rand.nextInt(5 * i) + 5;
            int respEscalada = (valA * valB) + valC;

            System.out.println("Expressao: (" + valA + " * " + valB + ") + " + valC);
            
            int[] opcoes = new int[3];
            int posCorreta = rand.nextInt(3);
            opcoes[posCorreta] = respEscalada;
            opcoes[(posCorreta + 1) % 3] = respEscalada + rand.nextInt(15) + 2;
            opcoes[(posCorreta + 2) % 3] = respEscalada - (rand.nextInt(15) + 2);
            
            char letraCerta = (char)('A' + posCorreta);
            
            System.out.println("A) " + opcoes[0]);
            System.out.println("B) " + opcoes[1]);
            System.out.println("C) " + opcoes[2]);

            if (executarDesafio(entrada, letraCerta, respEscalada, tempoLimite)) {
                pontuacao += 15;
                System.out.println("[SUCESSO] Voce avancou mais um andar!");
            } else {
                int dano = rand.nextInt(10 + (i*5)) + 20; 
                vida -= dano;
                System.out.println("[FALHA] Armadilha ativada! Dano: " + dano + " [HP]: " + Math.max(0, vida));
                if (vida <= 0) {
                    finalizarJogo(pontuacao, false);
                    return;
                }
            }
        }

        System.out.println("\n\n==================================================");
        System.out.println(" PERGUNTA 13: CHEFE FINAL - DANIEL VORCARO");
        System.out.println("==================================================");
        System.out.println("Daniel Vorcaro surge das sombras com a equacao definitiva!");
        
        int respFinal = ((50 * 4) / 2) + (3 * 15) - 20; // 100 + 45 - 20 = 125
        System.out.println("\nExpressao: ((50 * 4) / 2) + (3 * 15) - 20");
        System.out.println("A) 115");
        System.out.println("B) 125");
        System.out.println("C) 135");

        if (executarDesafio(entrada, 'B', respFinal, tempoLimite + 10)) {
            pontuacao += 100;
            System.out.println("\n[VITORIA EPICA] Voce derrotou Daniel Vorcaro e resgatou a Princesa!");
            finalizarJogo(pontuacao, true);
        } else {
            vida = 0;
            System.out.println("\n[FALHA FATAL] Daniel Vorcaro usou seu ataque especial e dizimou sua vida!");
            finalizarJogo(pontuacao, false);
        }
    }

    public static boolean executarDesafio(Scanner entrada, char letraCorreta, int numeroCorreto, int tempoLimiteSec) {
        long inicio = System.currentTimeMillis();
        System.out.print("Sua resposta (Letra ou Numero): ");
        String respostaUsuario = entrada.next().trim().toUpperCase();
        long tempoGasto = (System.currentTimeMillis() - inicio) / 1000;

        if (tempoGasto > tempoLimiteSec) {
            System.out.println("\n[RELOGIO] Tempo esgotado! Voce levou " + tempoGasto + "s.");
            return false;
        }

        if (respostaUsuario.length() == 1 && respostaUsuario.charAt(0) == letraCorreta) {
            return true;
        }

        try {
            int respostaNumero = Integer.parseInt(respostaUsuario);
            if (respostaNumero == numeroCorreto) {
                return true;
            }
        } catch (NumberFormatException e) {
            // Ignora se nao for numero
        }
        return false;
    }

    public static void finalizarJogo(int pontuacao, boolean venceu) {
        System.out.println("\n\n==================================================");
        System.out.println(" RESULTADO DA PARTIDA ");
        System.out.println("==================================================");
        if (!venceu) {
            System.out.println("[GAME OVER] Voce foi derrotado.");
        }
        System.out.println("Pontuacao obtida: " + pontuacao + " pontos.");

        if (totalPartidas < historicoPontuacao.length) {
            historicoPontuacao[totalPartidas] = pontuacao; 
            totalPartidas++;
        } else {
            System.out.println("[AVISO] Historico cheio!");
        }
    }

    public static void exibirHistorico() {
        System.out.println("\n\n==================================================");
        System.out.println(" HISTORICO DE PONTUACOES (VETOR) ");
        System.out.println("==================================================");
        if (totalPartidas == 0) {
            System.out.println("Nenhuma partida registrada ate o momento.");
        } else {
            for (int i = 0; i < totalPartidas; i++) {
                System.out.println("Partida " + (i + 1) + ": " + historicoPontuacao[i] + " pontos");
            }
        }
        System.out.println("==================================================");
    }
}
