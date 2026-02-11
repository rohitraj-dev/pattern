import java.util.*;
class pattern2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        //star square printing 
        
        System.out.println();

        int n;
        System.out.print("enter number of rows/columns : ");
        n = sc.nextInt();

        int i;
        int j;
        System.out.println();

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}