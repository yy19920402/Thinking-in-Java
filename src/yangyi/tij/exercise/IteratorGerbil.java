package yangyi.tij.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorGerbil {

	int gerbilNumber;
	public IteratorGerbil(int gerbilNumber) {
		this.gerbilNumber=gerbilNumber;
	}
	public void hop(){
		System.out.println("沙鼠编号为："+gerbilNumber+"，它正在跳跃中");
	}
	public static void main(String[] args) {
		ArrayList<IteratorGerbil> gerbils=new ArrayList<IteratorGerbil>();
		for(int i=0;i<5;i++){
			gerbils.add(new IteratorGerbil(i));
		}
		Iterator<IteratorGerbil> iterator=gerbils.iterator();
		while(iterator.hasNext()){
			iterator.next().hop();
		}
	}

}
