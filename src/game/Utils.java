package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
	
	public static int getInputInt(){
		Scanner in = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		String name = in.nextLine(); // Sca
		return Integer.parseInt(name);		
	}	
	
	public static String getInputString(){
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a name: ");
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
