package org.example;

import org.example.model.Liste;
import org.example.model.Queue;
import org.example.model.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main m1 = new Main();
        m1.frager();

    }
    private void listenTester() {
        Liste l1 = new Liste();

        l1.insert("Hallo Welt");
        l1.insert("Peter Pan");
        l1.insert("Manuel");

        System.out.println(l1);

        System.out.println(l1);

        Liste l2 = new Liste();
        System.out.println(l2);


    }
    private void stackTester() {
        Stack s1 = new Stack();
        s1.top();
        s1.push("a");
        s1.push("b");
        s1.push("c");
        System.out.println(s1);
        System.out.println("["+s1.top()+"]");
        s1.pop();
        System.out.println(s1);
    }
    private void queueTester() {
        Queue q1 = new Queue();
        q1.dequeue();
        q1.front();
        q1.enqueue("a");
        q1.enqueue("b");
        q1.enqueue("c");
        System.out.println(q1);
        q1.dequeue();
        System.out.println(q1);
        System.out.println(q1.front());
    }
    public void frager() {
        Main m2 = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welche Nummer? (1:Liste) (2:Stack) (3:Queue)");
        int antowrt = sc.nextInt();
        switch (antowrt) {
            case 1 -> m2.listenTester();
            case 2 -> m2.stackTester();
            case 3 -> m2.queueTester();
            default -> {
                System.out.println("Bitte eine Zahl wählen");
                frager();

            }
        }
    }


}