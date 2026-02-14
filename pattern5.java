import java.util.*;
class pattern5
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        //alphabet square(aBcD)

        int n;
        System.out.print("enter number of row/column");
        n = sc.nextInt();

        int i;
        int j;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i%2 == 1)
                {
                    System.out.print((char)(i+96));
                }
                else
                {
                    System.out.print((char)(i+64));
                }
            }
            System.out.println();
        }
    }
}