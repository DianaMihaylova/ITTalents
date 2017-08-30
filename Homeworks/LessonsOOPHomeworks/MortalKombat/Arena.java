package mortalKombat;

import java.util.Random;

public class Arena {

	public static void main(String[] args) {
		
		Fighter scorpion = new Fighter("Scorpion");
		Fighter gor = new Fighter("Gor");
		
		int round = 1;
		
		System.out.println("================ Start Fight ================");
		System.out.println(scorpion.getName() + " health is " + scorpion.getHealth());
		System.out.println(gor.getName() + " health is " + gor.getHealth());
		
		while(true) {
			System.out.println("================ Round " + round + " ================");
			
			if (new Random().nextBoolean()) {
				if (fight(scorpion, gor)) {
					break;
				}
			} else {
				if (fight(gor, scorpion)) {
					break;
				}
			}
			round++;
		}		
	}

	private static boolean fight(Fighter p1, Fighter p2) {
			p1.hit(p2);
			if (p2.isDead()) {
				System.out.println(p1.getName() + " is Winner!");
				return true;
			} 
			p2.hit(p1);
			if (p1.isDead()) {
				System.out.println(p2.getName() + " is Winner!");
				return true;
			}
			return false;
	}
}
