import java.util.Scanner;

public class hello17 {
    public static void main(String[] args) {
        int a;
        Scanner vi=new Scanner(System.in);
        System.out.println("Enter the number");
        a=vi.nextInt();
        int r=(int)Math.sqrt(a);
        if (r*r==a)
        {
            System.out.println("it is a perfect square");
        }
        else
        {
            System.out.println("it is not a perfect square");
        }
    }
}
