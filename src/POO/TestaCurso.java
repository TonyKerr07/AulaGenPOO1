package POO;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste curso
		
		curso curso1 = new curso(
				"Desenvolvedor", "Generation", 3, "Integral", 1000);
		curso curso2 = new curso(
				"Soft Skills", "Generation", 3, "Noturno", 1500);
		
		curso1.visualizar();
		curso2.visualizar();
		
		LivreHerancaCurso LHC1 = new LivreHerancaCurso(
				"Java basico", "Generation", 2, "Integral", 499, "5,0 Estrelas");
		LivreHerancaCurso LHC2 = new LivreHerancaCurso(
				"Java avançado", "Generation", 6, "Integral", 1299, "5,0 Estrelas");
		
		LHC1.visualizar();
		LHC2.visualizar();
		
		EspecialHerancaCurso EHC1 = new EspecialHerancaCurso(
				"TechLead", "Generation", 3, "Integral", 999, "Superior em Tecnologia");
		EspecialHerancaCurso EHC2 = new EspecialHerancaCurso(
				"Scrum Master", "Generation", 6, "Integral", 1499, "Experiência em Scrum");
		
		EHC1.visualizar();
		EHC2.visualizar();
		
	}

}
