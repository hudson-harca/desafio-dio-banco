package model;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extreto Conta Corrente ===");
		imprimirInfosComuns();
	}
	
	@Override
	public String toString() {
		return "Conta Corrente {Agência: " + getAgencia() + ", Numero: " + getNumero() + ", Cliente: " + getCliente() + "}";
	}

}
