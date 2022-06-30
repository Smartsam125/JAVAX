public class TimeTest1 {
    public static void main(String[] args) {
        Time1 time =new Time1();
        
        displayTime("After time object is created",time);
        System.out.println();
        time.setTime(24,60,60);
        displayTime("After calling time object",time);
        System.out.println();
        try {
            time.setTime(99,99,99);
        } catch (IllegalArgumentException e) {
            //TODO: handle exception
            System.out.printf("Exception is %s%n%n",e.getMessage());
        }
        displayTime("After calling time with invalid values",time);

        
    }
    public static void displayTime(String Header,Time1 f) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",Header,f.toUniversalString(),f.toString());
    }
    
      

}
