import java.util.*;
class pattern14
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // inverted number triangle

        int number;
        System.out.print("enter number n : ");
        number = sc.nextInt();

        int i;
        int j;

        for(i=number; i>=1; i--)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}