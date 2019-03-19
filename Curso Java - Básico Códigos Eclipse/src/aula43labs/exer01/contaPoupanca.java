package aula43labs.exer01;

import java.util.Calendar;

/**
 *
 * @author Islane dos S. Silva
 */
public class contaPoupanca extends Conta {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "----------------\nConta Poupança: " + "\ndia Rendimento = " + diaRendimento
                + "\n" + super.toString() + "\n----------------";
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo * taxaRendimento;

            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}
