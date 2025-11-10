package Lopesmi.at03;

public class At03Ex06A {
    public static void main(String[] args) 
    {
        int iNb = 0, iNb2 = 0, iTotalN = 0, iTotalP = 0;
        int[] Tableau = {-65,-34,7,-3,-43,14,23,-9,45,11};

        for(int i = 0 ; i < 10; i++)
        {
            System.out.print(Tableau[i]+ " ");
            if (iNb < 0) 
            {
                iNb2 = Tableau[i];
                iNb2 += iNb2;
                iTotalN = iNb2;
            }
            else
            {
                iNb = Tableau[i];
                iNb += iNb;
                iTotalP = iNb;
            }
        }    
        System.out.println("");
        System.out.println("Le total positif est "+iTotalN + " ");
        System.out.println("Le total négtif est "+iTotalP + " ");
    }
}
