package Usuario;

public class aluno extends usuario {

	private String curso;
	private String turno;
	private String situaçao;
	private String observaçao;

	public aluno() {
		super();
	}

	public aluno(String curso, String turno, String situaçao, String observaçao) {
		super();
		this.curso = curso;
		this.turno = turno;
		this.situaçao = situaçao;
		this.observaçao = observaçao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getSituaçao() {
		return situaçao;
	}

	public void setSituaçao(String situaçao) {
		this.situaçao = situaçao;
	}

	public String getObservçao() {
		return observaçao;
	}

	public void setObservçao(String observçao) {
		this.observaçao = observçao;
	}

	public void InformaDados() {
		super.InformaDados();

		System.out.print(
				" | Curso: " + curso + "  | Turno: " + turno + " | Situação: " + situaçao + " | observação: " + observaçao);
	}
}
