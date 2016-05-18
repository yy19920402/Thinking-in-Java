package yangyi.tij.exercise;

import java.util.Collection;

public class People {
//	private static Collection<People> collection;
	private int id;
	public People(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		String speak="我的身份证id是"+id;
		return speak;
	}
	public static Collection<People> asList(int number,Collection<People> collection){
		for(int i=0;i<number;i++){
			collection.add(new People(i));
		}
		return collection;
	}
}
