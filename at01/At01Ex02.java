package Lopesmi.at01;

import java.util.Scanner;

public class At01Ex02 {
    public static void main(String[] args)
    {
        int iNb1, iNb2;
        Scanner Salaire = new Scanner(System.in);
        System.out.println("Veuiller entrer votre salaire horaire :");
        iNb1 = Salaire.nextInt();

        Scanner Heures = new Scanner(System.in);
        System.out.println("Veuiller entrer le nombre d'heure par semaine :");
        iNb2 = Heures.nextInt();

        iNb1 *= 2;
        iNb1 *= iNb2;
        System.out.println("La paye va être de " + iNb1);
    }   
}
