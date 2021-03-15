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
        
        stackqueue.push(56);
        stackqueue.push(30);
        stackqueue.push(70);
        System.out.println("After deleting");
        
        stackqueue.pop();
         
     
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
        
        stackqueue.queue_push(56);
        stackqueue.queue_push(30);
        stackqueue.queue_push(70);
        System.out.println("After deleting");
      
     
       stackqueue.queue_pop();
           
       
    }
}

