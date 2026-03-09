import java.util.*;
class pattern19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // star plus

        int n;
        System.out.print("enter n : ");
        n = sc.nextInt();

        int i;
        int j;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i==3 || j==3)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}