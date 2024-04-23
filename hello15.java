import java.util.Scanner;

public class hello15 {
    public static void main(String[] args) {
        int a,b;
        Scanner vi=new Scanner(System.in);
        System.out.println("Enter the number:");
        a=vi.nextInt();
        b=vi.nextInt();
        if (a==b)
        {
            System.out.println("a is equal to b");
        }
        else
        {
            System.out.println("a is not equal to b");
        }

    }
}
