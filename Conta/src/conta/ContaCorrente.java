
package conta;

public class ContaCorrente extends Conta {
    
    private double porcentagemImpostoMensal;
    public ContaCorrente(String numero,String agencia,double pc){
    super(numero,agencia);
    this.porcentagemImpostoMensal = pc;
    }

    public double getPorcentagemImpostoMensal() {
        return porcentagemImpostoMensal;
    }

    public void setPorcentagemImpostoMensal(double porcentagemImpostoMensal) {
        this.porcentagemImpostoMensal = porcentagemImpostoMensal;
    }
}
