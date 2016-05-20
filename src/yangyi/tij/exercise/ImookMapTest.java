package yangyi.tij.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ImookMapTest {

	private Scanner input=new Scanner(System.in);
	
	Map<String,Course> coursies;
	public ImookMapTest() {
		coursies=new HashMap<String, Course>();
	}
	
	public void add(){
		System.out.println("欢迎进入课程录入系统，请输入课程id，如需退出请输入-1");
		String inputFirst=input.next();
		while(!inputFirst.equals("-1")){
			String id=inputFirst;
			Course course=coursies.get(id);
			if(course==null){
				System.out.println("请输入课程name:");
				String name=input.next();
				coursies.put(id,new Course(id, name));
				System.out.println("已存入课程id:"+id+",name:"+name);
				System.out.println("请继续输入课程id:");
			}else{
				System.out.println("此课程id已存在，请另外输出课程id");
			}
			inputFirst=input.next();
		}
		System.out.println("您已成功退出课程录入系统");

	}
	
	public void remove(){
		System.out.println("欢迎进入课程删除系统，请输入您要删除的课程id，如需退出请输入-1");
		String inputFirst=input.next();
		while(!inputFirst.equals("-1")){
			if(coursies.get(inputFirst)!=null){
				System.out.println("已成功移除课程id:"+inputFirst+":"+coursies.get(inputFirst).name);
				boolean a=coursies.remove(inputFirst,coursies.get(inputFirst).name);//此方法并不能移除Map集合数据
				coursies.remove(inputFirst);
				
				
				System.out.println("是依靠boolean删除的"+a);
				if(coursies.size()==0){
					System.out.println("已删除所有课程，退出删除程序");
				}else{
					System.out.println("请继续输入需要移除的课程id：");
				}
			}else{
				System.out.println("该课程并不存在，请输入其它课程id");
			}
			if(coursies.size()==0){
				break;
			}
			inputFirst=input.next();
			
		}
		System.out.println("您已成功退出课程删除系统");
	} 
	
	public static void main(String[] args) {
		ImookMapTest test=new ImookMapTest();
		test.add();
		test.remove();

	}

}
