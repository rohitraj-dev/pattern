import java.util.*;
class pattern1
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        //star rectangle
        
        System.out.println();

        int rows;
        System.out.print("enter number of rows : ");
        rows = sc.nextInt();

        int columns;
        System.out.print("enter number of columns : ");
        columns = sc.nextInt();

        int i;
        int j;
        System.out.println();

        for(i=1; i<=rows; i++)
        {
            for(j=1; j<=columns; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}