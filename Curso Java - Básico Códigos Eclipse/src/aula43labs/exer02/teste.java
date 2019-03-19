package aula43labs.exer02;

/**
 *
 * @author Islane dos S. Silva
 */
public class teste {

    public static void main(String[] args) {

        pessoaFisica p1 = new pessoaFisica("7890000-1");
        p1.setNome("Contribuinte 1");
        p1.setRendaBruta(1000);

        pessoaJuridica j1 = new pessoaJuridica("j908783-09");
        j1.setNome("Contribuinte 2");
        j1.setRendaBruta(5900);

        pessoaFisica p2 = new pessoaFisica("9088902-1");
        p2.setNome("Contribuinte 3");
        p2.setRendaBruta(2000);

        pessoaJuridica j2 = new pessoaJuridica("j902313-10");
        j2.setNome("Contribuinte 4");
        j2.setRendaBruta(6900);

        pessoaFisica p3 = new pessoaFisica("9087290-1");
        p3.setNome("Contribuinte 5");
        p3.setRendaBruta(3000);

        pessoaJuridica j3 = new pessoaJuridica("j458783-10");
        j3.setNome("Contribuinte 6");
        j3.setRendaBruta(2900);
        
        //setando os valores dos contribuintes
        Contribuinte [] contibuintes = new Contribuinte[6];
        contibuintes[0] = p1;
        contibuintes[1] = j1;
        contibuintes[2] = p2;
        contibuintes[3] = j2;
        contibuintes[4] = p3;
        contibuintes[5] = j3;
        
        for (Contribuinte contibuinte : contibuintes) {
            System.out.println(contibuinte.toString());
            
        }

        

    }
}
