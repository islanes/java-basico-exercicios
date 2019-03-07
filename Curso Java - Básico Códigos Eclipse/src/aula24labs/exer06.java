
package aula24labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer06 {

    public static void main(String[] args) {
        Contato c1 = new Contato();
        c1.nome = "Maria Fernanda";
        c1.email = "mariaf@gmail.com";
        c1.endereco = "São Paulo Capital";
        
        c1.telefones = new String[2];
        c1.telefones [0] = "90838492";
        
        c1.redesSociais = new String [2];
        c1.redesSociais[0] = "Linkedin";
        c1.redesSociais[1] = "Facebook";
        //c1.redesSociais[2] = "Instagram";
        
        System.out.println("Nome Contato: "+c1.nome+"\nEmail: "+c1.email+"\nTelefone: "+c1.telefones[0]+
                "\nEndereço: "+c1.endereco);
        System.out.println("Redes Sociais:");
        
        for (int i = 0; i < c1.redesSociais.length; i++) {
            
            System.out.println(""+c1.redesSociais[i]);
        }
        
        
                
    }
}
