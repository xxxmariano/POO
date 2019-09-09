
package conta;


public class Conta {
   private String numeroConta;
   private String numeroAgencia;
   private String senhaConta;
   private String situacao;
   private double saldo;
   
   public Conta (String numeroConta, String numeroAgencia){
   this.numeroConta = numeroConta;
   this.numeroAgencia = numeroAgencia;
   }
   public void deposito(Conta c1, double saldo){
   if(saldo > 0){
       c1.setSaldo(c1.getSaldo() + saldo);
       System.out.println("Deposito" + "realizado com sucesso");
       System.out.println("Novo saldo"+c1.saldo);
}}

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return the numeroAgencia
     */
    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    /**
     * @param numeroAgencia the numeroAgencia to set
     */
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    /**
     * @return the senhaConta
     */
    public String getSenhaConta() {
        return senhaConta;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
