package Lopesmi.at02;

import java.util.Scanner;

public class At02Ex03 {
public static void main(String[] args)
{
     String sTxt, sMaj;

    Scanner text = new Scanner(System.in);
    System.out.println("Veuiller écrire :");
    sTxt = text.nextLine();
    sMaj = sTxt.toUpperCase();
    
    sMaj = sMaj.replace("A", "$");
    System.out.println(sMaj);
}
}
