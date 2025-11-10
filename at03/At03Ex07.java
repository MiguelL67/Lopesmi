package Lopesmi.at03;

import java.util.Random;

public class At03Ex07 {

    public static void main(String[] args) 
    {
       int[] Total = new int[5];
       int[] Tableau = new int[10];

       for(int i = 0; i < 10; i++)
       {
            Random random = new Random();
            int iNombre = random.nextInt(5);
            Tableau[i] = iNombre;             
            System.out.print(Tableau[i]+ " ");
            Total = recurence(Tableau);
       }

       System.out.println(" ");
       System.out.println("Il y a "+ Total[0]+ " de 0");
       System.out.println("Il y a "+ Total[1]+ " de 1");
       System.out.println("Il y a "+ Total[2]+ " de 2");
       System.out.println("Il y a "+ Total[3]+ " de 3");
       System.out.println("Il y a "+ Total[4]+ " de 4");
    }

    
    public static int[] recurence(int Tableau[])
    {
        int iNb1 = 0,iNb2 = 0,iNb3 = 0,iNb4 = 0,iNb5 = 0;
        int[] Tableau2 = new int[10];
        for(int x = 0; x < Tableau.length; x++)
        {
            switch (Tableau[x]) 
            {
                case 0:
                    iNb1++;
                break;
            
                case 1:
                    iNb2++;
                break;

                case 2:
                    iNb3++;
                break;

                case 3:
                    iNb4++;
                break;

                default:
                    iNb5++;
                break;
            }            
        }
        Tableau2[0] = iNb1; 
        Tableau2[1] = iNb2;
        Tableau2[2] = iNb3;
        Tableau2[3] = iNb4;
        Tableau2[4] = iNb5;    

        return Tableau2;            
    }
}
