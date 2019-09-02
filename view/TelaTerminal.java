package view;


import java.util.Scanner;

import fadergs.ti.saude.No;
import fadergs.ti.saude.Protocolos;

public class TelaTerminal {
	
	private static Scanner scan;

	public static void start()  {
		scan = new Scanner(System.in);

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
				System.out.println( "\n\nVerificar se há sinais gerais de perigo ...\r\n" + 
		        		"(Na ausência dos mesmos seguir protocolo adequado para cada caso)\n\n");
				No.programa(No.raiz);	
				break;
			case "3":
				System.out.println("Até mais!");
				break;
			case "4":
				System.out.println("Dados inseridos com sucesso!");
				Protocolos.lerDados();
				
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (!(opcao.equals("3")));
	

	}
}
