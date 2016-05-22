package yangyi.tij.pokergame;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Poker implements Comparable<Poker>{
	
	private List<String> numbers=Arrays.asList("2","3","4","5","6","7","8","9","10",
			"J","Q","K","A");
	private List<String> colors=Arrays.asList("����","����","ӣ��","��Ƭ");
	
	private String number;
	private String color;
	
	public Poker(String number,String color) {
		if(numbers.contains(number)&&colors.contains(color)){
			this.number=number;
			this.color=color;
		}else{
			System.out.println("�ⲻ��һ�ű�׼�˿ˣ���������ȷ�Ĵ�С����A-K��,�Լ���ȷ�Ļ�ɫ����"
					+ "���ң����ң�ӣ������Ƭ��");
		}
	}

	public String getNumber() {
		return number;
	}

	public String getColor() {
		return color;
	}

	/*
	 * �Ƚ������˿˴�С
	 * */
	
	@Override
	public int compareTo(Poker o) {
		int thisNumber=numbers.indexOf(this.getNumber());
		int oNumber=numbers.indexOf(o.getNumber());
		int thisColor=numbers.indexOf(this.getColor());
		int oColor=numbers.indexOf(o.getColor());
		if(thisNumber!=oNumber){
			return thisNumber>oNumber?1:-1;
		}else{
			return thisColor<oColor?1:-1;
		}
	}
	
}
