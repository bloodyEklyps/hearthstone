package test;


import cards.CardFactory;
import cards.minion.*;
import state.MinionAwakeState;
import state.MinionSleepState;

public class StateTest {

	public static void main(String[] args) {
		
		Minion c1 = (Minion)CardFactory.getCard("SanglierBrocheroc");
		System.out.println("minion created");
		System.out.println(c1);//Zz
		c1.attack(null);//can't attack
		
		System.out.println("---------------");
		
		c1.setState(new MinionAwakeState(c1));
		System.out.println("state changed");
		System.out.println(c1);//no Zz
		c1.attack(null);//attacking
		
		System.out.println("---------------");
		
		c1.setState(new MinionSleepState(c1));
		System.out.println("state changed");
		System.out.println(c1);//Zz
		c1.attack(null);//can't attack
	
	}

}
