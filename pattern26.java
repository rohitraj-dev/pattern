import java.util.*;
class pattern26
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // rhombus

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
            for(j=1; j<=rows; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}