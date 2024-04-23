import java.util.Scanner;

public class hello16 {
    public static void main(String[] args) {
        char a;
        Scanner vi=new Scanner(System.in);
        System.out.println("Enter the number:");
        a=vi.next().charAt(0);

        if (a>='a' && a<='z')
        {
            System.out.println("it is alphabet");
        }
        else
        {
            System.out.println("it is not a alphabet ");
        }
    }
}
