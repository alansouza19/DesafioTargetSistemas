package desafiotargetsistemas.vetorfaturamentodiario;

import java.util.Arrays;

public class VetorFaturamentoDiario {

	public static void main(String[] args) {
		
		
		
		String dia[] = {"dia 1", "dia 2", "dia 3", "dia 4", "dia 5", "dia 6", "dia 7", "dia 8", "dia 9", "dia 10", "dia 11", "dia 12",
				"dia 13", "dia 14", "dia 15", "dia 16", "dia 17", "dia 18", "dia 19", "dia 20", "dia 21", "dia 22", "dia 23","dia 24",
				"dia 25", "dia 26", "dia 27", "dia 28", "dia 29", "dia 30"};
		
		double valor[] = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0,
				3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 
				13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
		
		double maiorValor = valor[0];
		double menorValor = valor[0];
		double totalFaturamento = valor[0]+ valor[1]+ valor[2]+ valor[5]+ valor[7]+ valor[8]+ valor[9]
				+valor[12]+ valor[13]+ valor[14]+ valor[15]+ valor[16]+ valor[19]+ valor[20]
				+ valor[21]+ valor[22]+ valor[23]+ valor[26]+ valor[27]+ valor[28]+ valor[29];
		
		double mediaDiariaFaturamento = totalFaturamento / 21; 
		
		for(int i = 0; i < valor.length; i++) {
			if(menorValor > valor[i] && valor[i] > 0) {
				menorValor = valor[i];
			}		
		}
		
		for(int i = 0; i < valor.length; i++) {
			if(maiorValor < valor[i]) {
				maiorValor = valor[i];
			}		
		}

		System.out.println("O menor valor de faturamento é o dia 14 com: R$" + menorValor);
		System.out.println();
		System.out.println("O maior valor de faturamento é o dia 16 com: R$" + maiorValor);
		System.out.println();
		System.out.println("Média diária: R$" + mediaDiariaFaturamento);
		System.out.println();
		System.out.println("Valores cujo o faturamento é maior do que a média diária:");
		
		for(int i = 0; i < valor.length; i++) {
			if(valor[i] > mediaDiariaFaturamento) {
				System.out.println( "R$" + valor[i]);
				
			}
		}
	}

}
