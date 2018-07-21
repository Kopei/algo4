/** use linked list to implement Queue
 Queue API:
 public class Queue<Item> implements Iterable<Item>
              Queue()
              void enqueue(Item item)
              Item dequeue()
              boolean isEmpty()
              int size()
 Iterator api:
 class ListIterator implements Iterable<item>
        ListIterator()
        boolean hasNext()
        Item Next()
        void remove()
 **/

import java.util.Iterator;
import java.util.NoSuchElementException;
public class Queue<Item> implements Iterable<Item>{
    public Queue(){
        first = null;
        last = null;
        N = 0;
    }
    private Node first;
    private Node last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public Iterator<Item> iterator(){
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node i = first;
        public boolean hasNext(){
            return i.next != null;
        }
        public Item next(){
            Item ret = first.item;
            first = first.next;
            return ret;
        }
        public void remove(){}
    }
    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.next = null;
        last.item = item;
        if(isEmpty())first=last;
        oldlast.next = last;
        N++;
    }
    public Item dequeue(){
        if(N == 0)throw new RuntimeException("The queue is empty!");
        Item ret = first.item;
        first = first.next;
        N--;
        if (isEmpty()) last = null;
        return ret;
    }
}