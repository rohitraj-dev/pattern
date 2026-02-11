import java.util.*;
class pattern3
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        //alphabet square

        int n;
        System.out.print("enter number of rows/columns : ");
        n = sc.nextInt();

        int i;
        int j;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();    
        }
    }
}