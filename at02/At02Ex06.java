package Lopesmi.at02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class At02Ex06 {
public static void main(String[] args)
{
   ArrayList<Integer> Nombre = new ArrayList<Integer>();
   int iValeur, iAvg, iNbv = 0, iTot = 0;

   Scanner val = new Scanner(System.in);
   

    do
    {
        System.out.println("Entrer un nombre");
        iValeur = val.nextInt();
        Nombre.add(iValeur);
        iNbv++;

    } while (iValeur != 0);

    iNbv--;
    Nombre.remove(Nombre.getLast());

    Collections.sort(Nombre);

    System.out.println("Le nombre le plus petit est "+Nombre.getFirst());
    System.out.println("Le nombre le plus grand est "+Nombre.getLast());

    for(int i : Nombre)
    {
        iTot += i;
    }

    iAvg = iTot / iNbv;

    System.out.println("La moyenne est "+ iAvg);

}
}
