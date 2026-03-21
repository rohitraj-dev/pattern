import java.util.*;
class pattern27
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // half diamond

        int rows;
        System.out.print("enter number of rows : ");
        rows = sc.nextInt();

        int i;
        int j;
        //int k;

        for(i=1; i<=rows; i++)
        {
            for(j=i; j<rows; j++)
            {
                System.out.print("  ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            for(j=1; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}