package davis.tech;


/**
 * 
 * @author CYPRIAN DAVIS
 *
 */

public class CircularlyLinkedList<T> {
	//inner Node class
		@SuppressWarnings("hiding")
		private class Node<T>{
			private T element; //reference to the element stored at this node
			private Node<T> next; //reference to the subsequent node in the list
			
			//constructor
			public Node(T e) {
				this.element = e ;
			}
			//returns element stored at this node
			public T getElement() {
				return this.element;	
			}
			
			public Node<T> getNext(){
				return this.next;
			}
			public void setNext(Node<T> e) {
				this.next = e;
			}
			
		}
		//instance variables of the circularlyLinkedList
		private Node<T>tail = null; //refernce of tail (but not head)
		private int size =0; 		//number of nodes in the list
		//Constructor
		public CircularlyLinkedList() {
			
		}
		//access method
		public boolean isEmpty() {
			return size ==0;
		}
		public int getSize() {
			return this.size;
		}
		//Returns but does not remove the first element in the last
		public T getFirst() {
			if(isEmpty())
				return null;
			return tail.getNext().getElement();
		}
		//Returns but does not remove the last element in the last
		public T getLast() {
			if(isEmpty())
				return null;
			return tail.getElement();
		}
		//update methods
		public void rotate() {
			if(!(isEmpty()))
				tail = tail.getNext();
		}
		//adds an element e at the front of the list
		public void addFirst(T e) {
			Node<T> node = new Node<>(e);
			if(isEmpty()) {
				tail = node;
				tail.setNext(node);
			}
			else {
				node.setNext(tail.getNext());
				tail.setNext(node);
			}
			size ++;
		}
		
		//Adds element e at the end of the list
		public void addLast(T e) {
				addFirst(e);
				tail = tail.getNext();
				size ++;
		}
		//removes and returns the first element
		public T removeFirst() {
			if(isEmpty())  
				return null;  //nothing to remove
			Node<T> head = tail.getNext();
			if(head == tail)
				tail = null;
			else 
				tail.setNext(head.getNext());
			size--;
			return head.getElement();
		}
		
}//End
