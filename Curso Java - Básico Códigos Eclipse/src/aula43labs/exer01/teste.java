package aula43labs.exer01;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {

        System.out.println(" Teste conta bancaria ");

        Conta simples = new Conta();
        simples.setNomeCliente("Conta simples");
        simples.setNumConta("1234-8");
        simples.setSaldo(190.8);

        System.out.println(simples);
        simples.depositar(100);
        realizarSaque(simples, 120);
        realizarSaque(simples, 200);

        contaPoupanca contaP = new contaPoupanca();
        contaP.setNomeCliente("Conta Poupanca");
        contaP.setNumConta("90988-8");
        contaP.setSaldo(190.8);
        contaP.setDiaRendimento(5);

        if (contaP.calcularNovoSaldo(0.02)) {
            System.out.println("Novo rendimento aplicado, saldo atual " + contaP.getSaldo());
        } else {
            System.out.println("Hoje não é o dia de rendimento o seu saldo é " + contaP.getSaldo());
        }

        System.out.println(contaP);
        contaP.depositar(100);
        realizarSaque(contaP, 120);
        realizarSaque(contaP, 200);

        System.out.println(" Teste Conta Especial ");

        contaEspecial contEspecial = new contaEspecial();
        contEspecial.setNomeCliente("Conta Especial");
        contEspecial.setNumConta("9092-2");
        contEspecial.setLimite(290);
        contEspecial.setSaldo(200);

        System.out.println(contEspecial);
        contEspecial.depositar(100);
        realizarSaque(contEspecial, 90);
        realizarSaque(contEspecial, 129);
        realizarSaque(contEspecial, 190);

    }

    public static void realizarSaque(Conta conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso o saldo atual é " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque " + valor + " Saldo atual: " + conta.getSaldo());
        }

    }
}
