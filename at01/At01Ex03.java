package Lopesmi.at01;

import java.util.Scanner;

public class At01Ex03 {
  public static void main(String[] args) 
   {
        int iNb1, iNb2, moyenne;
        Scanner chiffre = new Scanner(System.in);
        System.out.println("Veuillez saisir l'age de la première personne :");
        iNb1 = chiffre.nextInt();

        System.out.println("Veuillez saisir l'age de la deuxième personne :");
        iNb2 = chiffre.nextInt();
      
        moyenne = (iNb1 + iNb2) / 2;
        System.out.println("La moyenne d'age est " + moyenne);

        if (iNb1 > iNb2) 
        {
            System.out.println("La personne la plus vieille est a l'age de " + iNb1);
        }
        else
        {
            System.out.println("La personne la plus vieille est a l'age de " + iNb2);
        }
    }
}
