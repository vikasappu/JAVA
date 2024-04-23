import java.util.Scanner;

public class hello43 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the number:");
        n=vi.nextInt();
        System.out.println("the square of the number:");
        for(i=1;i<n; i=2*i)
        {
            System.out.println(" "+i);
        }
        System.out.println("the cube of the number");
        for(j=1;j<n;j=3*j)
        {
            System.out.println(" "+j);
        }

    }
}
