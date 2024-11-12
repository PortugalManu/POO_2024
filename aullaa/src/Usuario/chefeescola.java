package Usuario;

public class chefeescola extends professor {

	private String escola;
	private String observaçao;

	public chefeescola(String area, String turno) {
		super(area, turno);
	}

	public chefeescola(String area, String turno, String escola, String observaçao) {
		super(area, turno);
		this.escola = escola;
		this.observaçao = observaçao;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getObservaçao() {
		return observaçao;
	}

	public void setObservaçao(String observaçao) {
		this.observaçao = observaçao;
	}

	public void InformaDados() {
		super.InformaDados();

		System.out.print(" | Escola: " + escola + " | Observação: " + observaçao);
	}

}
