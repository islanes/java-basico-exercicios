package aula43labs.exer02;

/**
 *
 * @author Islane dos S. Silva
 */
public class pessoaFisica extends Contribuinte {

    private String cpf;

    public pessoaFisica(String cpf) {
        this.cpf = cpf;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //implementando o metodo abstrato
    @Override
    public double calcularImposto() {

        double renda = getRendaBruta();

        if (renda <= 1400) {
            return 0;
        }
        if (renda > 1400 && renda <= 2100) {
            return (renda * 0.1) - 100;
        }

        if (renda > 2100 && renda <= 2800) {
            return (renda * 0.15) - 270;
        }
        if (renda > 2800 && renda <= 3600) {
            return (renda * 0.25) - 500;
        }
        //if (renda >3600) {
        return (renda * 0.30) - 700;

    }

    @Override
    public String toString() {

        String s = "-- Pessoa Fisica --";
        s += super.toString();
        s += " - CPF: " + this.getCpf();
        s += " - Imposto a ser pago: " + calcularImposto();
        s+= "\n-----------------------";
        return s;
    }

}
