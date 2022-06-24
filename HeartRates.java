public class HeartRates {
    private String fname;
    private String lname;
    private int month;
    private int day;
    int Age;
    private int year;
    private double MAXHBR;
    private double targetHBR;
    public void setfname(String fname){
        this.fname=fname;}
    public void setlname(String lname){
        this.lname=lname;
    }
    public void setAge(int year){
        if (year<1900 && year>2022) {
                    System.out.println("Enter correct readings");
                    
                }else{this.year=year;}
                Age=2022-year;
    }
    public void HeartData(){
        
        
        MAXHBR=220-Age;
        targetHBR=(50/100)*(MAXHBR);    }
   
    public String getfname() {
        return fname; }
        public String getLname(){
            return lname;
        }
        public double gettargetHBr(){
            return targetHBR;
        }
        public double getMaxHbr(){
            return MAXHBR;
        }
        public int getAge(){
            return Age;

            
        }

}
