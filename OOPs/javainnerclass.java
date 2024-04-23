package ObjectOrientedProgramming;
 class outerclass{
     int x=10;
     class innerclass{
         int y=10;
     }
 }

public class javainnerclass {
    public static void main(String[] args) {
        outerclass vi =new outerclass();
        outerclass.innerclass vik=vi.new innerclass();
        System.out.println(vi.x + vik.y);
    }

}
