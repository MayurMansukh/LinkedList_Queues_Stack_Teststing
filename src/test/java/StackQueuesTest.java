import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

public class StackQueuesTest {
    StackQueues stackqueue;
    @Before
    public  void setup()
    {
        stackqueue=new StackQueues();
    }

    @Test
    public void aadAtEnd()
    {
        stackqueue.push(56);
        stackqueue.push(30);
        stackqueue.push(70);
    }

    @Test
    public void pop_at_front()
    {
        int i=0;
        stackqueue.push(56);
        stackqueue.push(30);
        stackqueue.push(70);
        System.out.println("After deleting");
        while(i < 3)
        {
            stackqueue.pop();
            i++;
        }
    }

    @Test
    public void AddAtEnd()
    {
        stackqueue.queue_push(56);
        stackqueue.queue_push(30);
        stackqueue.queue_push(70);
    }

    @Test
    public void deleteAtfirst()
    {
        int i=0;
        stackqueue.queue_push(56);
        stackqueue.queue_push(30);
        stackqueue.queue_push(70);
        System.out.println("After deleting");
        while(i<3)
        {
            stackqueue.queue_pop();
            i++;
        }
    }
}

