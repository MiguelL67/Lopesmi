package Lopesmi.at03;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class At03Ex05 {
public static void main(String[] args)
{
    List<Integer> randomNumbers = new ArrayList<Integer>();

    for(int i = 0; i < 11; i++)
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

    int iSecond = randomNumbers.get(1);
    randomNumbers.remove(1);
    int iBlast = randomNumbers.get(8);
    randomNumbers.remove(8);

    randomNumbers.add(8,iSecond);
    randomNumbers.add(1,iBlast);

    int iThird = randomNumbers.get(2);
    randomNumbers.remove(2);
    int iHeight = randomNumbers.get(7);
    randomNumbers.remove(7);

    randomNumbers.add(2, iHeight);
    randomNumbers.add(7, iThird);

    //J'ai compris je vais continuer les autre exercice
    

    return randomNumbers;
}
}
