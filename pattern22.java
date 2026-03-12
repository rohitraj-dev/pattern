import java.util.*;
class pattern22
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // binary triangle
        
        int rows;
        System.out.print("enter number of rows : ");
        rows = sc.nextInt();

        int i;
        int j;
        int n = 1;

        for(i=1; i<=rows; i++)
        {
            for(j=1; j<=i; j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
                //System.out.print(n%2);
                //n++;
            }
            System.out.println();
        }
    }
}