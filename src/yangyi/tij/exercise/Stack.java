package yangyi.tij.exercise;

import java.util.LinkedList;

public class Stack<T> {

	private LinkedList<T> linkedList=new LinkedList<T>();
	
	public T pop(){
		return linkedList.removeFirst();
	}
	public void push(T t){
		linkedList.add(t);
	}
	public T seek(){
		return linkedList.peek();
	}
	public boolean empty(){
		return linkedList.isEmpty();
	}
	public String toString(){
		return linkedList.toString();
	}
}
