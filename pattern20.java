import java.util.*;
class pattern20
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // star cross
        
        int n;
        System.out.print("enter n : ");
        n = sc.nextInt();
        
        int i;
        int j;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if (j == i || j == (n + 1 - i))
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