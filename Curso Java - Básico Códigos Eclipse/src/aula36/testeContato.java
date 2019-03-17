package aula36;

/**
 *
 * @author Islane dos S. Silva
 */
public class testeContato {

    public static void main(String[] args) {

        //exemplo de relacionamento entre classes
        Contato c = new Contato();

        c.setNome("Islane");

        //criando o obj endereco
        Endereco end = new Endereco();
        end.setNomeRua("Florida");
        end.setNumero("NA");
        end.setCidade("Sao Paulo");
        end.setEstado("SP");
        end.setCep("0893-49");
        c.setEndereco(end);

        //o objeto telefones
        Telefone t = new Telefone();
        t.setDdd("(11)");
        t.setNumero("0909-0909");
        t.setTipo("Celular");

        Telefone t2 = new Telefone();
        t2.setDdd("(11)");
        t2.setNumero("5949-2317");
        t2.setTipo("Casa");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = t;
        telefones[1] = t2;
        c.setTelefones(telefones);

        System.out.println("Nome: " + c.getNome());

        //evitando possiveis erros 
        if (c != null && c.getEndereco() != null) {
            System.out.println("Cidade: " + c.getEndereco().getCidade());
        }

        //get dos telefone
        if (c != null && c.getTelefones() != null) {
            for (Telefone tel : c.getTelefones()) {
                System.out.println("Telefone: " + tel.getDdd() + " " + tel.getNumero());
            }

        }
    }
}
