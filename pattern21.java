import java.util.*;
class pattern21
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        // floyd's triangle

        int i;
        int j;

        System.out.print("enter number of rows : ");
        int rows = sc.nextInt();

        int n = 1;

        for(i=1; i<=rows; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(n++ +" ");
            }
            System.out.println();
        }
    }
}