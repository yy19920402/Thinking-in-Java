package yangyi.tij.pokergame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PlayGame {
	private Scanner scanner=new Scanner(System.in);
	private List<Poker> pokers=new ArrayList<Poker>();
	private List<Player> players=new ArrayList<Player>();
	private List<String> numbers=Arrays.asList("2","3","4","5","6","7","8","9","10",
			"J","Q","K","A");
	private List<String> colors=Arrays.asList("黑桃","红桃","樱花","方片");
	
	/*
	 * 填充52张扑克牌并打印
	 * */
	public void stuffPoker(){
		
		for(int nFlag=0;nFlag<numbers.size();nFlag++){
			for(int cFlags=0;cFlags<colors.size();cFlags++ ){
				pokers.add(new Poker(numbers.get(nFlag),colors.get(cFlags)));
			}
		}
		forPoker();
	}
	
	/*
	 * 创建玩家
	 * */
	public void createPlayer(){
		System.out.println("请输入玩家人数");
		int playerCount=scanner.nextInt();
		for(int i=1;i<=playerCount;i++){
			System.out.println("请输入第"+i+"位玩家的id和姓名:");
			System.out.println("请输入id");
			Player player=new Player();

			while(true){
				try {
					player.setId(scanner.nextInt());
					break;
				} catch (Exception e) {
					System.out.println("error:id输入有误，请输入正整数作为玩家id");
					System.out.println("请重新输入玩家id");
					//如果不重新复制清空scanner，则会直接调用上一次的nextInt();循环进入catch
					String clear=scanner.next();
					continue;
				}
			}
			
			System.out.println("请输入name");
			player.setName(scanner.next());
			players.add(player);
		}	
	}
	
	/*
	 * 进行游戏
	 * */
	public void play(){
		stuffPoker();
		System.out.println("**************************");
		System.out.println("开始洗牌");
		System.out.println("洗牌结束!");
		System.out.println("创建玩家");
		createPlayer();
		dealPoker();
		System.out.println("******开始发牌******");
		System.out.println("******发牌结束******");
		comparePokers();
	}
	
	/*
	 * 发牌给每个玩家
	 * 
	 * */
	public void dealPoker(){
		System.out.println("请输入单个玩家发牌数量");
		int phpNumbers=scanner.nextInt();//player have poker number
		Random random=new Random(25);
		
		for (Player player : players) {
			List<Poker> playerPokers =new ArrayList<Poker>();
			for(int i=0;i<phpNumbers;i++){
				//避免发牌重复
				Poker poker=pokers.get(random.nextInt(pokers.size()));
				pokers.remove(poker);
				playerPokers.add(poker);
				
			}
			Collections.sort(playerPokers);
			player.setMyPokers(playerPokers);
		}
	}
	/*
	 * 比较双方牌大小
	 * */
	public void comparePokers(){
		for(Player player:players){
			String number=player.getMaxFlagsPoker().getNumber();
			String color=player.getMaxFlagsPoker().getColor();
			System.out.println("玩家"+player.getName()+"的最大手牌为:"+color+number);
		}
		Player playerMax=players.get(0);
		for(int i=1;i<players.size();i++){
			Player player=players.get(i);
			Poker playerPoker=player.getMaxFlagsPoker();
			Poker maxPoker=playerMax.getMaxFlagsPoker();
			if(playerPoker.compareTo(maxPoker)>0){
				playerMax=player;
			}
		}
		System.out.println("******玩家"+playerMax.getName()+"获胜******");
		for (Player player : players) {
			List<Poker> playerPokers=player.getMyPokers();
			System.out.print("玩家"+player.getName()+"的手牌为:【");
			for(Poker poker:playerPokers){
				System.out.print(poker.getColor()+poker.getNumber()+",");
			}
			System.out.println("】");
		}
	}
	
	
	private void forPoker(){
		System.out.print("生成扑克牌：【");
		for (Poker poker : pokers) {
			System.out.print(poker.getColor()+poker.getNumber()+",");
		}
		System.out.println("】");
	}
	
}
