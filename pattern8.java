import java.util.*;
class pattern8
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // alphabet triangle
        
        int number;
        System.out.print("enter number n : ");
        number = sc.nextInt();

        int i;
        int j;

        for(i=1; i<=number; i++)
        {
            for(j=1; j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}