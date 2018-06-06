import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Scanner sc1 = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList( );
        int countinput = 0;
        try {
            while(sc.hasNext()){
                numbers.add(sc.nextDouble());
                countinput++;
            }
        } catch (NumberFormatException ex) {

        }

        
        System.out.println(countinput);
        // String[] str = new String[sc.];
        // while(sc.hasNext()){

        // }
        // String str = sc.next();
        // str.
        // System.out.println(str.replace("ta", ""));
    }
}
