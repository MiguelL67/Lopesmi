package Lopesmi.at02;

import java.util.Scanner;

public class At02Ex10 
{
    public static void main(String[] args)
    {
        int iNb1, iNb2, iBig;
        Scanner nombre = new Scanner(System.in);
        System.out.println("Veuiller ecrire le premier chiffre :");

        iNb1 = nombre.nextInt();

        System.out.println("Veuiller ecrire le deuxieme chiffre :");

        iNb2 = nombre.nextInt();

        iBig = plusGrand(iNb1, iNb2);

        System.out.println("Le chiffre le plus grand est "+ iBig);
    }
    public static int plusGrand(int iNb1, int iNb2)
    {
        int iResult;
        if (iNb1 < iNb2) 
        {
            iResult = iNb2;
        }
        else if (iNb1 > iNb2) 
        {
            iResult = iNb1;
        }
        else
        {
            return iNb1;
        }
        return iResult;
    }
}
