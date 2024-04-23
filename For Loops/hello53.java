import java.util.Scanner;

public class hello53 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner vi=new Scanner(System.in);
        System.out.println("neter the number");
        n=vi.nextInt();
        for (i=n-1;i>=0;i--)
        {
            for (j=0;j<n-i-1;j++)
            {
                System.out.print("  ");
            }
            for(j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
