import java.util.Scanner;

public class hello34 {
    public static void main(String[] args) {
        char a;
        Scanner vi= new Scanner(System.in);
        System.out.println("enter the number:");
        a=vi.next().charAt(0);
        switch (a)
        {
            case 'a':
                System.out.println("january");
                break;
            case 'b':
                System.out.println("february");
            case 'c':
                System.out.println("march");
                break;
            case 'd':
                System.out.println("april");
            case 'e':
                System.out.println("may");
                break;
            case 'f':
                System.out.println("june");
            case 'g':
                System.out.println("july");
            case 'h':
                System.out.println("august");
            case 'i':
                System.out.println("september");
                break;
            case 'j':
                System.out.println("october");
            case 'k':
                System.out.println("november");
                break;
            case 'l':
                System.out.println("december");

        }

    }
}
