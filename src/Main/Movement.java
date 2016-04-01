package Main;

public class Movement {
	static int x = 0;
	static int y = 0;
	static boolean wrongWay = false;
	static String[][][][] map = { { { { null }, { "Butta knife" }, { "damp (aka moist)" } }, { { "M@ Klein" }, { null }, { "dusty, with a M@ Klein standing in the door" } }, { { null }, { "Milk" }, { "like a moist watermelon" } } }, { { { null }, { null }, { "quite dark, along the wall, there is a name written in blood... Petilli... you wonder what this holds for the future" } }, { { null }, { null }, { "just an empty room..." } }, { { "N8 Baker" }, { "Rope" }, { "filled with a strange substance on the ground... as well as there is a N8 Baker hanging from the ceiling.... its alive" } } },
			{ { { "Cody Burrows" }, { "Sword" }, { "lit by a candle. You see Cody Burrows tied up and bleeding out from his fingers... He looks like he has been typing... He whispers one word.... Gene." } }, { { null }, { "Medikit" }, { "bright enough for you to see decently" } }, { { "Gene Petilli" }, { null }, { "within this dark room, you see Gene Petilli, he's feasting on pedometers..." } } } };// {{{enemies},{items},{enviroType

	// (moist)}}}

	public static void updateMovement(String direction) {
		switch (direction) {

		case "forward":
			if (y + 1 > 2 || Movement.map[Movement.y][Movement.x][0][0] != null) {
				wrongWay = true;
				if (Movement.map[Movement.y][Movement.x][0][0] != null) {
					MainClass.writeString("There is an enemy blocking your path!");
					// Enemy.attack(Movement.map[Movement.y][Movement.x][0][0],
					// id);
					if (Movement.map[Movement.y][Movement.x][0][0] == "M@ Klein") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 0);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "N8 Baker") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 1);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "AlekTheSoccerKid") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 2);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Cody Burrows") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 3);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Gene Petilli") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 4);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Pete Fleck") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 5);
					}
				}
			} else {
				y++;
			}

			break;
		case "backward":
			if (y - 1 < 0 || Movement.map[Movement.y][Movement.x][0][0] != null) {
				wrongWay = true;
				if (Movement.map[Movement.y][Movement.x][0][0] != null) {
					MainClass.writeString("There is an enemy blocking your path!");
					// Enemy.attack(Movement.map[Movement.y][Movement.x][0][0],
					// id);
					if (Movement.map[Movement.y][Movement.x][0][0] == "M@ Klein") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 0);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "N8 Baker") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 1);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "AlekTheSoccerKid") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 2);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Cody Burrows") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 3);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Gene Petilli") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 4);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Pete Fleck") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 5);
					}
				}
			} else {
				y--;
			}
			break;
		case "right":
			if (x + 1 > 2 || Movement.map[Movement.y][Movement.x][0][0] != null) {
				System.out.println("U done screwed up");
				wrongWay = true;
				if (Movement.map[Movement.y][Movement.x][0][0] != null) {
					MainClass.writeString("There is an enemy blocking your path!");
					// Enemy.attack(Movement.map[Movement.y][Movement.x][0][0],
					// id);
					if (Movement.map[Movement.y][Movement.x][0][0] == "M@ Klein") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 0);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "N8 Baker") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 1);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "AlekTheSoccerKid") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 2);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Cody Burrows") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 3);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Gene Petilli") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 4);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Pete Fleck") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 5);
					}
				}
			} else {
				x++;
			}
			break;
		case "left":
			if (x - 1 < 0 || Movement.map[Movement.y][Movement.x][0][0] != null) {
				System.out.println("U done screwed up");
				wrongWay = true;
				if (Movement.map[Movement.y][Movement.x][0][0] != null) {
					MainClass.writeString("There is an enemy blocking your path!");
					// Enemy.attack(Movement.map[Movement.y][Movement.x][0][0],
					// id);
					if (Movement.map[Movement.y][Movement.x][0][0] == "M@ Klein") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 0);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "N8 Baker") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 1);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "AlekTheSoccerKid") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 2);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Cody Burrows") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 3);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Gene Petilli") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 4);
					} else if (Movement.map[Movement.y][Movement.x][0][0] == "Pete Fleck") {
						Enemy.attack(Movement.map[Movement.y][Movement.x][0][0], 5);
					}
				}
			} else {
				x--;
			}
			break;
		}

	}
}
