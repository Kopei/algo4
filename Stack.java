package edu.princeton.cs.algs4;
import java.util.Iterator;
/**
 * stack api
 * public class Stack<Item> implements Iterable<Item>
 *              Stack()
 *        void push(Item item)
 *        Item pop()
 *        boolean isEmpty()
 *        int  size()
 */
public class Stack<Item> implements Iterable<Item> {
    private int N;
    private Node first;
    private class Node{
        Node next;
        Item item;
    }
    public Iterator<Item> iterator(){ return iterator();}
    public Stack(){
        N = 0;
        first = null;
    }
    public void push(Item item)
    {
        Node oldNode = first;
        first = new Node();
        first.next = oldNode;
        first.item = item;
        N++;
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}