import java.util.Scanner;


public class hello20 {
    public static void main(String[] args) {
        int a,b;
        Scanner vi=new Scanner(System.in);

        System.out.println("enter the number :");
        a=vi.nextInt();
        b=(int)Math.log(a);
        if(Math.pow(2,b)==a)
        {
            System.out.println("power is equal num");
        }
        else
        {
            System.out.println("power is not equal num");
        }



    }
}
