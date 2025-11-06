package Lopesmi.at03;

import java.util.Scanner;

public class At03Ex02 {
public static void main(String[] args)
{
    int[] tableau = new int[10];
    Scanner Nombre = new Scanner(System.in);

    System.out.println("Veuiller entrer le premier mot :");
    tableau[0] = Nombre.nextInt();

    System.out.println("Veuiller entrer le deuxième mot :");
     tableau[1] = Nombre.nextInt();

    System.out.println("Veuiller entrer le troisième mot :");
     tableau[2] = Nombre.nextInt();

    System.out.println("Veuiller entrer le quatrième mot :");
     tableau[3] = Nombre.nextInt();

    System.out.println("Veuiller entrer le cinquième mot :");
     tableau[4] = Nombre.nextInt();

    System.out.println("Veuiller entrer le sixième mot :");
     tableau[5] = Nombre.nextInt();

    System.out.println("Veuiller entrer le septième mot :");
     tableau[6] = Nombre.nextInt();
    
    System.out.println("Veuiller entrer le huitième mot :");
     tableau[7] = Nombre.nextInt();

    System.out.println("Veuiller entrer le neufième mot :");
     tableau[8] = Nombre.nextInt();

    System.out.println("Veuiller entrer le dernier mot :");
     tableau[9] = Nombre.nextInt();

    for (int i=0; i <tableau.length; i++)
    {
        System.out.print(" "+tableau[i]);
    }
}
}
