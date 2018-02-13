package test;

import cards.WarriorCardFactory;
import cards.minion.common.*;

public class DecoratorTest {

	public static void main(String[] args){
		
		//Charge-----------------------
		Minion c1 = (Minion)WarriorCardFactory.getCard("SanglierBrocheroc");
		
		System.out.println(c1);// Zz.
		c1.attack(null);//can't attack = ok
		
		c1 = new ChargeMinion(c1);
		System.out.println(c1); //no Zz.
		c1.attack(null); //attacking = ok
		
		//2nd test with factory---------
		
		System.out.println("--------------");
		Minion c2 = (Minion)WarriorCardFactory.getCard("ChevaucheurDeLoup");
		c2.attack(null); //attacking = ok
		
		//LifeSteal-----------------------
		
		System.out.println("--------------");
		
		c1 = new LifeStealMinion(c1);
		c1.attack(null);// attacking + heal hero = ok
		
		

		
		
		
	}
}
