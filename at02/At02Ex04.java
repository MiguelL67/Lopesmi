package Lopesmi.at02;

import java.util.Scanner;

public class At02Ex04 {
public static void main(String[] args)
{
     int iTxt;

    Scanner text = new Scanner(System.in);
    System.out.println("Veuiller écrire un nombre entre 0 et 100:");
    iTxt = text.nextInt();

    do
    {
        System.out.println("Erreur le nombre n'est pas entre 0 et 100 veuiller ressayer :");  
        iTxt = text.nextInt();    
    } while (iTxt > 100 || iTxt < 0);
    
}
}
