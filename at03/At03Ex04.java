package Lopesmi.at03;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class At03Ex04 {
public static void main(String[] args)
{
    int[] Tableau = new int[5];
    List<Integer> randomNumbers = new ArrayList<Integer>();

    for(int i = 0; i < 5; i++)
    {
        Random random = new Random();
        int iNombre = random.nextInt(100);
        randomNumbers.add(iNombre);
    }

        System.out.println(randomNumbers);
        int min = Collections.min(randomNumbers);
        int positionMin = randomNumbers.indexOf(min);
        int max = Collections.max(randomNumbers);
        int psitionMax = randomNumbers.indexOf(max);

        System.out.println("Le chiffre le plus petit est "+ min +" et sa position est "+ positionMin);
        System.out.println("Le chiffre le plus grand est "+ max +" et sa position est "+ psitionMax);
}
}
