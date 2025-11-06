package Lopesmi.at03;

import java.util.Scanner;

public class At03Ex01 {
public static void main(String[] args)
{
    String sMot;
    String tableau[] = new String[5]; 
    Scanner Mots = new Scanner(System.in);

    System.out.println("Veuiller entrer le premier mot :");
    sMot = Mots.nextLine();
    tableau[0] = sMot;

    System.out.println("Veuiller entrer le deuxième mot :");
    sMot = Mots.nextLine();
    tableau[1] = sMot;

    System.out.println("Veuiller entrer le troisième mot :");
    sMot = Mots.nextLine();
    tableau[2] = sMot;

    System.out.println("Veuiller entrer le quatrième mot :");
    sMot = Mots.nextLine();
    tableau[3] = sMot;

    System.out.println("Veuiller entrer le dernier mot :");
    sMot = Mots.nextLine();
    tableau[4] = sMot;

    for (int i=0; i <tableau.length; i++)
    {
        System.out.print(" "+tableau[i]);
    }
}
}
