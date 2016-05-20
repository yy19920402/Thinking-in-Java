package yangyi.tij.exercise;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorCollection {

	public static void iteratorC(Collection<People> collection){
		Iterator<People>iterator=collection.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().toString()+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		Collection<People> arrayList=new ArrayList<People>();
//		People.asList(10,arrayList);
//		iteratorC(arrayList);
//		Collection<People> linkedList=new LinkedList<People>();
//		People.asList(12,linkedList);
//		iteratorC(linkedList);
//		Collection<People> hashSet=new HashSet<People>();
//		People.asList(15,hashSet);
//		iteratorC(hashSet);
//		List<Integer> first=new ArrayList<Integer>();
//		List<Integer>  second=new ArrayList<Integer>();
//		for(int i=1;i<8;i++){
//			first.add(i);
//		}
//		ListIterator listIterator=first.listIterator();
//		int firstSize=first.size();
//		while(listIterator.hasNext()){
//			second.add((Integer) listIterator.next());
//		}
//		for(int i=0;i<firstSize;i++){
//			System.out.print(second.set(firstSize-1-i,first.get(i))+" ,");
//		}
		LinkedList<Integer> linkedList2=new LinkedList<Integer>();
//		listIterator=linkedList2.listIterator();
		for(int i=0;i<5;i++){
			linkedList2.add(i);
		}
		System.out.print("ÕâÊÇlinkedList2:");

		for(Integer integer:linkedList2){
			System.out.print(integer+",");
		}
		System.out.println();
		System.out.println(linkedList2.peek());
		System.out.println(linkedList2.element());
		System.out.println(linkedList2.getFirst());
		System.out.println(linkedList2.poll());
		for(Integer integer:linkedList2){
			System.out.print(integer+",");
		}
		System.out.println(linkedList2.pop());
		for(Integer integer:linkedList2){
			System.out.print(integer+",");
			System.out.println();
		}
		Stack<String> stack=new Stack<String>();
		stack.push("U");
		stack.push("n");
		System.out.println(stack.pop());

	}

}
