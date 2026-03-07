import java.util.*;
class pattern18
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // hollow rectangle

        int row;
        System.out.print("enter number of rows : ");
        row = sc.nextInt();

        int column;
        System.out.print("enter number of columns : ");
        column = sc.nextInt();

        int i;
        int j;

        for(i=1; i<=row; i++)
        {
            for(j=1; j<=column; j++)
            {
                if(i==1 || i==row || j==1 || j==column)
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