package yangyi.tij.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListFeature {
	public static  void printPeople(Collection<People> collection){
		for(People people:collection){
			System.out.print(people.getId()+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		List<People> arrayList=new ArrayList<People>();
		for(int i=0;i<8;i++){
			arrayList.add(new People(i));
		}
		Iterator<People> peoples=arrayList.iterator();
		while(peoples.hasNext()){
			System.out.println(peoples.next().getId());
		}
		List<People> subList=arrayList.subList(4,6);
		System.out.println("我是subList：");
		printPeople(subList);
		System.out.println("我是移除subList前的arrayList：");
		printPeople(arrayList);
		arrayList.removeAll(subList);
		System.out.println("我是移除subList后的arrayList：");
		printPeople(arrayList);
		
		
		
	}
	
}
