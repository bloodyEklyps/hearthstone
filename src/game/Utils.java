package game;

import java.util.ArrayList;

public class Utils {

	public static Targetable selectTarget(Player player, 
			Const.Targets type, Const.Side side){
				
		ArrayList<Targetable> list = listTargets(player, type, side);
		
		/* TODO ask user for int*/
		int choice = 0;
		
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
		
		ArrayList<Targetable> targetList = new ArrayList<Targetable>();
		
		switch(type){
		case MINIONS:
			targetList.addAll(player.getBoard().getTroops());
			break;
		case HEROS:
			targetList.add(player.getBoard().getHero());
			break;
		case CHARACTERS:
			targetList.addAll(player.getBoard().getTroops());
			targetList.add(player.getBoard().getHero());
			break;
		}
		return targetList;
	}
	
	
	
}
