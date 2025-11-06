package Lopesmi.at02;

import java.util.Scanner;

public class At02Ex11 {
public static void main(String[] args)
{
    int iNb1, iFactorielle;
    Scanner Nombre = new Scanner(System.in);
    System.out.println("Veuiller entrer un nombre :");
    iNb1 = Nombre.nextInt();
    iFactorielle = factorielle(iNb1);

    System.out.println("Le factiorielle est "+ iFactorielle);


}
public static int factorielle(int iNb1)
{
    int iResult = 1;
    for (int i = 1;i <= iNb1; i++ )
    {
        iResult *=i;
    }
    return iResult;
}
}
