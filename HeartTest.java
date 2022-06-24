import java.util.Scanner;
public class HeartTest {
    public static void main(String[] args) {
        HeartRates newUser = new HeartRates();
        Scanner input=new Scanner(System.in);

        System.out.println("Enetr your first name");
        String fname=input.nextLine();
        newUser.setfname(fname);
  
        System.out.println("enetr your last name");
        String lname=input.nextLine();
        newUser.setlname(lname); 
        System.out.println("Enter the Year ");
        int year=input.nextInt();
        newUser.setAge(year); 
        newUser.HeartData(); 
        System.out.printf("your Names are %s and %s %n%n your MaxHeartBeat Rae is %f %n%n and your target HeartbeatRate is %f your age is %d",newUser.getfname(),newUser.getLname(),newUser.getMaxHbr(),newUser.gettargetHBr(),newUser.getAge());  

    }
}
