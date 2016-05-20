package yangyi.tij.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.rmi.CORBA.Tie;

public class ImookList {

	List<Course> list=new ArrayList<Course>();
	public void addList(Course course){
		list.add(course);
	}
	public void addList(int index,Course course){
		list.add(index, course);
	}
	public void addAllList(Course[] coursies ){
		list.addAll(Arrays.asList(coursies));
	}
	public void addAllList(int index,Course[] coursies ){
		list.addAll(index,Arrays.asList(coursies));
	}
	public void foreach(){
		for(Course course:list){
			System.out.println("Id:"+course.id+",Name:"+course.name);
		}
	}
	public void iterator(){
		Iterator<Course> iterator=list.iterator();
		while(iterator.hasNext()){
			Course course=iterator.next();
			System.out.println("Id:"+course.id+",Name:"+course.name);
		}
	}
	public void set(int index,Course course){
		list.set(index, course);
	}
	public void remove(int index){
		list.remove(index);
	}
	public void remove(Course course){
		list.remove(course);
	}
	public void removeAll(Course[] coursies){
		list.removeAll(Arrays.asList(coursies));
	}
	public Course get(int index){
		return list.get(index);
	}
	
	public static void main(String[] args) {
		ImookList imookList=new ImookList();
		imookList.addList(new Course("2","数学"));
		imookList.addList(0,new Course("1","语文"));
		Course[] coursies1={new Course("4","生物"),new Course("5","化学"),new Course("6", "物理")};
		imookList.addAllList(coursies1);
		Course[] coursies2={new Course("3","英语")};
		imookList.addAllList(2, coursies2);
//		imookList.foreach();
		imookList.iterator();
		System.out.println("..................");
		imookList.set(5,new Course("6","历史"));
		imookList.iterator();
		System.out.println("..................");
//		imookList.remove(new Course("1","语文"));
		imookList.remove(0);
		//注：此处犯错是因为imookList的remove等各种方法仅针对自己已有对象，而此处new是一个新对象
//		Course[] coursies3={new Course("3","英语"),new Course("4","生物")};
		Course[] coursies3={imookList.get(3),imookList.get(4)};//应该这样写
		imookList.removeAll(coursies3);
		imookList.iterator();
	}

}
