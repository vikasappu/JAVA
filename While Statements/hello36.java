import java.util.Scanner;

public class hello36 {
    public static void main(String[] args) {
        int number, i = 2, Sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter even no upto : ");
        number = sc.nextInt();

        while(i <= number)
        {
            Sum = Sum + i;
            i = i + 2;
        }
        System.out.println("\n The Sum of Even Numbers upto "+number+" is " +Sum);
    }
}



