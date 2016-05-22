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
	private List<String> colors=Arrays.asList("����","����","ӣ��","��Ƭ");
	
	/*
	 * ���52���˿��Ʋ���ӡ
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
	 * �������
	 * */
	public void createPlayer(){
		System.out.println("�������������");
		int playerCount=scanner.nextInt();
		for(int i=1;i<=playerCount;i++){
			System.out.println("�������"+i+"λ��ҵ�id������:");
			System.out.println("������id");
			Player player=new Player();

			while(true){
				try {
					player.setId(scanner.nextInt());
					break;
				} catch (Exception e) {
					System.out.println("error:id����������������������Ϊ���id");
					System.out.println("�������������id");
					//��������¸������scanner�����ֱ�ӵ�����һ�ε�nextInt();ѭ������catch
					String clear=scanner.next();
					continue;
				}
			}
			
			System.out.println("������name");
			player.setName(scanner.next());
			players.add(player);
		}	
	}
	
	/*
	 * ������Ϸ
	 * */
	public void play(){
		stuffPoker();
		System.out.println("**************************");
		System.out.println("��ʼϴ��");
		System.out.println("ϴ�ƽ���!");
		System.out.println("�������");
		createPlayer();
		dealPoker();
		System.out.println("******��ʼ����******");
		System.out.println("******���ƽ���******");
		comparePokers();
	}
	
	/*
	 * ���Ƹ�ÿ�����
	 * 
	 * */
	public void dealPoker(){
		System.out.println("�����뵥����ҷ�������");
		int phpNumbers=scanner.nextInt();//player have poker number
		Random random=new Random(25);
		
		for (Player player : players) {
			List<Poker> playerPokers =new ArrayList<Poker>();
			for(int i=0;i<phpNumbers;i++){
				//���ⷢ���ظ�
				Poker poker=pokers.get(random.nextInt(pokers.size()));
				pokers.remove(poker);
				playerPokers.add(poker);
				
			}
			Collections.sort(playerPokers);
			player.setMyPokers(playerPokers);
		}
	}
	/*
	 * �Ƚ�˫���ƴ�С
	 * */
	public void comparePokers(){
		for(Player player:players){
			String number=player.getMaxFlagsPoker().getNumber();
			String color=player.getMaxFlagsPoker().getColor();
			System.out.println("���"+player.getName()+"���������Ϊ:"+color+number);
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
		System.out.println("******���"+playerMax.getName()+"��ʤ******");
		for (Player player : players) {
			List<Poker> playerPokers=player.getMyPokers();
			System.out.print("���"+player.getName()+"������Ϊ:��");
			for(Poker poker:playerPokers){
				System.out.print(poker.getColor()+poker.getNumber()+",");
			}
			System.out.println("��");
		}
	}
	
	
	private void forPoker(){
		System.out.print("�����˿��ƣ���");
		for (Poker poker : pokers) {
			System.out.print(poker.getColor()+poker.getNumber()+",");
		}
		System.out.println("��");
	}
	
}
