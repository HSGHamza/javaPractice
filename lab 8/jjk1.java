/*import java.util.LinkedList;

import org.w3c.dom.Node;

class jjk1{
    public static void main(String[] args) {
        LinkedList<Integer> memal = new LinkedList<>();
        memal.add(0, 1);
        memal.add(1, 9);
        memal.add(2,71);
        memal.add(3,61);
        memal.add(4,51);

    }
    public static int count(LinkedList<Integer> memal){

        int pos = 0;
        Node current = memal.getFirst();
        while ( memal != null){
            current = current.getNextSibling();
            pos++;
        }



        return 1;
    }
}*/

// Import the LinkedList class
import java.util.LinkedList;

public class jjk1 {
  public static void main(String[] args) {
    LinkedList<Integer> cars = new LinkedList<Integer>();
    cars.add(1);
    cars.add(2);
    cars.add(3);
    cars.add(4);
    System.out.println(cars);
  }
}