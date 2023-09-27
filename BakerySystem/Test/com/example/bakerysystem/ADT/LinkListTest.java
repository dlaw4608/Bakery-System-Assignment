package com.example.bakerysystem.ADT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {
    private LinkList trueList;
    @BeforeEach
    void setUp(){trueList = new LinkList();}

    @Test
    void addElement() {
        trueList.addElement(2);
        trueList.addElement(3);
        trueList.addElement(4);
        assertEquals(3, trueList.listRange());
    }

    @Test
    void getHead() {
        trueList.addElement(1);
        trueList.addElement(2);
        assertEquals(2, trueList.getHead());
    }

    @Test
    void addContentsToListView() {
    }

    @Test
    void removeElements(){
        trueList.addElement(1);
        trueList.addElement(2);
        trueList.addElement(3);
        trueList.addElement(4);
        trueList.removeElement(0);
        assertEquals(3, trueList.listRange());
    }
}