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
}