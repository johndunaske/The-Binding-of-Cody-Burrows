package Main;

public class Enemy {
	MainClass main = new MainClass();
	Player plr = new Player();

	int[] damages = { 3, 5, 6, 0, 10, 15 };

	// ENEMIES
	int matt_Klein_ID = 0;
	int n8_Baker_ID = 1;
	int alek_soccer_ID = 2;
	int cody_Burrows_ID = 3;

	// BASE HEALTHS
	static int matt_BaseHeath = 10;
	static int n8_BaseHeath = 15;
	static int alek_BaseHeath = 17;
	static int cody_BaseHeath = 24;
	static int fleck_BaseHeath = 30;
	static int petilli_BaseHeath = 40;

	// ACTUAL HEALTHS
	static int matt_Health = 10;
	static int n8_Health = 15;
	static int alek_Health = 17;
	static int cody_Health = 24;
	static int fleck_Health = 30;
	static int petilli_Health = 40;

	// BOSSES:
	int Petilli_ID = damages.length;
	int Pete_Fleck_ID = damages.length - 1;

	public void attack(String name, int id) {
		main.writeString(name + "attacks you! Deals " + damages[id] + " damage!");
		if (plr.getHealth() - damages[id] <= 0) {
			plr.setHealth(0);
			main.writeString("You died... Petilli wins");
		} else {
			plr.setHealth(plr.getHealth() - damages[id]);
		}

	}

	// private String name;
	// private String[] attacks;
	// private int[] attackPower;
	// private int health;
	//
	// public Enemy(String name, String[] attacks, int[] attackPower, int heath)
	// {
	// this.name = name;
	// this.attacks = attacks;
	// this.attackPower = attackPower;
	// this.setHealth(heath);
	// }
	//
	// public int getAttackPower(int i) {
	// return attackPower[i];
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public String getAttacks(int i) {
	// return attacks[i];
	// }
	//
	// public int getHealth() {
	// return health;
	// }
	//
	// public void setHealth(int health) {
	// this.health = health;
	// }

}
