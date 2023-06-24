/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;


  class Node<E> {

    /** The element stored at this node */
    private E element;     // an element stored at this node

    /** A reference to the subsequent node in the list */
    private Node<E> next;  // a reference to the subsequent node in the list

    /**
     * Creates a node with the given element and next node.
     *
     * @param e  the element to be stored
     * @param n  reference to a node that should follow the new node
     */
    public Node(E e, Node<E> n) {
      element = e;
      next = n;
    }

    // Accessor methods
    /**
     * Returns the element stored at the node.
     * @return the element stored at the node
     */
    public E getElement() { return element; }

    /**
     * Returns the node that follows this one (or null if no such node).
     * @return the following node
     */
    public Node<E> getNext() { return next; }

    // Modifier methods
    /**
     * Sets the node's next reference to point to Node n.
     * @param n    the node that should follow this one
     */
    public void setNext(Node<E> n) { next = n; }
  } //----------- end of nested Node class -----------

public class CircularlyLinkedList<E> {


  // instance variables of the CircularlyLinkedList
  /** The designated cursor of the list */
   Node<E> tail = null;                  // we store tail (but not head)

  /** Number of nodes in the list */
  private int size = 0;                         // number of nodes in the list

  /** Constructs an initially empty list. */
  public CircularlyLinkedList() { }             // constructs an initially empty list

  // access methods
  /**
   * Returns the number of elements in the linked list.
   * @return number of elements in the linked list
   */
  public int size() { return size; }

  /**
   * Tests whether the linked list is empty.
   * @return true if the linked list is empty, false otherwise
   */
  public boolean isEmpty() { return size == 0; }

  /**
   * Returns (but does not remove) the first element of the list
   * @return element at the front of the list (or null if empty)
   */
  public E first() {             // returns (but does not remove) the first element
   
   if(! isEmpty())
       return tail.getNext().getElement();
   else 
       return null;
   
  }

  /**
   * Returns (but does not remove) the last element of the list
   * @return element at the back of the list (or null if empty)
   */
  public E last() {              // returns (but does not remove) the last element

	  if(! isEmpty())
       return tail.getElement();
   else 
       return null;

  }

  // update methods
  /**
   * Rotate the first element to the back of the list.
   */
  public void rotate() {         // rotate the first element to the back of the list
 if(! isEmpty()&&size>1)
	tail=tail.getNext();
  }

  /**
   * Adds an element to the front of the list.
   * @param e  the new element to add
   */
  public void addFirst(E e) {      
      if(! isEmpty()){
      Node<E> newnode= new Node<E>(e,tail.getNext());
      tail.setNext(newnode);
      }else
          
      {tail=new Node<E>(e,null);
      tail.setNext(tail);
      }
      size++;

  }}