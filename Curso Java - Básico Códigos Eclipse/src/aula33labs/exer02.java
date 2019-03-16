
package aula33labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer02 {
    public static void main(String[] args) {
       contaCorrente conta = new contaCorrente("123", "8930", -50, 900,true,0);

      

        System.out.println("Conta Bancaria\nNúmero: " + conta.getNumero() + "\nAgencia: " + conta.getAgencia() + "\nConta Especial: " + conta.isEspecial()
                + "\nLimite da Conta Especial: " + conta.getLimiteEspecial() + "\nSaldo: " + conta.getSaldo()
        );

        boolean saqueEfetuado = conta.realizarSaque(0);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
           conta.consultaSaldo();
            
        }else{
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente.");
            conta.consultaSaldo();
        }
        
        
        conta.depositar(120);
        if(conta.usaChequeEspecial()){
            System.out.println("Usa cheque especial.");
        }else{
            System.out.println("Não usa cheque especial.");
        }
        
        conta.realizarSaque(290);
        conta.consultaSaldo();
        
    }
        
        
    

}
