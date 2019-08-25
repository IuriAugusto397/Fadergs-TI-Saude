package fadergs.ti.saude;

import java.util.Scanner;

public class No {

    int valor;
    String conteudo;
    No esquerda = null; // Apontador para o nó da esquerda
    No direita = null; // Apontador para o nó da direita
    public static No raiz;
    private static Scanner scan;

    public No() {
    }

    public No(int valor) {
        this.valor = valor;
    }

    public No(int valor, String info) {
        this.valor = valor;
        this.conteudo = info;
    }

    public static void inserir(int valor, String info) {
        inserir(raiz, valor, info);
    }

    public static void inserir(No node, int valor, String info) {
        if (node == null) {
            System.out.println("Raiz: " + valor);
            raiz = new No(valor, info);
        } else {
            if (valor < node.valor) {
                if (node.esquerda != null) {
                    inserir(node.esquerda, valor, info);
                } else {
                    if (node.valor == valor) {
                        System.out.println("Nó já inserido!");
                    } else {
                        System.out.println("Iserindo " + valor + " no nó da esquerda de " + node.valor + "!");
                        node.esquerda = new No(valor, info);
                    }
                }
            } else {
                if (node.direita != null) {
                    inserir(node.direita, valor, info);
                } else {
                    if (node.valor == valor) { // checa apenas se o nó atual já
                        // contém o mesmo valor
                        System.out.println("Nó já inserido!");
                    } else {
                        System.out.println("Iserindo " + valor + " no nó da direita de " + node.valor + "!");
                        node.direita = new No(valor, info);
                    }
                }
            }
        }
    }

    public static void inserirManual(int valor) {
        inserirManual(raiz, valor);
    }

    public static void inserirManual(No node, int valor) {
        scan = new Scanner(System.in);
        if (node == null) {

            System.out.println("Raiz: " + valor);
            System.out.println("Digite a Informação");

            //scan.next();
            String info = scan.nextLine();
            raiz = new No(valor, info);
        } else {
            System.out.println(node.valor + " - " + node.conteudo);
            if (!proximoNo()) {
                valor = valor / 2;
                if (node.esquerda != null) {
                    inserirManual(node.esquerda, valor);
                } else {
                    if (node.valor == valor) {
                        System.out.println("Nó já inserido!");
                    } else {
                        //System.out.println(node.conteudo);
                        System.out.println(valor + " - " + "Digite a Informação");
                        scan.nextLine();
                        String info = scan.nextLine();
                        node.esquerda = new No(valor, info);
                    }
                }
            } else {
                valor = valor + (valor / 2);
                if (node.direita != null) {
                    inserirManual(node.direita, valor);
                } else {
                    if (node.valor == valor) { // checa apenas se o nó atual já
                        // contém o mesmo valor
                        System.out.println("Nó já inserido!");
                    } else {
                        //	System.out.println(node.conteudo);
                        System.out.println(valor + " - " + "Digite a Informação");
                        scan.nextLine();
                        String info = scan.nextLine();
                        node.direita = new No(valor, info);
                    }
                }
            }
        }
    }

    public static boolean procuraNo(No node, int valor) {
        boolean ret = false;
        if (node == null) {
            return ret;
        } else if (valor == No.raiz.valor) {
            System.out.println("Valor raiz!");
            return ret = true;
        } else if (valor == node.valor) {
            return ret = true;
        } else {
            if (node.valor > valor) {
                ret = procuraNo(node.esquerda, valor);
            } else {
                ret = procuraNo(node.direita, valor);
            }
        }
        return ret;
    }

    public static boolean proximoNo() {
        scan = new Scanner(System.in);
        System.out.println("S para SIM e N para NÃO!");
        String option = scan.next();

        switch (option.toUpperCase()) {
            case "S":
                return true;
            case "N":
                return false;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                return false;
        }
    }

    public static void programa(No node) {
        if (node.esquerda == null && node.direita == null) {
            System.out.println("VOCÊ ESCOLHEU O TIME: " + node.conteudo);
        } else {
            System.out.println(node.conteudo);
            if (proximoNo()) {
                programa(node.direita);
            } else {
                programa(node.esquerda);
            }
        }
    }

    public static void lerDados() {
        // função para preencher o nó com uma pergunta

        No.inserir(16, "O time pertence ao eixo Rio/São Paulo?");

        // Linha 2
        No.inserir(8, "O time já ganhou a copa Libertadores da América?");
        No.inserir(24, "Já ganhou mundial?");

        // linha 3
        No.inserir(4, "Seu uniforme é tricolor?");
        No.inserir(12, "Seu uniforme tem a cor azul?");
        No.inserir(20, "Seu uniforme é preto e branco?");
        No.inserir(28, "è tri campeão da Libertadores da América?");

        // linha 4
        No.inserir(2, "Foi campeão da Sul Americana?");
        No.inserir(6, "É Bi campeão do Campeonato Brasileiro?");
        No.inserir(10, "Jogou a serie B do campeonato Brasileiro 2017?");
        No.inserir(14, "É o maior campeão da copa do Brasil?");
        No.inserir(18, "É o maior campeão do campeonato Brasileiro?");
        No.inserir(22, "Jogou Roberto Dinamite?");
        No.inserir(26, " Tem a maior torcida do Brasil?");
        No.inserir(30, "Jogou o rei do Futebol?");

        // Ultima linha
        No.inserir(1, "Avaí");
        No.inserir(3, "Chapecoense!");
        No.inserir(5, "Fortaleza");
        No.inserir(7, "Bahia");
        No.inserir(9, "Atletico Mineiro");
        No.inserir(11, "Internacional");
        No.inserir(13, "Grêmio");
        No.inserir(15, "Cruzeiro");
        No.inserir(17, "Fluminense");
        No.inserir(19, "Palmeiras");
        No.inserir(21, "Botofogo");
        No.inserir(23, "Vasco");
        No.inserir(25, "Corinthias");
        No.inserir(27, "Flamengo");
        No.inserir(29, "São Paulo");
        No.inserir(31, "Santos ");
    }
}
