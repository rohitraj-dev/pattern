import java.util.*;
class pattern24
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // odd number triangle

        int rows;
        System.out.print("enter the number of rows : ");
        rows = sc.nextInt();

        int i;
        int j;
        int a=1;

        for(i=1; i<=rows; i++)
        {
            a=1;
            for(j=1; j<=i; j++)
            {
                System.out.print(a+" ");
                a = a+2;
            }
            System.out.println();
        }
    }
}