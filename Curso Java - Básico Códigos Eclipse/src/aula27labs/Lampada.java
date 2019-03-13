package aula27labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipo;
    boolean tipoAbajur;

    boolean ligada;

    void ligarLampada() {

        ligada = true;
    }
    
    void desligarLampada(){
        
        ligada = false;
    }
    
    void mostrarEstado(){
          if(ligada){
               System.out.println("A lampada esta ligada");
        }else{
        
            System.out.println("A lampada esta desligada");        
        }
    }

}
