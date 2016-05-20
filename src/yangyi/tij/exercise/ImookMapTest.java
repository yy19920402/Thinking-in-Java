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
		System.out.println("��ӭ����γ�¼��ϵͳ��������γ�id�������˳�������-1");
		String inputFirst=input.next();
		while(!inputFirst.equals("-1")){
			String id=inputFirst;
			Course course=coursies.get(id);
			if(course==null){
				System.out.println("������γ�name:");
				String name=input.next();
				coursies.put(id,new Course(id, name));
				System.out.println("�Ѵ���γ�id:"+id+",name:"+name);
				System.out.println("���������γ�id:");
			}else{
				System.out.println("�˿γ�id�Ѵ��ڣ�����������γ�id");
			}
			inputFirst=input.next();
		}
		System.out.println("���ѳɹ��˳��γ�¼��ϵͳ");

	}
	
	public void remove(){
		System.out.println("��ӭ����γ�ɾ��ϵͳ����������Ҫɾ���Ŀγ�id�������˳�������-1");
		String inputFirst=input.next();
		while(!inputFirst.equals("-1")){
			if(coursies.get(inputFirst)!=null){
				System.out.println("�ѳɹ��Ƴ��γ�id:"+inputFirst+":"+coursies.get(inputFirst).name);
				boolean a=coursies.remove(inputFirst,coursies.get(inputFirst).name);//�˷����������Ƴ�Map��������
				coursies.remove(inputFirst);
				
				
				System.out.println("������booleanɾ����"+a);
				if(coursies.size()==0){
					System.out.println("��ɾ�����пγ̣��˳�ɾ������");
				}else{
					System.out.println("�����������Ҫ�Ƴ��Ŀγ�id��");
				}
			}else{
				System.out.println("�ÿγ̲������ڣ������������γ�id");
			}
			if(coursies.size()==0){
				break;
			}
			inputFirst=input.next();
			
		}
		System.out.println("���ѳɹ��˳��γ�ɾ��ϵͳ");
	} 
	
	public static void main(String[] args) {
		ImookMapTest test=new ImookMapTest();
		test.add();
		test.remove();

	}

}
