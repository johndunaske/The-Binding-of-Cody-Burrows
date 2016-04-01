package Main;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

public class Player {
	ArrayList<String> inventory = new ArrayList<String>();
	static int health = 100;
	Items items = new Items();
	MainClass main = new MainClass();

	public Player() {

	}

	public static int getHealth() {
		return health;
	}

	public void setHealth(int health1) {
		health += health - health1;
	}

	public String getInventory() {
		String inv = "";
		for (String s : inventory) {
			inv = inv + s;
		}
		return inv;
	}

	public void addItem(String item) {
		inventory.add(item + ", ");
	}

	public void playerAttack(String weapon) {
		if (Movement.map[Movement.y][Movement.x][0][0] != null) {

			if (weapon == "Butta knife") {
				if (Movement.map[Movement.y][Movement.x][0][0] == "M@ Klein") {
					if (Enemy.healths[Enemy.matt_Klein_ID] - items.weaponDamage[0] <= 0) {
						Movement.map[Movement.y][Movement.x][0][0] = null;
						Enemy.healths[Enemy.matt_Klein_ID] = Enemy.matt_BaseHeath;
						main.writeString("You killed " + "M@ Klein");
					} else {
						Enemy.healths[Enemy.matt_Klein_ID] -= items.weaponDamage[0];
						main.writeString("You deal " + items.weaponDamage[0] + " to " + Movement.map[Movement.y][Movement.x][0][0]);
					}
				} else if (Movement.map[Movement.y][Movement.x][0][0] == "Cody Burrows") {
					if (Enemy.healths[Enemy.cody_Burrows_ID] - items.weaponDamage[0] <= 0) {
						Movement.map[Movement.y][Movement.x][0][0] = null;
						Enemy.healths[Enemy.cody_Burrows_ID] = Enemy.cody_BaseHeath;
						main.writeString("You killed "  + "Cody Burrows");
					} else {
						Enemy.healths[Enemy.cody_Burrows_ID] -= items.weaponDamage[0];
						main.writeString("You deal " + items.weaponDamage[0] + " to " + Movement.map[Movement.y][Movement.x][0][0]);
					}
				} else if (Movement.map[Movement.y][Movement.x][0][0] == "N8 Baker") {
					if (Enemy.healths[Enemy.n8_Baker_ID] - items.weaponDamage[0] <= 0) {
						Movement.map[Movement.y][Movement.x][0][0] = null;
						Enemy.healths[Enemy.n8_Baker_ID] = Enemy.n8_BaseHeath;
						main.writeString("You killed " + "N8 Baker");
					} else {
						Enemy.healths[Enemy.n8_Baker_ID] -= items.weaponDamage[0];
						main.writeString("You deal " + items.weaponDamage[0] + " to " + Movement.map[Movement.y][Movement.x][0][0]);
					}
				} else if (Movement.map[Movement.y][Movement.x][0][0] == "AlekTheSoccerKid") {
					if (Enemy.healths[Enemy.alek_soccer_ID] - items.weaponDamage[0] <= 0) {
						Movement.map[Movement.y][Movement.x][0][0] = null;
						Enemy.healths[Enemy.alek_soccer_ID] = Enemy.alek_BaseHeath;
						main.writeString("You killed " + "AlekTheSoccerKid");
					} else {
						Enemy.healths[Enemy.alek_soccer_ID] -= items.weaponDamage[0];
						main.writeString("You deal " + items.weaponDamage[0] + " to " + Movement.map[Movement.y][Movement.x][0][0]);
					}
				} else if (Movement.map[Movement.y][Movement.x][0][0] == "Gene Petilli") {
					if (Enemy.healths[Enemy.Petilli_ID] - items.weaponDamage[0] <= 0) {
						Movement.map[Movement.y][Movement.x][0][0] = null;
						Enemy.healths[Enemy.Petilli_ID] = Enemy.petilli_BaseHeath;
						main.writeString("You killed "  + "Gene Petilli");
					} else {
						Enemy.healths[Enemy.Petilli_ID] -= items.weaponDamage[0];
						main.writeString("You deal " + items.weaponDamage[0] + " to " + Movement.map[Movement.y][Movement.x][0][0]);
					}
				} else if (Movement.map[Movement.y][Movement.x][0][0] == "Pete Fleck") {
					if (Enemy.healths[Enemy.Pete_Fleck_ID] - items.weaponDamage[0] <= 0) {
						Movement.map[Movement.y][Movement.x][0][0] = null;
						Enemy.healths[Enemy.Pete_Fleck_ID] = Enemy.fleck_BaseHeath;
						main.writeString("You killed " + "Pete Fleck");
					} else {
						Enemy.healths[Enemy.Pete_Fleck_ID] -= items.weaponDamage[0];
						main.writeString("You deal " + items.weaponDamage[0] + " to " + Movement.map[Movement.y][Movement.x][0][0]);
					}
				}
			}
		}
	}
}
