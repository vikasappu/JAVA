package ObjectOrientedProgramming;

public class javaconstructors {
    int x;
    int y;
    //this is the classs constructor//
    public javaconstructors(){
        x=100;
        y=200;
    }

    public static void main(String[] args) {
        javaconstructors obj =new javaconstructors();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }



}
