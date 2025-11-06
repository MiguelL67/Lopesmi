package Lopesmi.at02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class At02Ex08 {
public static void main(String[]args)
{
      String sMot;
        Scanner lectureMot = new Scanner(System.in);
        List<String> mots = new ArrayList<>();


        System.out.println("Entrer des mots de votre choix, puis écrire 'stop' si vous souhaitez arrêter : ");

        do{
            System.out.print("# ");
            sMot = lectureMot.nextLine();

            if (!sMot.equalsIgnoreCase("stop")) {
                mots.add(sMot);
            }

        }while(!sMot.equalsIgnoreCase("stop"));

        Collections.sort(mots, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Voici la liste des mots en ordre alphabétique : " + mots);

        lectureMot.close();
    }
}


