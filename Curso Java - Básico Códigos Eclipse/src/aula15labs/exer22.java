package aula15labs;

import java.util.Scanner;

/**
 *
 * @author Islane dos S. Silva
 */
public class exer22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Descontos de frutas.");
        System.out.println("Quantidade de kg de morangos:");
        double kgMorango = scan.nextDouble();

        System.out.println("Quantidade de kg de maça:");
        double kgMaca = scan.nextDouble();
        
        double pMorango = 0;
        double pMaca = 0;
        
        if(kgMorango <= 5 ){
            pMorango = 2.50;
        }else{
            pMorango = 2.20;
        }
        
        if(kgMaca <= 5 ){
            pMaca = 1.8;
        }else{
            pMaca = 1.5;
        }
        
        double precoTotalMorango = kgMorango * pMorango;
        double precoTotalMaca = kgMaca * pMaca;
        
        double precoParcial = precoTotalMaca + precoTotalMorango;
        
        System.out.println("Preço Total da Morango R$"+precoTotalMorango+" Preço kg R$"+pMorango);
        System.out.println("Preço Total da Maça R$"+precoTotalMaca+" Preço kg R$"+pMaca);
        //System.out.println("Total Parcial sobre os produtos R$"+precoParcial);
        
        double precoTotal = precoParcial;
        
        if ((kgMorango + kgMaca) >8 || precoParcial > 25){
            System.out.println("Total Parcial sobre os produtos R$"+precoParcial);
            precoTotal = (precoParcial - (precoParcial / 100)*10);
            System.out.println("Você obteve desconto!!");
        }
        
        System.out.println("Total a pagar R$"+precoTotal);
        

    }
}
