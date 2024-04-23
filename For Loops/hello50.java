import java.util.Scanner;

public class hello50 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner vi=new Scanner(System.in);
        System.out.println("neter the number");
        n=vi.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
