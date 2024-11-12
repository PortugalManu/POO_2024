package Usuario;

public class professor extends usuario {

	private String area;
	private String turno;
	private String observaçao;

	public professor(String area, String turno) {
		super();
		this.area = area;
		this.turno = turno;
	}

	public professor(String area, String turno, String observaçao) {
		super();
		this.area = area;
		this.turno = turno;
		this.observaçao = observaçao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getObservaçao() {
		return observaçao;
	}

	public void setObservaçao(String observaçao) {
		this.observaçao = observaçao;
	}

	public void InformaDados() {
		super.InformaDados();

		System.out.print(" | Area: " + area + " | Turno: " + turno + " | Observação: " + observaçao);
	}

}
