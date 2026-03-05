import java.util.*;
class pattern17
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

        for(i=number; i>=1; i--)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}