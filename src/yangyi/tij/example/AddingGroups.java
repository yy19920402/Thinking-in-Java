package yangyi.tij.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts={6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
//		for(int i=0;i<collection.size();i++){
//			System.out.println(((ArrayList<Integer>) collection).get(i));
//		}
		Collections.addAll(collection,11,12,13,14,15);
		Collections.addAll(collection,moreInts);
		collection.add(99);
		
//		for(int i=0;i<collection.size();i++){
//			System.out.println(((ArrayList<Integer>) collection).get(i));
//		}
		List<Integer>a=new ArrayList<Integer>();
		List <Integer> list=Arrays.asList(16,17,18,19,20);
		a.addAll(list);
		list.set(1,99);//set(arg0,arg1)��һ���������±꣬�ڶ��������Ǹı�ֵ
		a.add(999);
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		//Arrays.asList�ײ��ʾ�������飬���Բ��ܶ�����гߴ������
	}

}
