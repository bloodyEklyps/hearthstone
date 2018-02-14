package game;

import java.util.ArrayList;
import java.util.Scanner;

import cards.minion.common.Minion;
import cards.minion.common.TauntMinion;

public class Utils {

	public static int getInputInt(){
		
		int number=-1;
		do{
			Scanner in = new Scanner(System.in); // Reading from System.in
			String name = in.nextLine(); // Sca
			try{
				number=Integer.parseInt(name);
			}catch(Exception e){
				System.out.println("Entrez un entier!!!!");
			}
		}while(number<0);

		return number;		
	}	

	public static String getInputString(){
		Scanner reader = new Scanner(System.in); // Reading from System.in
		return reader.nextLine(); // Scans the next token of the input as an int.
	}

	public static Targetable selectTarget(Player player, 
			Const.Targets type, Const.Side side){

		ArrayList<Targetable> list = listTargets(player, type, side);
		
		for(int i=0;i<list.size();i++){
			System.out.println(i+" - "+list.get(i));
		}
		int choice = getInputInt();

		return list.get(choice);
	}


	public static ArrayList<Targetable> listTargets(Player player, 
			Const.Targets type, Const.Side side){

		ArrayList<Targetable> targetList = new ArrayList<Targetable>();

		switch(side){
		case ENEMIES:
			targetList.addAll(listTargetsByType(Game.getEnnemy(player),type));
			break;

		case ALLIES:
			targetList.addAll(listTargetsByType(player,type));
			break;

		case ALL:
			targetList.addAll(listTargetsByType(Game.getEnnemy(player),type));
			targetList.addAll(listTargetsByType(player,type));
			break;
		}

		return targetList;
	}

	private static ArrayList<Targetable> listTargetsByType
	(Player player, Const.Targets type){
		ArrayList<Targetable> targetListTaunt = new ArrayList<Targetable>();
		ArrayList<Targetable> targetList = new ArrayList<Targetable>();

		switch(type){
		case MINIONS:
			targetList.addAll(player.getBoard().getTroops());
			for(Minion c: player.getBoard().getTroops()) {
				if(c instanceof TauntMinion) {
					targetList.removeAll(targetList);
					targetListTaunt.add(c);
				}
			}
			targetList.addAll(targetListTaunt);
			break;
		case HEROS:
			targetList.add(player.getBoard().getHero());
			break;
		case CHARACTERS:
			
			targetList.addAll(player.getBoard().getTroops());
			targetList.add(player.getBoard().getHero());
			for(Minion c: player.getBoard().getTroops()) {
				if(c instanceof TauntMinion) {
					targetList.removeAll(targetList);
					targetListTaunt.add(c);
				}
			}
			targetList.addAll(targetListTaunt);
			
			break;
		}
		return targetList;
	}



}
