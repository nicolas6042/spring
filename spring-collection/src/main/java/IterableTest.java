import java.util.LinkedList;

/**
 * @author mbaranowicz
 */
public class IterableTest {
    public static void main(String []args){

        LinkedList<String> theList = new LinkedList<>();

        theList.add(0,"object 1");
        theList.add(1,"object 2");
        theList.add(2,"object 3");
        theList.add(3,"object 4");
        theList.add(2,"object 5");

        for (String theObject: theList) {
            System.out.println(theObject);
        }
    }
}
