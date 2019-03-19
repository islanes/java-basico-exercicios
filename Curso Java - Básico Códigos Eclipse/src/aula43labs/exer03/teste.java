
package aula43labs.exer03;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {
       
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);
        
        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarao");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        
        Mamifero urso = new Mamifero();
        urso.setNome("Urso do Canada");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
        
        Animal [] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;
      
        System.out.println("Zoo\n-----------------------------");
        
        for (Animal animal : animais) {
            
            System.out.println(animal.toString()+"\n------------------");
            
        }
        
        
        
        
        
        
    }
}
