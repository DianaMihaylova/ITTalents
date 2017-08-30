package mortalKombat;

import java.util.Random;

public class Fighter {
	
	private final String name;
	private int health = 100;
	private int dmg = 5;
	private int block = 20;
	private int dodge = 10;
	
	public Fighter(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Subziro";
		}
	}
	
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}
	
	public int getDmg() {
		return dmg;
	}
	
	public void hit(Fighter enemy) {
		if (new Random().nextInt(100) < enemy.dodge) {
			System.out.println(this.name + " hit " + enemy.name + ". " + enemy.name + " dodge the hit and his health is " + enemy.health);
		} else {
			if (new Random().nextInt(100) < enemy.block) {
				enemy.health -= this.dmg / 2;
				System.out.println(this.name + " hit " + enemy.name + ". " + enemy.name + " block the hit and his health is " + enemy.health);
			} else {
				enemy.health -= this.dmg;
				System.out.println(this.name + " hit " + enemy.name + " and his health is " + enemy.health);
			}
		}
	}

	public boolean isDead() {
		return health <= 0;
	}
}
