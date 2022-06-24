public class BankaccountTest {
    public static void main(String[] args) {
        BankAccount User1=new BankAccount("james",700);
        BankAccount User2 =new BankAccount("steven", -600);
         System.out.printf("hello user1 your Name is %s and acountBalanc is %.2f",User1.getName(),User1.getBalance());
         System.out.printf("Your Name is %s and account Balance is %f",User2.getName(),User2.getBalance());
        
    }
}
