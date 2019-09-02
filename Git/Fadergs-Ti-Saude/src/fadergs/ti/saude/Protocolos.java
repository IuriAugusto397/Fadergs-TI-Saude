package fadergs.ti.saude;

public class Protocolos {
	 //Essa função simula uma leitura de dados salvos previamente
    public static void lerDados() {
        // função para preencher o nó com uma pergunta
    	
    	//primeira pergunta
        No.inserir(16, "A criança está com tosse ou\r\n" + 
        		"dificuldade para respirar?\n");

        // Linha 2
        //pergunta 16 - resposta 8 não
        No.inserir(8, "Questionar a Queixa principal e\r\n" + 
        		"aplicar o protocolo adequado ...\n");
      //pergunta 16 - resposta 24 sim
        No.inserir(24, "Observar algum dos seguintes sinais:\r\n" + 
        		"• Qualquer sinal geral de perigo.\r\n" + 
        		"• Tiragem subcostal.\r\n" + 
        		"• Estridor em repouso.\r\n" + 
        		"Há a presença de algum\r\n" + 
        		"desses sinais ?\n");

      // linha 3
      //pergunta 8 - resposta 4 não
       
      //pergunta 8 - resposta 12 sim
       
      //pergunta 24 - resposta 20 não
        No.inserir(20, "Observar se há Respiração\r\n" + 
        		"rápida ...\n");
      //pergunta 24 - resposta sim 28 
        No.inserir(28, "\"PNEUMONIA GRAVE OU DOENÇA\r\n" + 
        		"MUITO GRAVE\" \\r\\n Tratar:\r\n" + 
        		"• Dar a primeira dose de um antibiótico\r\n" + 
        		"recomendado.\r\n" + 
        		"• Tratar a criança para evitar hipoglicemia.\r\n" + 
        		"• Referir urgentemente ao hospital.\r\n" + 
        		"• Oxigênio, se disponível.\n");

        // linha 4
      //pergunta 4 - resposta 2 não
       
      //pergunta 4 - resposta 6 sim
       
      //pergunta 12 - resposta 10 não
       
      //pergunta 12 - resposta 14 sim
       
      //pergunta 20 - resposta 18 não
        No.inserir(18, " Não há presença nenhum dos sinais\r\n" + 
        		"citados ...\r\n" + 
        		"Então,\r\n" + 
        		"\"NÃO É PNEUMONIA\"\r\n" + 
        		"TRATAR:\r\n" + 
        		"• Aliviar a tosse com medidas caseiras.\r\n" + 
        		"• Informar a mãe sobre quando retornar\r\n" + 
        		"imediatamente.\r\n" + 
        		"• Seguimento em cinco dias, caso não\r\n" + 
        		"melhore.\r\n" + 
        		"• Se tosse há mais de 14 dias, realizar\r\n" + 
        		"investigação\n");
       
      //pergunta 20 - resposta 22 sim
        No.inserir(22, "\"PNEUMONIA\"\r\n" + 
        		"Tratar:\r\n" + 
        		"*Dar um antibiótico recomendado durante sete\r\n" + 
        		"dias.\r\n" + 
        		"• Aliviar a tosse com medidas caseiras.\r\n" + 
        		"• Informar a mãe sobre quando retornar\r\n" + 
        		"imediatamente.\r\n" + 
        		"• Marcar o retorno em dois dias\n");
       
      //pergunta 28 - resposta 26 não
      //pergunta 28 - resposta 30 sim

        // Ultima linha
        //a espaço para mais respostas
        }

}
