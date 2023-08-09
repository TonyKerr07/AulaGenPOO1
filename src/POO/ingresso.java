package POO;

public class ingresso {
	
	// Atributos
	private String espetaculo;
	private String local;
	private String cadeira;
	private String usuario;
	private int dia;
	private String mes;
	private int ano;
	
	// Constructor
	public ingresso(String espetaculo, String local, String cadeira, String usuario, int dia, String mes, int ano) {
		super();
		this.espetaculo = espetaculo;
		this.local = local;
		this.cadeira = cadeira;
		this.usuario = usuario;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Metodos Gets e Sets
	public String getEspetaculo() {
		return espetaculo;
	}

	public void setEspetaculo(String espetaculo) {
		this.espetaculo = espetaculo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCadeira() {
		return cadeira;
	}

	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	// Metodo Especifico
	public void visualizar() {
		System.out.println("\nEspetáculo: " + espetaculo);
		System.out.println("Local: " + local);
		System.out.println("Cadeira: " + cadeira);
		System.out.println("Nome: " + usuario);
		System.out.println("Data: " + dia + " de " + mes + " de " + ano);
		
	}
	

}
