package Aula005;

public class Automovel {

	
	private String modelo;
	private String cor;
	private String placa;
	private int ano;
	private boolean motor = false;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public void ligaMotor () {
		motor = true;
	}
	public void InformaDados() {
		String motorString;
		if (motor) {
			motorString = "ligado";				
		}
		else {
			motorString = "Desligado";
		}
		System.out.println("Automovel: "+modelo+" | cor: "+cor+" | Placa: "+placa+" | Ano: "+ano+" | Estado do Motor: "+motorString);
		
	}
}
