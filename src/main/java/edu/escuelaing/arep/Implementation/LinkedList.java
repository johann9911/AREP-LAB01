package edu.escuelaing.arep.Implementation;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList extends AbstractSequentialList
implements List, Deque, Cloneable, Serializable{

	private Node head;
	private int size;
	
	public LinkedList(){
		head = new Node(null);
		size=0;
	}
	
	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return this.size;
	}

	public void addFirst(Object e) {
		Node newNode = new Node(e);
		Node temp = head;
		newNode.setNext((Node)temp.getData());
		head.setData(newNode);
		size ++;
	}

	public void addLast(Object e) {
		Node newNode = new Node(e);
		Node val = head;
		while(val.getNext()!=null) {
			val = val.getNext();
		}
		val.setNext(newNode);
		head.setNext(newNode);
		size ++;
	}

	public boolean offerFirst(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean offerLast(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object removeFirst() {
		if (head.getData() != null) {
			Node temp = (Node)head.getData();
			head.setData(temp.getNext());
			size--;
			return temp.getData();
		}
		return null;
	}

	public Object removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFirst() {
		return ((Node)head.getData()).getData();
	}

	public Object getLast() {
		return head.getNext().getData();
	}

	public Object peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object remove() {
		if (head.getData() != null) {
			Node temp = (Node)head.getData();
			head.setData(temp.getNext());
			size--;
			return temp.getData();
		}
		return null;
		
	}

	public Object poll() {
		if (head.getData() != null) {
			Node temp = (Node)head.getData();
			head.setData(temp.getNext());
			size--;
			return temp.getData();
		}
		return null;
	}

	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object peek() {
		if(head.getData()!=null) {
			return ((Node)head.getData()).getData();
		}
		return null;
	}

	public void push(Object e) {
		Node node = new Node(e);
		
		if(head.getData()==null) {
			head.setData(node);
		}else {
			Node val = (Node)this.head.getData();
			
			while(val.getNext()!=null) {
				val = val.getNext();
			}
			
			val.setNext(node);
		}
		head.setNext(node);
		size++;
	}

	public Object pop() {
		if (head.getData() != null) {
			Node val = (Node)this.head.getData();
			if(val.getNext()==null) {
				head.setData(null);
				head.setNext(null);
			}else {
				Node temp = null;
				while(val.getNext()!=null) {
					temp = val;
					val = val.getNext();
				}
				temp.setNext(null);
				head.setNext(temp);
			}
			size--;
			return val.getData();
		}
		return null;
	}

	public Iterator descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 public Object get(int index){
		if(index<size && index>=0) {
			int i;
			Node var = (Node)head.getData();
			for (i=0;i<index;i++) {
				var = var.getNext();
			}
			return var.getData();
		}
		return null;
		 
	 }
	
	
}
