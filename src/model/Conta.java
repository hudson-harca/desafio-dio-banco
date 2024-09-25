package model;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
		} else {
			System.out.println("Valor inválido.");
		}
		
	}

	public void sacar(double valor) {
		if (valor > 0 && getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Saldo insuficiente.");
		}
		
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirExtrato() {
	}
	
	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Agência: %d", agencia));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", getSaldo()));
	}
	
	@Override
	public String toString() {
		return "Conta {Agência: " + agencia + ", Numero: " + numero + ", Cliente: " + cliente + "}";
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
