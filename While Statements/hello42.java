import java.util.Scanner;

public class hello42 {
    public static void main(String[] args) {
        int n,i;
        Scanner vi=new Scanner(System.in);
        System.out.println("enter the number");
        n=vi.nextInt();
        i=0;
                while(i<n)
                {
                    System.out.println(""+i);
                    i=i+2;
                }
    }
}
