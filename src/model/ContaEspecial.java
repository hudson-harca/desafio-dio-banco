package model;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	public ContaEspecial(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void sacar(double valor) {
		limite = -10000.0;
		if (valor > 0 && saldo >= limite) {
			saldo -= valor;
		} else {
			System.out.println("Limite atingido.");
		}
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extreto Conta Especial ===");
		imprimirInfosComuns();
	}
	
	@Override
	public String toString() {
		return "Conta Corrente {Agência: " + getAgencia() + ", Numero: " + getNumero() + ", Cliente: " + getCliente() + "}";
	}

}
