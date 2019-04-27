package eg.edu.alexu.csd.datastructure.stack.cs41;

public class implement implements IStack {
	
	node top;
	int size;
	
	/**
	* Set the top =null and size =0 indicating that the stack is empty at the start.
	*
	* 
	*/
	public implement (){
		top=null;
		size =0;
		
	}
	
	/**
	* Removes the object at top of stack and returns that object .
	*
	* @return the top of stack object, or through exception if the stack is empty
	*/
	
	public Object pop()   {
		if(isEmpty()) {
			
				try {
					throw new Exception(" Stack is empty.");
				} catch (Exception e) {
					
				}							
		}
		
		Object temp=top.getValue();
		top=top.getNext();
		size--;
		return temp;
		
	}
	
	/**
	* Get the object at  top of stack without removing it from the stack.
	*
	* @return top of stack object, or through exception if the stack is empty
	*/
	
	
	public Object peek()   {
		if(isEmpty()) {
					try {
						throw new Exception(" Stack is empty.");
					} catch (Exception e) {
					
					}			
			
		}
		return top.getValue();
		
	}
	
	
	/**
	* Pushes an element onto the top of the stack.
	*
	* @param object
	* to insert
	*/
	
	
	public void push(Object element) {
		
		node x = new node(element , top);
		top=x;
		size++;
	}
	public void print() {
		node q=top;
		while(q!=null) {
			System.out.println(q.getValue());
			q=q.getNext();
			
		}
	}
	
	
	
	/**
	* Tests if the stack is empty or not
	*
	* @return true if stack empty , false if the stack is not empty
	*/
	public boolean isEmpty() {
		
		if(top==null) {
			return true;
		}
		return false ;
	}
	
	
	
	/**
	* Returns the number of elements in the stack.
	*
	* @return number of elements in the stack
	*/
	
	public int size() {
		return size;
	}
	
	

private class node {
	
	node top;
	node next;
	Object value;
	
	/**
	* creates a new node with the given value and the given address of the next to it.
	*
	* @param object (value of the node)
	* @param node(pointer to the next node of current node)
	*/
	public node(Object val , node r) {
		this.value=val;
		this.next=r;
		
	}
	
	/**
	* get the value in this node (Data field).
	*
	* @return the value in the node
	*/
	
	public Object getValue() {
		return value ;		
	}
	
	
	/**
	* get the address of the next node to current node ,or get a pointer to next node
	*
	* @return pointer to next node
	*/
	
	public node getNext() {
		return next ;
	}
	
	/**
	* Set a new value to the node.
	*
	* @param object (the new value)
	*/
	public void setvalue(Object k) {
		value=k;
	}
	
	
	/**
	* Set a new addres of the next node to current node  
	*
	* @param node (parameter to the new next node)
	* to insert
	*/
	public void setnext(node w) {
		next = w;
	}

}

}




