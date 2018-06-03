package edu.princeton.cs.algs4;

import java.util.Iterator;
// 使用可变数组实现栈，唯一缺点是改变数组的开销和栈的大小成正比。
public class ResizeableStack<Item> implements Iterable<Item> {
    private int N = 0;
    private Item[] a = (Item[]) new Object[1];

    public ResizeableStack(){}

    public boolean isEmpty(){
        return N == 0;}
    public int size(){
        return N; }
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
        }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N ;
        public boolean hasNext(){ return i>0;}
        public Item next(){ return a[--i];}
        public void remove(){};
    }
    public Item pop(){
        Item item = a[--N];
        if (a.length/4 == N && N > 0 ) resizeArray(N*2);
        a[N] = null;
        return item;
        }
    public void push(Item item){
        if (N == a.length) resizeArray(N*2);
        a[N++] = item;

        }
    private void resizeArray(int max){
            Item[] temp = (Item[]) new Object[max];
            for (int i = 0; i < N; i++){
                temp[i] = a[i];
        }
            a = temp;
        }
}
