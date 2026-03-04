import java.util.*;
class pattern16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //alphabet inverted triangle

        int number;
        System.out.print("enter number n : ");
        number = sc.nextInt();
        
        int i;
        int j;

        for(i=1; i<=number; i++)
        {
            for(j=number; j>=i; j--)
            {
                System.out.print((char)(i+96));
            }
            System.out.println();
        }
    }
}