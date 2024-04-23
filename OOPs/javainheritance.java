package ObjectOrientedProgramming;

 public  class javainheritance {
     private   String brand = "kia";

     public String getBrand(){
         return brand;
     }

     public  void setBrand(String newbrand) {
         this.brand=newbrand;
         System.out.println("goooo fast");
     }
 }
     class javas extends javainheritance{
         String Modelname="gt line";
         public static void main(String[] args) {

             javas kk= new javas();

             kk.setBrand("mg hector");
             System.out.println("the brand is = "+ kk.getBrand()+ " "+kk.Modelname);

         }
     }


