package collekcii;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;




public class Array {
    List aList = new ArrayList();
    List bList = new ArrayList();
    public void createArray() {
        Random rand = new Random();
        for(int i = 0; i<10; i++){
            aList.add(rand.nextInt(100));
        }
        System.out.println(aList);
        bList = aList;
        Collections.sort(bList);
        System.out.println(bList);
    }
}