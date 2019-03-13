package aula27labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class eXer02 {

    public static void main(String[] args) {
        //eXemplo conta corrente 
        contaCorrente conta = new contaCorrente();

        conta.numero = "123";
        conta.saldo = -50;
        conta.especial = true;
        conta.agencia = "8930";
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;

        System.out.println("Conta Bancaria\nNúmero: " + conta.numero + "\nAgencia: " + conta.agencia + "\nConta Especial: " + conta.especial
                + "\nLimite da Conta Especial: " + conta.limiteEspecial + "\nSaldo: " + conta.saldo
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
