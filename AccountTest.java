import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account MyAccount = new Account("Sam");
        Scanner input =new Scanner(System.in);
        System.out.printf(" the Name initilise is %s",MyAccount.getName());
        System.out.println("Enter Your Name");
        String theName=input.nextLine();
        MyAccount.setName(theName);
        System.out.printf("the name is %s",MyAccount.getName());


        
    }
}
