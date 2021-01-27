package edu.escuelaing.arep.Implementation;

public class Node {

	private Object data;
	private Node next;
	
	public Node(Object data) {
		this.data = data;
		this.next = null;
	}
	
	/**
	 * This method is used to return the node data
	 * @return This returns the node data
	 */
	public Object getData() {
		return data;
	}
	
	/**
	 * This method is used to put the node data
	 * @param data
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	/**
	 * This method is used to return the node next
	 * @return This returns the node next
	 */
	public Node getNext() {
		return next;
	}
	

	/**
	 * This method is used to put the node next
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}
