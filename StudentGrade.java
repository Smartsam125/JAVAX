 import java.util.Scanner;
 public  class StudentGrade {
    String name;
    static int number;
    double average;
    public void setNumber(int number) {
        this.number=number;

        
    }
     public StudentGrade(String name,double average){
        this.name =name;
        if(average>0)
        if (average<100){
            this.average=average;
        }
     }
   public void setName(String name){
    this.name=name;
   }
   public void setAverage(double average){
    this.average = average;
   }
   public String getGrade(){
    String letterGrade ="";
    if(average >=90)
    letterGrade="A";
    else if(average >= 60)
    letterGrade ="C";
    else 
    System.out.println("UnGraded");

    return letterGrade;
   }
   public String  getName() {
    return name;}
    public static void main(String[] args) {
        StudentGrade timo = new StudentGrade("timo",46);
        Scanner input =new Scanner(System.in);
        System.out.printf("Hello your rade is %f",timo.getGrade());
        System.out.println("Enter your name");
        String name =input.nextLine();
        timo.setName(name);
        System.out.println("enter our grade");
        double grade =input.nextDouble();
        timo.setAverage(grade);
        System.out.printf("Hello your names are %s and grades are %s",timo.getName(),timo.getGrade());


    }


    
}
