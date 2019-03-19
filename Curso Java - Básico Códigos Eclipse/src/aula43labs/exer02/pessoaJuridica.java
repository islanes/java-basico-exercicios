package aula43labs.exer02;

/**
 *
 * @author Islane dos S. Silva
 */
public class pessoaJuridica extends Contribuinte {

    private String cnpj;

    public pessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {

        return this.getRendaBruta() * 0.10;

    }

    @Override
    public String toString() {

        String s = "-- Pessoa Juridica --";
        s += super.toString();
        s += " - CNPJ: " + this.getCnpj();
        s += " - Imposto a ser pago: " + calcularImposto();
        s+= "\n-----------------------";
        return s;
    }

}
