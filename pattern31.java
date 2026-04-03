import java.util.*;

class pattern31 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grid size n (odd recommended): ");
        int n = sc.nextInt();
        sc.close();

        int mid = n / 2;                  // center index (0-based)
        int layers = (n + 1) / 2;         // number at center for odd n

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
            {
                int maxDist = Math.max(Math.abs(i - mid), Math.abs(j - mid));
                int val = layers - maxDist;
                System.out.print(val);
                if (j < n - 1) 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}