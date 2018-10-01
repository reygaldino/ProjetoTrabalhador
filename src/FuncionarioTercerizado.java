public class FuncionarioTercerizado extends Funcionario {
	
	private double adcional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, int horas, double valor, double adcional) {
		super(nome, horas, valor);
		this.adcional = adcional;
	}

	public double getAdcional() {
		return adcional;
	}

	public void setAdcional(double adcional) {
		this.adcional = adcional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + adcional *1.1;
	}
}
