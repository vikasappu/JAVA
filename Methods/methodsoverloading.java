package Methods;

public class methodsoverloading {
    static int hello(int x,int y)
    {
        return x+y;
    }
    static double helloo(double x,double y)
    {
        return x+y;

    }
    public static void main(String[] args) {
        int num1=hello(3,4);
        double num2=helloo(34.44,45.66);
        System.out.println(num1);
        System.out.println(num2);


    }
}
