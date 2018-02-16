package test;

import cards.minion.Minion;
import cards.minion.common.*;

public class StateTest {

	public static void main(String[] args) {
		
		Minion c1 = SanglierBrocheroc.createSanglierBrocheroc();
		System.out.println("minion created");
		System.out.println(c1);//Zz
		c1.attack(null);//can't attack
		
		System.out.println("---------------");
		
		c1.setStateToAwake();
		System.out.println("state changed");
		System.out.println(c1);//no Zz
		c1.attack(null);//attacking
		
		System.out.println("---------------");
		
		c1.setStateToSleep();
		System.out.println("state changed");
		System.out.println(c1);//Zz
		c1.attack(null);//can't attack
	
	}

}
