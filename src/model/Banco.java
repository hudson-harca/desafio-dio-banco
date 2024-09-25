package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		contas.add((conta));
	}
	
	public void removerConta(Conta conta) {
		Conta contaParaRemover = null;
		double saldoResidual = 0.0;
		if(!contas.isEmpty()) {
			for (Conta c : contas) {
				if (c == conta) {
					contaParaRemover = c;
					break;
				}
			}
			if (contaParaRemover.getSaldo() > 0) {
				saldoResidual = contaParaRemover.getSaldo();
				contaParaRemover.sacar(saldoResidual);
				contas.remove(contaParaRemover);
				System.out.println("Saque realizado no valor de R$ " + saldoResidual + " para remover a Conta");
				System.out.println(contaParaRemover + " removida como sucesso.");
			} else if (contaParaRemover.getSaldo() < 0) {
				saldoResidual = Math.abs(contaParaRemover.getSaldo());
				contaParaRemover.depositar(saldoResidual);
				contas.remove(contaParaRemover);
				System.out.println("Depósito realizado no valor de R$ " + saldoResidual + " para remover a Conta.");
				System.out.println(contaParaRemover + " removida como sucesso.");
			} else {
				contas.remove(contaParaRemover);
			}
		} else {
			System.out.println("Não existe Contas cadastradas.");
		}
		
	}
	
	public void removerContaPorAgNumero(int agencia, int numero) {
		Conta contaParaRemover = null;
		double saldoResidual = 0.0;
		if(!contas.isEmpty()) {
			for (Conta c : contas) {
				if (c.getAgencia() == agencia && c.getNumero() == numero) {
						contaParaRemover = c;
						break;
					} else {
						throw new NullPointerException("Conta inexistente.");
					}
			}
			if (contaParaRemover.getSaldo() > 0) {
				saldoResidual = contaParaRemover.getSaldo();
				contaParaRemover.sacar(saldoResidual);
				contas.remove(contaParaRemover);
				System.out.println("Saque realizado no valor de R$ " + saldoResidual + " para remover a Conta");
				System.out.println(contaParaRemover + " removida como sucesso.");
			} else if (contaParaRemover.getSaldo() < 0) {
				saldoResidual = Math.abs(contaParaRemover.getSaldo());
				contaParaRemover.depositar(saldoResidual);
				contas.remove(contaParaRemover);
				System.out.println("Depósito realizado no valor de R$ " + saldoResidual + " para remover a Conta.");
				System.out.println(contaParaRemover + " removida como sucesso.");
			} else {
				contas.remove(contaParaRemover);
				System.out.println(contaParaRemover + " removida como sucesso.");
			}
		} else {
			System.out.println("Não existe Contas cadastradas.");
		}
		
	}
	
	public void exibirContas() {
		if ( !contas.isEmpty()) {
			System.out.println(contas);
		} else {
			System.out.println("Não existe Contas cadastradas.");
		}
	}
	
	public int contarContas() {
		return contas.size();
	}


}
