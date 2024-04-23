import java.util.Scanner;

public class hello21 {
    public static void main(String[] args) {
        char ch;
        Scanner vi = new Scanner(System.in);
        System.out.println("enetr the character:");
        ch=vi.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch== 'u')
        {
            System.out.println("it is an vowel");
        }
        else
        {
            System.out.println("it is an consotent");
        }
    }
}
