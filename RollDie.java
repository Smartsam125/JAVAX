import java.security.SecureRandom;
public class RollDie {
    public static void main(String[] args) {
        int frequency1=0;
        int  frequency2=0;
        int frequency3=0;
        int frequency4=0;
        int frequency5=0;
        int frequency6=0;
        SecureRandom randomNumbers =new SecureRandom();
        for(int roll=0;roll<=60000;roll++){
            int face = 1 + randomNumbers.nextInt(6);
            
            switch (face) {
                case 1:
                ++frequency1;
                break;
                case 2:
                ++frequency2;
                break;
                case 3:
                ++frequency3;
                break;
                case 4:
                ++frequency4;
                break;
                case 5:
                ++frequency5;
                break;
                case 6:
                ++frequency6;



                    
                    break;
            
               
            }

        }
        System.out.printf("1\t%d%n",frequency1);
        
    }
    
}
