public class LinkedList<T> {

    class Node<T>{
        T data;
        Node<T> Next;

        public Node(T data){
            this.data=data;
            this.Next=null;
        }
    }

    public Node<T> head=null;
    public Node<T> tail=null;

    public void addNode(T data){ //add nodes in Linked List

        Node<T> newNode=new Node<T>(data);

        if (head==null) {

            head=newNode;
            tail=newNode;
        }
        else
            tail.Next=newNode;
        tail=newNode;

    }

    public void addAtStart(T data) { // add nodes at first postion in LinkedList

        Node<T> newNode = new Node<T>(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.Next = temp;
        }
    }

    public void addAtEnd(T data) { //add nodes at end postion of Linked List
        Node<T> newNode = new Node<T>(data);
        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public Node addAtmiddle(T data, int position){

        Node<T> newnode = new Node<T>(data);
        newnode.data = data;
        Node<T> cur = head;
        Node<T> prev = null;
        int count=0;
        while (count < position) {
            prev = cur;
            cur = cur.Next;
            count++;
        }
        newnode.Next = cur;
        if (prev != null) {
            prev.Next = newnode;
            return head;
        }
        return newnode;
    }

    public void deleteFirstElement() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {

            if(head != tail) {
                head = head.Next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void deleteLastElement() { // delete last element in list
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.Next != tail) {
                    current = current.Next;
                }
                tail = current;
                tail.Next = null;
            }
            else {
                head = tail = null;
            }
        }
    }


    public void displayList() { // display linked List
        Node<T> current=head;

        if (head==null){

            System.out.println("list is empty");
        }
        else {
            System.out.println("singly linked list: ");
            while (current != null) {

                System.out.println(current.data + "");
                current = current.Next;
            }

        }
    }

}
