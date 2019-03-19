
package aula43labs.exer01;

/**
 *
 * @author Islane dos S. Silva
 */
public class contaEspecial extends Conta {

    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    
    @Override
    public String toString() {
        return "----------------\nConta Especial: " + "\nLimite = " + limite
                + "\n" + super.toString() + "\n----------------";
    }
    
    public boolean sacar(double valor){
        
        double saldoComLimite = this.getSaldo()+limite;
        if((saldoComLimite - valor) >=0){

            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        return false;
    }
}
