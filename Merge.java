/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Merge {

    public Node head = null; // head node of the list (or null if empty) 
    // access methods 
    int size = 0;

// update methods 
    public void addFirst(String e) { // adds data e to the front of the list 
        head = new Node(e, head);// create and link a new node 
        size++;
    }

    public String deleteFirst() {
        if (size == 0) {
            return "";
        }
        String remo = head.element;
                 
        head = head.next;
        size--;
        return remo;
    }

    public void insert(String element) {
        if (head == null || head.element.compareTo(element) >= 0) {
            addFirst(element);
        } else {
            Node p = head;
            Node c = p.next;
            while (c != null && c.element.compareTo(element) <= 0) {
                p = c;
                c = c.next;
            }
            Node newest = new Node(element, c); // node will eventually be the tail 
            p.next = newest;

        }
    }

    public void Display() {
        Node N = head;
        while (N != null) {
            System.out.print(N.element + " ");
            N = N.next;
        }

    }

    public Merge merge(Merge list1, Merge list2) {
        Merge merged = new Merge();
        Node head1 = list1.head;
        Node head2 = list2.head;
        if (head1 == null) {
            return list2;
        }
        if (head2 == null) {
            return list1;
        }
        merged.head = null;
        if (head1.element.compareTo(head2.element) <= 0) {
            merged.head = head1;
            head1 = head1.next;
        } else {
            merged.head = head2;
            head2 = head2.next;
        }
        Node mergedTail = merged.head;
        while (head1 != null && head2 != null) {
            Node temp = null;
            if (head1.element.compareTo(head2.element) <= 0) {
                temp = head1;
                head1 = head1.next;
            } else {
                temp = head2;
                head2 = head2.next;
            }
            mergedTail.next = temp;
            mergedTail = temp;
        }
        if (head1 != null) {
            mergedTail.next = head1;
        } else if (head2 != null) {
            mergedTail.next = head2;
        }
        Node p = null;
        Node c = merged.head;
        Node next = null;
        while (c != null) {
            next = c.next;
            c.next = p;
            p = c;
            c = next;
        }
       merged.head = p;
        return merged;

    }

    public static class Node {

        private String element;
        private Node next;

// reference to the data stored at this node // reference to the subsequent node in the list
        public Node(String e, Node n) {
            element = e;
            next = n;
        }

    }
}
