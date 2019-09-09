
package conta;


public class ContaPoupanca extends Conta {
    private  double porcetagemJurosMensal;
     public ContaPoupanca(String conta,String agencia,double pc){
    super(conta,agencia);
    this.porcetagemJurosMensal = pc;
    }

    /**
     * @return the porcetagemJurosMensal
     */
    public double getPorcetagemJurosMensal() {
        return porcetagemJurosMensal;
    }

    /**
     * @param porcetagemJurosMensal the porcetagemJurosMensal to set
     */
    public void setPorcetagemJurosMensal(double porcetagemJurosMensal) {
        this.porcetagemJurosMensal = porcetagemJurosMensal;
    }
}
