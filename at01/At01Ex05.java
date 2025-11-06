package Lopesmi.at01;

import java.util.Scanner;

public class At01Ex05 {
    public static void main(String[] args) 
    {
        double dPrix;
        
        Scanner prix = new Scanner(System.in);
        System.out.println("Quel est le prix de l'item :");
        dPrix = prix.nextDouble();

        dPrix *= 0.75;
        System.out.println("Le Prix après le rabais est " + dPrix);
        
    }
}
