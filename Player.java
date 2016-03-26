package Main;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

public class Player {
	ArrayList<String> inventory = new ArrayList<String>();
	static int health = 100;
	Items items = new Items();

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
			inv = s;
		}
		return inv;
	}

	public void addItem(String item) {
		inventory.add(item + ", ");
	}

	public void playerAttack(String weapon) {
		if (Movement.map[Movement.y][Movement.x][0][0] != null) {
			if (weapon == "Butta knife" && Movement.map[Movement.y][Movement.x][0][0] == "M@ Klein") {
				if (Enemy.matt_Health - items.weaponDamage[0] <= 0) {
					Enemy.matt_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Butta knife" && Movement.map[Movement.y][Movement.x][0][0] == "N8 Baker") {
				if (Enemy.n8_Health - items.weaponDamage[0] <= 0) {
					Enemy.n8_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Butta knife" && Movement.map[Movement.y][Movement.x][0][0] == "AlekTheSoccerKid") {
				if (Enemy.alek_Health - items.weaponDamage[0] <= 0) {
					Enemy.alek_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Butta knife" && Movement.map[Movement.y][Movement.x][0][0] == "Cody Burrows") {
				if (Enemy.cody_Health - items.weaponDamage[0] <= 0) {
					Enemy.cody_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Butta knife" && Movement.map[Movement.y][Movement.x][0][0] == "Gene Petilli") {
				if (Enemy.petilli_Health - items.weaponDamage[0] <= 0) {
					Enemy.petilli_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Butta knife" && Movement.map[Movement.y][Movement.x][0][0] == "Pete Fleck") {
				if (Enemy.fleck_Health - items.weaponDamage[0] <= 0) {
					Enemy.fleck_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Sword" && Movement.map[Movement.y][Movement.x][0][0] == "M@ Klein") {
				if (Enemy.matt_Health - items.weaponDamage[0] <= 0) {
					Enemy.matt_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Sword" && Movement.map[Movement.y][Movement.x][0][0] == "N8 Baker") {
				if (Enemy.n8_Health - items.weaponDamage[0] <= 0) {
					Enemy.n8_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Sword" && Movement.map[Movement.y][Movement.x][0][0] == "AlekTheSoccerKid") {
				if (Enemy.alek_Health - items.weaponDamage[0] <= 0) {
					Enemy.alek_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Sword" && Movement.map[Movement.y][Movement.x][0][0] == "Cody Burrows") {
				if (Enemy.cody_Health - items.weaponDamage[0] <= 0) {
					Enemy.cody_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Sword" && Movement.map[Movement.y][Movement.x][0][0] == "Gene Petilli") {
				if (Enemy.petilli_Health - items.weaponDamage[0] <= 0) {
					Enemy.petilli_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			} else if (weapon == "Sword" && Movement.map[Movement.y][Movement.x][0][0] == "Pete Fleck") {
				if (Enemy.fleck_Health - items.weaponDamage[0] <= 0) {
					Enemy.fleck_Health = 0;
					Movement.map[Movement.y][Movement.x][0][0] = null;
				}
			}
		}
	}
}
