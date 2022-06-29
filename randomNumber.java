import java.security.SecureRandom;
public class randomNumber {
    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom();
        for(int i =0;i<=20;i++){
            int value = 1 +randomNumbers.nextInt(6);
            System.out.printf("%d",value);
            if (i%5==0) {
                System.out.println();
                
            }
           
        }
    }
}
