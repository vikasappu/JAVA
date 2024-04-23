import java.util.Scanner;

public class hello38 {
    public static void main(String[] args) {
        int decimal;
        String b=" ";
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        decimal=Scan.nextInt();
        while(decimal!=0)
        {
            b=(decimal%2)+b;
            decimal/=2;
        }
        System.out.println("Binary is : "+b);


    }
}
