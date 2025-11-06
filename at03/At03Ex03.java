package Lopesmi.at03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class At03Ex03 {
public static void main(String[] args)
{
    int iQte;
    Scanner lecture = new Scanner(System.in);
    List<Integer> randomNumbers = new ArrayList<Integer>();

    System.out.println("Combien de nombre voulez-vous");
    iQte = lecture.nextInt();

    for (int index = 0; index < iQte; index++) {
        
        Random random = new Random();
        int iNombre = random.nextInt(100);
        randomNumbers.add(iNombre);
    }

    randomNumbers.sort(null); //SORT, en ordre.

    System.out.println(randomNumbers);

    for (int i = randomNumbers.size() - 1; i >= 0 ;i-- )
    {   
        System.out.print(randomNumbers.get(i)+" ");
    }
    lecture.close();
}
}