package org.example.model;

public class Stack {
    private Node first;

    /**
     * Checks if the list is empty
     * @return true or false
     */
    public boolean isEmpty(){

        return first == null;
    }

    /**
     * Das Objekt pObject wird oben auf den Stapel gelegt. Falls
     * pObject gleich null ist, bleibt der Stapel unverändert.
     * @param pInhalt
     */
    public void push(String pInhalt){
        //ToDO implement
        Node n = first;
        //Fall 1 leerer Stack
        if (first == null) {
            first = new Node(pInhalt);
        }else {
            // Fall 2 Stack nicht leer
            Node a = first;
            first = new Node(pInhalt);
            first.setNext(a);

        }

    }



    /**
     * Das zuletzt eingefügte Objekt wird von dem Stapel entfernt.
     * Falls der Stapel leer ist, bleibt er unverändert
     * @return
     */
    public String pop(){

        Node n = first;
        while (n.getNext()!= null) {
                n = n.getNext();
            }
        n.setNext(null);
        return null;
    }

    /**
     * Die Anfrage liefert das oberste Stapelobjekt. Der Stapel bleibt
     * unverändert. Falls der Stapel leer ist, wird null zurückgegeben.
     * @return
     */
    public String top(){
        //ToDO Implement
        return null;
    }

    /**
     * Returns String representation of List
     * @return
     */
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
