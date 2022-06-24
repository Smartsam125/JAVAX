public class BankAccount {
    private double Balance;
    private String name;
    public BankAccount(String name,double Balance){
        this.name=name;
        if (Balance>0) {
            this.Balance=Balance; }}
            public void setBalance(double deposit) {
                if (deposit>0) {
                    Balance=deposit + Balance;
                }
            }
            public void setName(String Name){
                Name=name;
            }
            public String getName(){
                return name;
            }
            public double getBalance(){
                return Balance;
            }
            
}
