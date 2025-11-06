package Lopesmi.at02;

import java.util.Scanner;

public class At02Ex09 {

    public static void main(String[] args)
    {
        int iRayon;
        double dCricon;
        Scanner rayon = new Scanner(System.in);

        System.out.println("Quel est le rayon :");
        iRayon = rayon.nextInt();
        dCricon = circonference(iRayon);
        System.out.println("La circonference est de "+ dCricon);

    }
    public static double circonference(int iRayon)
    {
        return (double) (2* Math.PI) *iRayon;
    }
}
