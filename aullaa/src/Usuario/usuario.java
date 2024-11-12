package Usuario;

public class usuario {

	private int matricula;
	private String nome;
	private String endereço;
	private String cel;
	private String observação;
	
	

	public usuario() {
		super();
	}
		

	public usuario(int matricula) {
		super();
		this.matricula = matricula;
	}



	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getObservação() {
		return observação;
	}

	public void setObservação(String observação) {
		this.observação = observação;
	}

	public void InformaDados() {
		System.out.println(" | Matricula: " + matricula + " | Nome: " + nome + " | Endereço: " + endereço + " | Celular: " + cel + " | Observação: " + observação);
	}

}
