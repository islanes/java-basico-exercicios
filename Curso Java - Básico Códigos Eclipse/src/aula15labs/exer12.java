package aula15labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer12 {

    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        double pIR = 0;
        double impostoRenda;
        //calculo do salario
        System.out.println("Salario por Mês\nDigite quanto você ganha por hora"
                + " e quantas horas voce trabalhou no mês: ");
        double porHora = scan.nextDouble();
        int diasTrabalhado = scan.nextInt();
        double salario = porHora * diasTrabalhado;
        System.out.println("Seu salario Bruto R$" + (salario));

        if (salario <= 900) {
            pIR = 0;
        } else if (salario > 900 && salario <= 1500) {
            pIR = 5;
        } else if (salario > 1500 && salario <= 2500) {
            pIR = 10;
        } else if (salario > 2500) {
            pIR = 20;
        }

        //imposto de renda 
        impostoRenda = (salario / 100) * pIR;

        //quanto pagou INSS 10%
        double inss = (salario / 100) * 10;
        //fgts
        double fgts = (salario / 100) * 11;
        //pagou sindicato 5%
        //double sindicato = (salario/100) * 5;
        double totalDescontos = impostoRenda + inss;

        //salario liquido 
        double salarioLiquido = salario - totalDescontos;

        System.out.println("Salario Bruto (" + porHora + " * " + diasTrabalhado + ") :  R$" + salario + ""
                + "\n() IR " + pIR + " % " + impostoRenda
                + "\nINSS 10% R$" + inss
                + "\nFGTS 11% R$" + fgts
                + "\nTotal de descontos R$" + totalDescontos
                + "\nSalario Liquido R$" + salarioLiquido);

    }
}
