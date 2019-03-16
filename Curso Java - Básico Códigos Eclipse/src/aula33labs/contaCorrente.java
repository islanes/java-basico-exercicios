package aula33labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class contaCorrente {

    //modificando a classe colocando os atributos como private
    private String numero;
    private String agencia;
    private double saldo;
    private double limiteEspecial;
    private boolean especial;
    private double valorEspecialUsado;
    
    //criando dois contrutores

    public contaCorrente() {
    }

    public contaCorrente(String numero, String agencia, double saldo, double limiteEspecial, boolean especial, double valorEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.especial = especial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

           
    //encapsulando os campos    
    boolean usaChequeEspecial() {
        return getSaldo() < 0;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
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

    /**
     * @return the limiteEspecial
     */
    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    /**
     * @param limiteEspecial the limiteEspecial to set
     */
    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    /**
     * @return the especial
     */
    public boolean isEspecial() {
        return especial;
    }

    /**
     * @param especial the especial to set
     */
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    /**
     * @return the valorEspecialUsado
     */
    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    /**
     * @param valorEspecialUsado the valorEspecialUsado to set
     */
    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }
    
        
    //metodo realizar saque
    public boolean realizarSaque(double qtdSacar) {
        if (getSaldo() >= qtdSacar) {
            setSaldo(getSaldo() - qtdSacar);
            return true;
        } else {
            if (isEspecial()) {
                //verificando se a conta especial tem saldo
                double limite = getValorEspecialUsado() + getSaldo();
                if (limite > qtdSacar) {
                    setSaldo(getSaldo() - qtdSacar);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public void depositar(double deposito) {
        setSaldo(getSaldo() + deposito);
        System.out.println("Deposito realizado. Saldo atual " + getSaldo());
    }

    public void consultaSaldo() {
        System.out.println("Saldo atual é R$" + getSaldo());
    }


}
