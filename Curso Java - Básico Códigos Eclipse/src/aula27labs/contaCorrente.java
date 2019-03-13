package aula27labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class contaCorrente {

    String numero;
    String agencia;
    double saldo;
    double limiteEspecial;
    boolean especial;
    double valorEspecialUsado;
    

   //metodo realizar saque
    boolean realizarSaque(double qtdSacar){
        if(saldo>=qtdSacar){
            saldo = saldo - qtdSacar;
            return true;
        }else {
            if(especial){
                //verificando se a conta especial tem saldo
                double limite = valorEspecialUsado + saldo;
                if(limite > qtdSacar){
                    saldo-=qtdSacar;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }
    
    void depositar(double deposito){
        saldo = saldo + deposito;
        System.out.println("Deposito realizado. Saldo atual "+saldo);
    }
    
    void consultaSaldo(){
        System.out.println("Saldo atual é R$"+saldo);
    }
    
    boolean usaChequeEspecial(){
        return saldo<0;
    }
}
