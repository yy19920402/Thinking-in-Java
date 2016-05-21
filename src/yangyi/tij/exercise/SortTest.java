package yangyi.tij.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SortTest {
	List<String> arrayList=new ArrayList<String>();
	public void add(){
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(0,"a");
		map.put(1,"b");
		map.put(2,"c");
		map.put(3,"d");
		map.put(4,"e");
		map.put(5,"f");
		System.out.println("正在添加十个随机字符串...");
		Random random=new Random();
		StringBuilder stringBuilder;
		
		for(int i=0;i<10;i++){
			int lengthString;
			do{
				lengthString=random.nextInt(10);
			}while(lengthString==0);
			stringBuilder=new StringBuilder();
			for(int x=0;x<lengthString;x++){
				stringBuilder.append(map.get(random.nextInt(6)));
			}
			String content=stringBuilder.toString();
			arrayList.add(content);
		}
	}
	public void forEach(){
		for(String content:arrayList){
			System.out.println(content);
		}
	}
	
	public void sortForEach(){
		Collections.sort(arrayList);
		for(String content:arrayList){
			System.out.println(content);
		}
	}
	public static void main(String[] args) {
		
		SortTest test=new SortTest();
		test.add();
	    System.out.println("sort前输出:");
	    test.forEach();
	    System.out.println("sort后输出:");
	    test.sortForEach();
	}

}
