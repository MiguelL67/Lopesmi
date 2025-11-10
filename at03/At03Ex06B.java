package Lopesmi.at03;

import java.util.Random;

public class At03Ex06B {
public static void main(String[] args)
{
    int iNb = 0, iNb2 = 0;
    int[] Tableau = new int[10];

    for(int i = 0 ; i < 10; i++)
    {
        Random random = new Random();
        int iNombre = random.nextInt(201) - 100;
        Tableau[i] = iNombre;
        System.out.print(Tableau[i]+" ");
        if (iNombre > 0) 
        {
            iNb = iNombre;
            iNb += iNb;
        }
        else 
        {
            iNb2 = iNombre;
            iNb2 += iNb2;
        }
    }
    System.out.println("");

    System.out.println("Le total des nombre positif est "+ iNb);
    System.out.println("Le total des nombre négatif est "+ iNb2);

}
}
