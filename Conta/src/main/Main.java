
package main;

import conta.ContaCorrente;
import conta.ContaPoupanca;


public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("123-2","123-2",0.9);
        ContaCorrente cr = new  ContaCorrente("123-2","123-2",20.53);
        
        System.out.println("### Conta Poupança");
        System.out.println(cp.getNumeroAgencia());
        System.out.println(cp.getNumeroConta());
        System.out.println(cp.getPorcetagemJurosMensal());
        System.out.println("#conta correte");
        System.out.println(cr.getNumeroAgencia());
        System.out.println(cr.getNumeroConta());
        System.out.println(cr.getPorcentagemImpostoMensal());  
        cr.deposito(cr, 1000);
        
        
        
        
    }
}
