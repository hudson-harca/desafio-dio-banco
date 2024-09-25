package model;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extreto Conta Poupança ===");
		imprimirInfosComuns();
	}
	
	@Override
	public String toString() {
		return "Conta Poupança {Agência: " + getAgencia() + ", Numero: " + getNumero() + ", Cliente: " + getCliente() + "}";
	}

}
