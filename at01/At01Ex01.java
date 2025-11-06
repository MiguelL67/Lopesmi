package Lopesmi.at01;

import java.io.Console;
import java.util.Scanner;

public class At01Ex01 {
    public static void main(String[] args) {
        int iNb1, iNb2;
        Scanner chiffre = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier chiffre :");
        iNb1 = chiffre.nextInt();

        System.out.println("Veuillez saisir le deuxième chiffre :");
        iNb2 = chiffre.nextInt();
      

        if (iNb1 > iNb2) 
        {
            System.out.println("Le chiffre le plus grand est " + iNb1);
        }
        else
        {
            System.out.println("Le chiffre le plus grand est " + iNb2);
        }
    }
}
