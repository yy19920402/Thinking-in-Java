package yangyi.tij.exercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GerbilMap {

	public static void main(String[] args) {
		HashMap<String,Gerbil> hashMap=new HashMap<String, Gerbil>();
		for(int i=0;i<5;i++){
			hashMap.put(i+"",new Gerbil(i));
		}
		Set<String> keySet=hashMap.keySet();
		Iterator<String> iterator=keySet.iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			System.out.println(key);
			hashMap.get(key).hop();
		}		
	}

}
