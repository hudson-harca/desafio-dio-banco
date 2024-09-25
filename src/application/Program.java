package application;

import java.util.Locale;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;
import model.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Cliente pedro = new Cliente("Pedro", 11111111111l);
		Cliente lucas = new Cliente("Lucas", 22222222222l);
		Cliente marcos = new Cliente("Marcos", 33333333333l);
		Cliente joao = new Cliente("João", 44444444444l);
		Cliente paulo = new Cliente("Paulo", 55555555555l);
		
        Conta cc1 = new ContaCorrente(pedro);
        Conta cp1 = new ContaPoupanca(pedro);
        Conta cc2 = new ContaCorrente(lucas);
        Conta cp2 = new ContaPoupanca(lucas);
        Conta cc3 = new ContaCorrente(marcos);
        Conta cp3 = new ContaPoupanca(joao);
        Conta ce1 = new ContaEspecial(paulo);
        
        Banco banco = new Banco();
        
        System.out.println("Existem " + banco.contarContas() + " Contas abertas neste Banco");
        
        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);
        banco.adicionarConta(cc2);
        banco.adicionarConta(cp2);
        banco.adicionarConta(cc3);
        banco.adicionarConta(cp3);
        banco.adicionarConta(ce1);
        
        cc1.depositar(200.0);
        cc1.transferir(90.0, cp1);
        
        cc2.depositar(300.0);
        cc2.transferir(70.0, cp2);
        cc2.transferir(50.0, cc3);
        cc2.transferir(80.0, cp3);
        
        cc3.sacar(10.0);
        ce1.sacar(1000.0);
        
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
        cc2.imprimirExtrato();
        cp2.imprimirExtrato();
        cc3.imprimirExtrato();
        cp3.imprimirExtrato();
        ce1.imprimirExtrato();
        
        System.out.println("Existem " + banco.contarContas() + " Contas abertas neste Banco");
        
        banco.exibirContas();
        
        banco.removerConta(cp2);
        
        System.out.println("Existem " + banco.contarContas() + " Contas abertas neste Banco");
        
        banco.exibirContas();
        
        banco.removerContaPorAgNumero(1, 1);
        
        System.out.println("Existem " + banco.contarContas() + " Contas abertas neste Banco");
        
        banco.exibirContas();
        
        banco.removerConta(ce1);
        
        System.out.println("Existem " + banco.contarContas() + " Contas abertas neste Banco");
        
        banco.exibirContas();

	}

}

/*
 * Incluir novas classes, atributos e ou métodos;
 * incluir Lombok
 */

