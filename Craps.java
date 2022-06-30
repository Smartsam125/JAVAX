import java.security.SecureRandom;
public class Craps {
    private static final SecureRandom   randomNummbers =new SecureRandom();
    private static final int SNAKE_EYES=2;
    private static final int TREY =3;
    private static final int SEVEN = 7;
private static final int YO_LEVEN = 11;
private static final int BOX_CARS = 12;
private enum Status{CONTINUE,WON,LOST};


    public static void main(String[] args) {
        int mypoint =0;
        Status gamestatus;
        int sumOfDice =rollDice();
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
            gamestatus=Status.WON;
                break;
                case SNAKE_EYES:
                case BOX_CARS:
                case TREY:
                gamestatus =Status.LOST;
                break;
        
            default:
            gamestatus=Status.CONTINUE;
            mypoint=sumOfDice;
            System.out.printf("You point is %d",mypoint);
                break;
        }
        while (gamestatus==Status.CONTINUE) {
            sumOfDice=rollDice();
            if (sumOfDice==mypoint) {
                gamestatus=Status.WON;
                
            }else if (sumOfDice==SEVEN) {
                gamestatus=Status.LOST;
                
            }
        }
        if (gamestatus==Status.WON) {
            System.out.println("Player WIns");
            
        }else if (gamestatus==Status.LOST) {
            System.out.println("player loses");
            
        }
        
    }
    public static int rollDice() {
        int roll1=1 + randomNummbers.nextInt(6);
        int roll2=1+ randomNummbers.nextInt(6);
        int sum=roll1+roll2;
        System.out.printf("you have rolled %d +%d =%d",roll1,roll2,sum);
        return sum;
        
    }
    
}
