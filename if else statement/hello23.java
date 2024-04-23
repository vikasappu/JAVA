import java.util.Scanner;

public class hello23 {
    public static void main(String[] args) {
        char ch;
        Scanner vi=new Scanner(System.in);
        System.out.println("enetr the character:");
        ch=vi.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("it is a lower case");
        }
        else if (ch>='A' && ch<='Z')
        {
            System.out.println("it is a upper case");
        }
        else
        {
            System.out.println("it is not a alphabet");
        }
    }
}
