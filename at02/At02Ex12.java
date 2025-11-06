package Lopesmi.at02;

import java.util.Scanner;

public class At02Ex12 
{
    public static void main(String[] args)
    {
        int iNb1, iNb2,iSomme;
        Scanner Nombre = new Scanner(System.in); 
        System.out.println("Entrer le nombre minimum :");
        iNb1 = Nombre.nextInt();

        System.out.println("Entrer le nombre maximum :");
        iNb2 = Nombre.nextInt();

        do 
        {
            System.out.println("Veuiller entrer un nombre minimum plus petit que le maximum :");
            iNb1 = Nombre.nextInt();     
        }while (iNb1 >= iNb2);

        iSomme = sommeMinMax(iNb1, iNb2);
        System.out.println(iSomme);
    }
    public static int sommeMinMax(int iNb1,int iNb2)
    {
        int iResult = 0;
        for(int i = iNb1; i <= iNb2; i++)
        {
            iResult += i;
        }
        return iResult;
    }
}
