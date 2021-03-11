import org.junit.Assert;
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

    @Test
    public void addAtMiddle() {

        list.addAtEnd(56);
        list.addAtEnd(70);
        list.displayList();

        list.addAtmiddle(30,1);
        list.displayList();
    }

    @Test
    public void deleteFirstElement() {

        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();

        list.deleteFirstElement();
        list.displayList();
    }

    @Test
    public void deleteLastElement() {

        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();

        list.deleteLastElement();
        list.displayList();
    }

    @Test
    public void searchNode() {

        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();

        int result= (int)list.searchNode(30);
        Assert.assertEquals(30,result);
    }
    @Test
    public void insertAfter() {

        list.addAtEnd(56);
        list.addAtStart(30);
        list.addAtEnd(70);
        list.displayList();
        System.out.println("Insertinng after 30");
        int result=(int)list.insertAfter(list.head.Next,40);
        list.displayList();
        Assert.assertEquals(40,result);
    }

    @Test
    public void deleteGivenNode(){
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        System.out.println("After deleting");
        int result=(int)list.deleteGivenNode(30);
        list.displayList();
        Assert.assertEquals(30,result);
    }
}