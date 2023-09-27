package com.example.bakerysystem.ADT;

public class LinkNode<N> {
    public LinkNode<N> next=null;
    public N contents;

    public N getContents() {
        return contents;
    }

    public void setContents(N contents) {
        this.contents = contents;
    }
}
