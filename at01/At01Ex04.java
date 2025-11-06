package Lopesmi.at01;

import java.util.Scanner;

public class At01Ex04 {
    public static void main(String[] args)
    {
        int iNb1;

        Scanner Note = new Scanner(System.in);
        System.out.println("Quel est votre note :");
        iNb1 = Note.nextInt();

        if (iNb1 >= 60)
        {
            System.out.println("Bravo tu a passer ton cours de math!!!");
        }
        else
        {
            System.out.println("Meilleur chance la prochaine fois");
        }
    }
}
