
package aula24labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer05 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        
        conta.numero = "123";
        conta.saldo = 1290.9;
        conta.especial = true;
        conta.agencia = "8930";
        conta.limiteEspecial = 20930;
        
        System.out.println("Conta Bancaria\nNúmero: "+conta.numero+ "\nAgencia: "+conta.agencia+"\nConta Especial: "+conta.especial
        + "\nLimite da Conta Especial: "+conta.limiteEspecial+"\nSaldo: "+conta.saldo
        );
                
    }
}
