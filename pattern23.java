import java.util.*;
class pattern23
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // star triangle vertically flipped

        int rows;
        System.out.print("enter the number of rows : ");
        rows = sc.nextInt();

        int i;
        int j;
        int k;

        for(i=1; i<=rows; i++)
        {
            for(j=i; j<rows; j++)
            {
                System.out.print("  ");
            }
            for(k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }        
    }
}