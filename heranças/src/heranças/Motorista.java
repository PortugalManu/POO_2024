package heranças;

public class Motorista extends Pessoa 
{
	private String cnh;
	private String dtvenc;

	public Motorista() 
	{
		super();
	}
	
	
	public Motorista(String cnh) 
	{
		super();
		this.cnh = cnh;
	}


	public Motorista(String cnh, String dtvenc) 
	{
		super();
		this.cnh = cnh;
		this.dtvenc = dtvenc;
	}
	
	

	public String getCnh() 
	{
		return cnh;
	}

	public void setCnh(String cnh)
	{
		this.cnh = cnh;
	}

	public String getDatavenc() 
	{
		return dtvenc;
	}

	public void setDatavenc(String datavenc) 
	{
		this.dtvenc = datavenc;
	}

	public void MostraPEssoa() 
	{
		super.MostraPEssoa();
		
		System.out.println(">>>>> Exibindo dados do motorista <<<");
		System.out.println("-------------------------");

		System.out.println("CNH : " + this.cnh);
		System.out.println("DATA DE VENCIMENTO : " + this.dtvenc);

		System.out.println("--------------------------");
	}

}
