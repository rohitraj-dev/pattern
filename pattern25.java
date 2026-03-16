import java.util.*;
class pattern25
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // double flipped star triangle

        int rows ;
        System.out.print("enter number of rows : ");
        rows = sc.nextInt();

        int i;
        int j;
        int k;

        for(i=1; i<=rows; i++)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("  ");
            }
            for(k=i; k<=rows; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}