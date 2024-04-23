import java.util.Scanner;

public class hello49 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner vi= new Scanner(System.in);
        n=vi.nextInt();
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
