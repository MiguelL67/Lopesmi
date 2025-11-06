package Lopesmi.at01;

public class At01Ex07 
{
 public static void main(String[] args)
 {
    double dNb1, dNb2, dNb3, dNb4, dNb5, dNb6;
    dNb1 = 3 * 10 + 45 / 5 - 8 + 56 % 20;
    System.out.println(dNb1);

    dNb2 = 3 * 10 + 45 / 5 - (8 + 56) % 20;
    System.out.println(dNb2);

    dNb3 = 3 * 10 + 45 / (5 - 8 + 56) % 20;
    System.out.println(dNb3);

    dNb4 = 3 * 10 + 45 / (5 - 8) + 56 % 20; 
    System.out.println(dNb4);

    dNb5 = 3 * (10 + 45) / 5 - 8 + 56 % 20;
    System.out.println(dNb5);

    dNb6 = 3 * (10 + 45 / 5) - 8 + 56 % 20;
    System.out.println(dNb6);
 } 
}
