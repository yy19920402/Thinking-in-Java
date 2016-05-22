package yangyi.tij.pokergame;

import java.util.List;
import java.util.Map;

public class Player {
	private String name;
	private int id;
	private List<Poker> myPokers;
	public Player() {
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public List<Poker> getMyPokers() {
		return myPokers;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMyPokers(List<Poker> myPokers) {
		this.myPokers = myPokers;
	}
	public Poker getMaxFlagsPoker(){
		return myPokers.get(myPokers.size()-1);
	}

	
}
