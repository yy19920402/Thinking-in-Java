package yangyi.tij.exercise;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorCollection {

	public static void iteratorC(Collection<People> collection){
		Iterator<People>iterator=collection.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().toString()+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Collection<People> arrayList=new ArrayList<People>();
		People.asList(10,arrayList);
		iteratorC(arrayList);
		Collection<People> linkedList=new LinkedList<People>();
		People.asList(12,linkedList);
		iteratorC(linkedList);
		Collection<People> hashSet=new HashSet<People>();
		People.asList(15,hashSet);
		iteratorC(hashSet);
	}

}
