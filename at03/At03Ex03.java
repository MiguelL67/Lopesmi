package Lopesmi.at03;

import java.util.Scanner;

public class At03Ex03 {
public static void main(String[] args)
{
    int[] Tableau1 = new int[7];
    int[] Tableau2 = new int[7];
    Scanner Nombres = new Scanner(System.in);

    System.out.println("Entrer le premier nombre :");
    Tableau1[0] = Nombres.nextInt();

    System.out.println("Veuiller entrer le deuxième mot :");
     Tableau1[1] = Nombres.nextInt();

    System.out.println("Veuiller entrer le troisième mot :");
     Tableau1[2] = Nombres.nextInt();

    System.out.println("Veuiller entrer le quatrième mot :");
     Tableau1[3] = Nombres.nextInt();

    System.out.println("Veuiller entrer le cinquième mot :");
     Tableau1[4] = Nombres.nextInt();

    System.out.println("Veuiller entrer le sixième mot :");
     Tableau1[5] = Nombres.nextInt();

    System.out.println("Veuiller entrer le septième mot :");
     Tableau1[6] = Nombres.nextInt();

    for (int i=0; i <Tableau1.length; i++)
    {
        System.out.print(" "+Tableau1[i]);
    }
    for (int x = Tableau1.length; x > 0; x--)
    {

    }
}
}
