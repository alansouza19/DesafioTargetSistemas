package desafiotargetsistemas.faturamentomensal;

public class FaturamentoMensal {

	public static void main(String[] args) {
		
		double sp = 67836.43 ;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double percentualSP;
		double percentualRJ;
		double percentualMG;
		double percentualES;
		double percentualOutros;
		
		
		double total = sp + rj + mg + es + outros;
		
		System.out.println("O valor mensal total da distribuidora é: R$" + total);
		
		percentualSP = (sp * 100) / total;
		percentualRJ = (rj * 100) / total;
		percentualMG = (mg * 100) / total;
		percentualES = (es * 100) / total;
		percentualOutros = (outros * 100) / total;
		System.out.println("SP teve um percentual de: " + percentualSP + "%" + ", RJ teve um percentual de: " + percentualRJ 
				+ "%" + ", MG teve um percentual de: " + percentualMG + "%");
		System.out.println("ES teve um percentual de: " + percentualES + "%" + ", Outros teve um percentual de: " + percentualOutros+ "%");
		
	}

}
