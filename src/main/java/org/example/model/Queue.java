package org.example.model;

public class Queue {
    private Node first;
    public boolean isEmpty(){

        return first == null;
    }
    public void enqueue(String pInhalt) {
        if (first == null) {
            first = new Node(pInhalt);
        } else {
            Node n = first;
            while (n.getNext()!=null) {
                n = n.getNext();
            }
            n.setNext(new Node(pInhalt));
        }

    }
    public void dequeue() {
        if(!isEmpty()) {
            Node n = first;
            first = n.getNext();
        }
    }
    public Node front() {
        return first;
    }
    public String toString(){
        String ret = "[";
        Node tmp = first;

        while (tmp != null){
            if(tmp.getNext() == null){
                ret = ret + tmp.getInhalt();
            }else {
                ret = ret + tmp.getInhalt() + ";";
            }
            tmp = tmp.getNext();
        }


        ret = ret + "]";
        return ret;
    }
}
