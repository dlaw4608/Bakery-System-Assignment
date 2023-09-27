package com.example.bakerysystem.ADT;

import java.util.Iterator;

public class LinkedListIterator<D> implements Iterator<D> {

    private LinkNode<D> pos; //current position
    public LinkedListIterator(LinkNode<D> node) {
        pos = node;
    }

    //checks to see if there is a next node
    //if pos is null then no next node
    @Override
    public boolean hasNext() {
        return  pos!= null;
    }


    //temp acts a iterator
    //temp points to current pos
    //then we move pos to next node
    //and we return contents of node before moving
    @Override
    public D next() {
        LinkNode<D> temp=pos;
        pos=pos.next;
        return temp.getContents();
    }
}
