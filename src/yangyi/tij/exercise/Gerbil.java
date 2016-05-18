package yangyi.tij.exercise;

import java.util.ArrayList;

public class Gerbil {

	int gerbilNumber;
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber=gerbilNumber;
	}
	public void hop(){
		System.out.println("沙鼠编号为："+gerbilNumber+"，它正在跳跃中");
	}
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils=new ArrayList<Gerbil>();
		for(int i=0;i<5;i++){
			gerbils.add(new Gerbil(i));
		}
		for(int i=0;i<gerbils.size();i++){
			gerbils.get(i).hop();
		}
	}

}
