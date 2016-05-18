package yangyi.tij.exercise;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {

	public static void main(String[] args) {
		Collection<Integer> c=new HashSet<Integer>();
		for(int i=0;i<5;i++){
			c.add(i);
		}
		for(Integer a:c){
			System.out.println(a);
		}

	}

}
