/**
 * DrawSmiley
 */
public class DrawSmiley {

    public static void main(String[] args) {
        int array[]={5,6,7,8,9,10,11,15};
        System.out.printf("%s%8s%n","arrayIndex","Value");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n",i,array[i]);
            for (int j = 0; j < array[i]; j++) {
                System.out.printf("%8s","*");
                
            }
            
        }
    }
}