package Lopesmi.at03;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class At03Ex05 {
public static void main(String[] args)
{
    int[] Tableau = new int[10];
    List<Integer> randomNumbers = new ArrayList<Integer>();

    for(int i = 0; i < 10; i++)
    {
        Random random = new Random();
        int iNombre = random.nextInt(100);
        randomNumbers.add(iNombre);
    }
    
    System.out.println(randomNumbers);

    System.out.println(echange(randomNumbers));

}
public static List<Integer> echange(List<Integer> randomNumbers)
{


    int iLast = randomNumbers.getLast();
    randomNumbers.removeLast();
    int iFirst = randomNumbers.getFirst();
    randomNumbers.removeFirst();

    randomNumbers.addFirst(iLast);
    randomNumbers.addLast(iFirst);
    
    return randomNumbers;
}
}
