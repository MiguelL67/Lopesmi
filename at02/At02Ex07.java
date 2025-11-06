package Lopesmi.at02;

import java.util.Scanner;
import java.util.Set;

public class At02Ex07 {
public static void main(String[] args)
{
    int iVoy = 0, iCon = 0;
    String sTxt;
    Scanner txt = new Scanner(System.in);
    System.out.println("Entrer un text :");
    sTxt = txt.nextLine();

    Set<Character> voyelles = Set.of('a','e','i','o','u','y');

    for(char c : sTxt.toLowerCase().toCharArray())
    {
        if (voyelles.contains(c))
        {
            iVoy++;
        }
        else
        {
         iCon++;                 
        }
    }

    System.out.println("Il y a "+ iVoy +" de voyelle et "+ iCon +" consonnes dans le texte");
    
}
}
