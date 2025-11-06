package Lopesmi.at01;

import java.util.Scanner;

public class At01Ex06 {
    public static void main(String[] args)
    {
        int iPlancher, iLong, iLarg, iAire, iPrix;
        String sNom;
        /*Scanner chiffre = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier chiffre :");
        iNb1 = chiffre.nextInt();

        System.out.println("Veuillez saisir le deuxième chiffre :");
        iNb2 = chiffre.nextInt();*/
        
        Scanner nom = new Scanner(System.in);
        System.out.println("Veuiller saisir le nom du client :");
        sNom = nom.nextLine();

        Scanner taille = new Scanner(System.in);
        System.out.println("Veuiller entrer la longueur :");
        iLong = taille.nextInt();
        System.out.println("Veuiller entrer la largeur");
        iLarg = taille.nextInt();
        iAire = iLarg * iLong;

        Scanner plancher = new Scanner(System.in);
        System.out.println("Entrer le type de plancher 1,2 ou 3 :");
        iPlancher = plancher.nextInt();

        if (iPlancher > 3) 
        {
            System.out.println("Vous n’avez pas choisit le bon type de plancher.");  
            System.exit(0);
        }
        
        switch (iPlancher) 
        {
            case 1:
                iPrix = iAire * 5;
            break;
        
            case 2:
                iPrix = iAire * 12;
            break;

            default:
                iPrix = iAire * 10;            
            break;
        }
        System.out.println("Bonjour " + sNom + " L'aire de votre plancher est de "+ iAire +" et le prix va être de "+ iPrix +"$");

        

        /*if (iNb1 > iNb2) 
        {
            System.out.println("Le chiffre le plus grand est " + iNb1);
        }
        else
        {
            System.out.println("Le chiffre le plus grand est " + iNb2);
        } */    
    }
}
