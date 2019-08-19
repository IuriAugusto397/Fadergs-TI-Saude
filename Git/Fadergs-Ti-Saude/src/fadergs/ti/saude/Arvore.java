
package fadergs.ti.saude;

import java.util.Scanner;

public class Arvore {
	
	public static void main(String[] args) {
		//Raiz
		//Como não criei um menu para inserir as perguntas, 
		//criei um loop para preencher as perguntas
		Scanner scan = new Scanner(System.in);

		String opcao;

		do {
			System.out.println("Bem vindo!");
			System.out.println("1 - Inserir dados manualmente");
			System.out.println("2 - Rodar Programa");
			System.out.println("3 - Sair");
			System.out.println("4 - Inserir dados gravados");
			opcao = scan.next();

			switch (opcao) {
			case "1":
				No.inserirManual(16);;
				break;
			case "2":
				No.programa(No.raiz);	
				break;
			case "3":
				System.out.println("Até mais!");
				break;
			case "4":
				System.out.println("Dados inseridos com sucesso!");
				No.lerDados();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (!(opcao.equals("3")));
	

	}
}