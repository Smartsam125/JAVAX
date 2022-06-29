
 public class hello{
    
    private int value;

    public static void main(String[] args) {
        String[] letter ={"N","N*10","100*N","1000*N"};
        for (int i = 0; i < letter.length; i++) {
            for(int j=1;j<6;j++){
                if (letter[i]=="N") {
                    //System.out.printf("%s%n",letter[i]);
                    System.out.print(j);
                    }else if(letter[i]=="N*10"){
                        System.out.print(j*10);
                    }

            }
        
           
            
        }
    }
   
    }

