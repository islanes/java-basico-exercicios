package aula33labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipo;
    private boolean tipoAbajur;
    private boolean ligada;

    //construtor vazio 
    public Lampada() {
    }

    //construtor com parametros
    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, String[] tipo, boolean tipoAbajur, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipo = tipo;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    //metodos     
    public void ligarLampada() {

        setLigada(true);
    }

    public void desligarLampada() {

        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("A lampada esta ligada");
        } else {

            System.out.println("A lampada esta desligada");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligarLampada();
        } else {

            ligarLampada();
        }
    }

    //getters e setters de todos os atributos
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tensao
     */
    public String getTensao() {
        return tensao;
    }

    /**
     * @param tensao the tensao to set
     */
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the tipoLuz
     */
    public String getTipoLuz() {
        return tipoLuz;
    }

    /**
     * @param tipoLuz the tipoLuz to set
     */
    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    /**
     * @return the garantiaMeses
     */
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    /**
     * @param garantiaMeses the garantiaMeses to set
     */
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    /**
     * @return the tipo
     */
    public String[] getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tipoAbajur
     */
    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    /**
     * @param tipoAbajur the tipoAbajur to set
     */
    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    /**
     * @return the ligada
     */
    public boolean isLigada() {
        return ligada;
    }

    /**
     * @param ligada the ligada to set
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
