package Lopesmi.at02;

import java.util.Scanner;

public class At02Ex02 {
public static void main(String[] args)
{
    String sTxt;
    int iLong;

    Scanner text = new Scanner(System.in);
    System.out.println("Veuiller écrire :");
    sTxt = text.nextLine();

    iLong = sTxt.length();

    System.out.println(iLong);
    
}
}
