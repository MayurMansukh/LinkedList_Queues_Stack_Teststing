import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList list;

    @Before
    public void setup()
    {
        list=new LinkedList();
    }


    @Test
    public void addNode() {

        list.addNode(56);
        list.addNode(30);
        list.addNode(70);

        list.displayList();

    }

    @Test
    public void addAtStart() {
        System.out.println("insert  node at first postion");
        list.addAtStart(56);
        list.addAtStart(30);
        list.addAtStart(70);

        list.displayList();
    }

    @Test
    public void addAtEnd() {
        System.out.println("insert  node at last postion");
        list.addAtEnd(56);
        list.addAtEnd(30);
        list.addAtEnd(70);

        list.displayList();
    }
}