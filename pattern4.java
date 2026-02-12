import java.util.*;
class pattern4
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        //number square

        int n;
        System.out.print("enter number of row/column : ");
        n = sc.nextInt();

        int i;
        int j;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}