import java.util.Scanner;
import java.math.*;
public class Maximum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter next int");
         double num1 = input.nextDouble();
         double num2 =input.nextDouble();
         double num3  =input.nextDouble();

         System.out.printf("the max value is %f",maximum(num1,num2,num3));
         System.out.println(Math.sqrt(16));}

         public static double maximum(double x,double y ,double z){
            
            return  Math.min(x, Math.min(y, z));
            
         }
         
     
}
