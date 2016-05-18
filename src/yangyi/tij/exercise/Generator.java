package yangyi.tij.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Generator {

	public static String next(int number){
		String movieName="";
		switch(number){
		case 0:
			movieName="Snow";
			break;
		case 1:
			movieName="White";
			break;
		case 2:
			movieName="Star";
			break;
		case 3:
			movieName="Wars";
			break;
		case 4:
			movieName="YangYi";
			break;
		}
		return movieName;
	}
	public static Collection stuff(Collection<String>collection,int number){
		if(number<5){
			for(int i=0;i<number;i++){
				collection.add(next(i));
			}
		}else{
			int forNumber=number/5;
			int remain=number%5;
			for(int x=0;x<forNumber;x++){
				for(int y=0;y<5;y++){
					collection.add(next(y));
				}
			}
			for(int z=1;z<=remain;z++){
				collection.add(next(z-1));
			}

		}

		return collection;
	}
	public static void main(String[] args) {
		String[] array={next(1),next(2),next(3),next(4),next(5)};
		System.out.println(array);
		Collection<String> arrayList=new ArrayList<String>();
		stuff(arrayList,11);
		System.out.println("我是ArrayList集合"+arrayList);
		Collection<String> linkedList=new LinkedList<String>();
		stuff(linkedList,11);
		System.out.println("我是LinkedList集合"+linkedList);
		Collection<String> hashSet=new HashSet<String>();
		stuff(hashSet,11);
		System.out.println("我是HashSet集合"+hashSet);
		Collection<String> linkedHashSet=new LinkedHashSet<String>();
		stuff(linkedHashSet,11);
		System.out.println("我是LinkedHashSet集合"+linkedHashSet);
		Collection<String> treeSet=new TreeSet<String>();
		stuff(treeSet,11);
		System.out.println("我是TreeSet集合"+treeSet);
	}

}


