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
//		courseList.add(new Course("3","数学"));
//		Course a=new Course("5","体育");
//		courseList.add(a);
//		System.out.println(courseList.contains(a));
//		System.out.println(courseList.contains(new Course("3","数学")));
//		Course[] coursies={new Course("1","语文"),new Course("2","英语")};
		
//		Set<Course> courseSet=new LinkedHashSet<Course>();
//		courseSet.add(new Course("1","语文"));
//		System.out.println(courseSet.contains(new Course("1","语文")));
//		Course a=new Course("2","数学");
//		courseSet.add(a);
//		System.out.println(courseSet.contains(a));
		List<Course> courseList=new ArrayList<Course>();
		courseList.add(new Course("1","语文"));
		courseList.add(new Course("1","语文"));
		courseList.add(new Course("1","语文"));
		System.out.println(courseList.lastIndexOf(new Course("1","语文")));
		System.out.println(courseList.indexOf(new Course("1","语文")));
		/*
		 * 返回true，是因为indexOf内部是遍历list集合然后挨个调用对象的equal进行比较，我们重写了equal，
		 * 一旦name相同就返回true，但是没重写id
		 * */
		System.out.println(courseList.indexOf(new Course("2","语文")));
	
		System.out.println(courseList.indexOf(new Course("1","数额")));
//		Set<Course> courseSet=new HashSet<Course>();
//		courseSet.add(new Course("1","语文"));
//		courseSet.add(new Course("1","语文"));
//		courseSet.add(new Course("1","语文"));
//		courseSet.add(new Course("1","数学"));
//		Iterator<Course> iterator=courseSet.iterator();
//		while(iterator.hasNext()){
//			Course course=iterator.next();
//			System.out.println("这是set内的课程，id:"+course.id+",name为:"+course.name);
//		}
		
	}

}
