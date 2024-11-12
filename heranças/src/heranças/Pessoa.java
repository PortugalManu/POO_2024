package heranças;

public class Pessoa {

	private String codigo;
	private String nome;
	private String endereço;
	private String fone;
	private String cell;

	public Pessoa() {
		super();
	}

	public Pessoa(String codigo) {
		super();
		this.codigo = codigo;
		this.nome = "Não Fornecido";
		this.endereço = "Não Fornecido";
		this.fone = "Não Fornecido";
		this.cell = "Não Fornecido";
	}

	public Pessoa(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereço = "Não Fornecido";
		this.fone = "Não Fornecido";
		this.cell = "Não Fornecido";
	}

	public Pessoa(String codigo, String nome, String endereço) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereço = endereço;
		this.fone = "Não Fornecido";
		this.cell = "Não Fornecido";
	}

	public Pessoa(String codigo, String nome, String endereço, String fone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereço = endereço;
		this.fone = fone;
		this.cell = "Não Fornecido";
	}

	public Pessoa(String codigo, String nome, String endereço, String fone, String cell) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereço = endereço;
		this.fone = fone;
		this.cell = cell;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public void MostraPEssoa() {
		System.out.println(">>>>> Exibindo dados de pessoa <<<");
		System.out.println("-------------------------");

		System.out.println("Codigo : " + this.codigo);
		System.out.println("Nome : " + this.nome);
		System.out.println("Endereço : " + this.endereço);
		System.out.println("fone : " + this.fone);
		System.out.println("Celular : " + this.cell);

		System.out.println("--------------------------");
	}

}
