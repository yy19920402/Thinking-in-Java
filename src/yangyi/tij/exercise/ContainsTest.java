package yangyi.tij.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ContainsTest {

	public static void main(String[] args) {
//		List<String> list=new ArrayList<String>();
//		String[] names={"a","b","c","d","e","f"};
//		List<String> namesList=Arrays.asList(names);
//		list.add("1");
//		list.add("2");
//		list.addAll(namesList);
//		System.out.println(list.contains("1"));
//		System.out.println(list.containsAll(namesList));
//		System.out.println("************************");
//		List<Course> courseList=new ArrayList<Course>();
//		courseList.add(new Course("3","��ѧ"));
//		Course a=new Course("5","����");
//		courseList.add(a);
//		System.out.println(courseList.contains(a));
//		System.out.println(courseList.contains(new Course("3","��ѧ")));
//		Course[] coursies={new Course("1","����"),new Course("2","Ӣ��")};
		
//		Set<Course> courseSet=new LinkedHashSet<Course>();
//		courseSet.add(new Course("1","����"));
//		System.out.println(courseSet.contains(new Course("1","����")));
//		Course a=new Course("2","��ѧ");
//		courseSet.add(a);
//		System.out.println(courseSet.contains(a));
		List<Course> courseList=new ArrayList<Course>();
		courseList.add(new Course("1","����"));
		courseList.add(new Course("1","����"));
		courseList.add(new Course("1","����"));
		System.out.println(courseList.lastIndexOf(new Course("1","����")));
		System.out.println(courseList.indexOf(new Course("1","����")));
		/*
		 * ����true������ΪindexOf�ڲ��Ǳ���list����Ȼ�󰤸����ö����equal���бȽϣ�������д��equal��
		 * һ��name��ͬ�ͷ���true������û��дid
		 * */
		System.out.println(courseList.indexOf(new Course("2","����")));
	
		System.out.println(courseList.indexOf(new Course("1","����")));
//		Set<Course> courseSet=new HashSet<Course>();
//		courseSet.add(new Course("1","����"));
//		courseSet.add(new Course("1","����"));
//		courseSet.add(new Course("1","����"));
//		courseSet.add(new Course("1","��ѧ"));
//		Iterator<Course> iterator=courseSet.iterator();
//		while(iterator.hasNext()){
//			Course course=iterator.next();
//			System.out.println("����set�ڵĿγ̣�id:"+course.id+",nameΪ:"+course.name);
//		}
		
	}

}
