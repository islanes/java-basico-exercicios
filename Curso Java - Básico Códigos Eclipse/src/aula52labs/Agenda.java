package aula52labs;

/**
 *
 * @author Islane dos S. Silva
 */
public class Agenda {

    private Contato[] contatos;

    public Agenda() {

        contatos = new Contato[2];
    }

    public void AdicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
            
        }
        if (cheia) {
            throw new AgendaCheiaException();
        }
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        String s = " ";

        for (Contato contato : contatos) {
            if (contato != null) {
                s += contato.toString() + "\n";
            }
        }
        return s;
    }

    public int ConsultaContato(String nome) throws ContatoNaoExiste {

        /*for (Contato contato : contatos) {
        if(contato != null){
        if(contato.getNome().equalsIgnoreCase(nome)){
        return contato;
        }
        }
        
        }*/
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }

        }
        throw new ContatoNaoExiste(nome);
    }

}
