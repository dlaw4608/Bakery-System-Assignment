package com.example.bakerysystem.ADT;

import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

    public class LinkList<D> {
        public LinkNode<D> head = null;

        public LinkNode<D> getHeadNode(){
            return  head;
        }


        public int listRange() {
            LinkNode temp = head; //copy made of head
            int numberOfNodes = 0;
            while (temp != null) //while there is one or more node after the head
            {
                numberOfNodes++; //counter will add up how many nodes are in list
                temp = temp.next;
            }
            return numberOfNodes;
        }

        public void addElement(D e) {
            LinkNode<D> newNode = new LinkNode<>();
            newNode.setContents(e);
            newNode.next = head;
            head = newNode;
        }

        public void removeElement(int index) { //removing element from list
            index = listRange() - index - 1;
            if (index == 0) {
                head = head.next; //removing first  element in list
            } else {
                LinkNode current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }

        }

        public D getHead() {
            return head.getContents();
        }

        public void addContentsToListView(ListView lv) { //method adds contents to list view
            LinkNode<D> temp = head;
            while (temp != null) {
                lv.getItems().add(temp.getContents());
                temp = temp.next;
            }
        }

        public void addContentsToComboBox(ComboBox cb) {
            LinkNode<D> temp = head;
            while (temp != null) {
                cb.getItems().add(temp.getContents());
                temp = temp.next;
            }
        }

        @Override
        public String toString() {
            String result = "";
            LinkNode<D> temp = head;
            while (temp != null) {
                result += temp.getContents();
                temp = temp.next;
            }

                    return result;

            }
        }


