import java.util.Scanner;

public class hello44 {
    public static void main(String[] args) {
        int n,i,fact=1;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the number");
        n=vi.nextInt();
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(" "+fact);


    }
}
