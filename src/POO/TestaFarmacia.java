package POO;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste farmácia
		
		farmacia remedio1 = new farmacia(
			"Paracetamol", "Remédio para febre e dores", "Empresa 1", "20 comprimidos",19);
		farmacia remedio2 = new farmacia(
			"Novalgina", "Remédio para febre e dor", "Empresa 2", "25 comprimidos",25);

		remedio1.visualizar();
		remedio2.visualizar();
		
		MedicamentoHerancaFarmacia MHF1 = new MedicamentoHerancaFarmacia(
			"Dorflex", "Remédio para febre e dores", "Empresa 3", "10 comprimidos", 10, "1 a cada 8 horas.");
		MedicamentoHerancaFarmacia MHF2 = new MedicamentoHerancaFarmacia(
			"Nimesulida", "Remédio para inflamação", "Empresa 4", "12 comprimidos", 15, "1 a cada 12 horas.");
		
		MHF1.visualizacao();
		MHF2.visualizacao();
		
		PerfumariaHerancaFarmacia PHF1 = new PerfumariaHerancaFarmacia(
			"Desodorante", "Antitranspirante", "Empresa 5", "90 mL", 15, "Aplicação nas axilas.");
		PerfumariaHerancaFarmacia PHF2 = new PerfumariaHerancaFarmacia(
			"Sabonete", "Limpeza diária", "Empresa 6", "100 g", 2, "Aplicação no corpo todo");
			
		PHF1.visualizacao();
		PHF2.visualizacao();
		
	}

}
