/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

public class SinglyLinkedList {

    private Node head = null; // head node of the list (or null if empty) 
    private Node tail = null; // last node of the list (or null if empty) 
    private int size = 0; // number of nodes in the list
    // access methods 

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String first() {
        // returns (but does not remove) the first element 
        if (isEmpty()) {
            return " ";
        }
        return head.getElement();
    }

    public String last() {
        // returns (but does not remove) the last element
        if (isEmpty()) {
            return " ";
        }
        return tail.getElement();
    }

// update methods 
    public void addFirst(String e) { // adds element e to the front of the list 
        head = new Node(e, head);// create and link a new node 
        if (size == 0) {
            tail = head; // special case: new node becomes tail also 
        }
        size++;
    }

    public void addLast(String e) { // adds element e to the end of the list
        Node newest = new Node(e, null); // node will eventually be the tail 
        if (isEmpty()) {
            head = newest; // special case: previously empty list 
        } else {
            tail.setNext(newest);
        }
// new node after existing tail 
        tail = newest; // new node becomes the tail
        size++;

    }

    public void addMiddle(String e) {
        Node newest = new Node(e, null);
        if (newest.getElement().compareTo(head.getElement())<0) {
            addFirst(e);
        } else {
            Node c = head;
            while (e.compareTo( c.next.getElement())>0 && c.next != null) {
                c = c.getNext();
            }
            newest.next = c.next;// Put the address of the next node in the next of the new 
            c.next = newest;
        }
size++;
    }

    public String removeFirst() {
        if (isEmpty()) {
            return "";
        }
        String answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null; // special case as list is now empty 
        }
        return answer;
    }
    public String removeLast() {
        if (isEmpty()) {
            return " ";
        }
       if(size==1)
       {
            String answer = head.getElement();
           head=tail=null;
            return answer;
       }
        Node c = head;
        Node g=head.next;
        while (g.next != null) {
            c = c.getNext();
            g=g.getNext();
        }
         String answer = g.getElement();
        c.next=null;
        size--;
        
        return answer;
    }

    public void removeMiddle(String e) {
        Node newest = new Node(e, null);
        if (newest.getElement() == head.getElement()) {
            removeFirst();
        } else {
            Node c = head;
            while (e != c.next.getElement() && c.next != null) {
                c = c.getNext();
            }
            if (c.next != null) // If found, 
            {
                Node temp = c.next;

                // Put the wanted node in a temp pointer
                c.next = temp.next;
            }
            else
            {
              System.out.println("Element not found");

            }
        }
    }
    

    public void print() {
        Node c = head;
        while (c != null) {
            System.out.println(c.getElement());
            c = c.getNext();
        }
        
        }
        
         
 
 
   public String reverse() {
       return reverse(head);
    }

   public String reverse(Node head) {
       if(head.next==null)
           return head.getElement();
       else
           return reverse( head.next)+" "+head.getElement();
    }
    
   
   
   
   
   
   
// nested Node class 

    private static class Node {

        private String element;
        private Node next;

// reference to the element stored at this node // reference to the subsequent node in the list
        public Node(String e, Node n) {
            element = e;
            next = n;
        }

// Accessor methods
        public String getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }
// Modifier methods 

        public void setNext(Node n) {
            next = n;
        }
    }
}


   