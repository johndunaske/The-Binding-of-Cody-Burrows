package Main;

public class TextParsing {

	private final String[] verbs = { "take", "go", "attack", "inv", "search", "use", "save", "load" };
	private final String[] directions = { "forward", "backward", "left", "right" };
	Player player = new Player();
	Items itemsClass = new Items();
	MainClass main = new MainClass();

	public TextParsing() {

	}

	public void read(String line) {
		if (line.startsWith(verbs[0])) {
			if (line.endsWith("Medikit") || line.endsWith("Sword") || line.endsWith("Butta knife") || line.endsWith("Rope") || line.endsWith("Milk")) {
				Movement.map[Movement.y][Movement.x][1][0] = "";
				String[] itemArray = line.split("take ", line.length());
				player.addItem(itemArray[1]);
				main.writeString("You picked up: " + itemArray[1]);
			} else {
				main.writeString("That item isn't here!");
			}

		} else if (line.startsWith(verbs[1])) {
			for (String s : directions) {
				if (line.endsWith(s)) {
					if (Movement.wrongWay == false){
					Movement.updateMovement(s);
					String gitTexted = "\nYou move to a room. It is " + Movement.map[Movement.y][Movement.x][2][0];
					GameGUI.getGameText().append(gitTexted);
					} else {
						MainClass.writeString("You can't go that way!");
					}

				}
			}

		} else if (line.startsWith(verbs[2])) {
			String enemy1 = "";
			for (String s : itemsClass.weaponList) {
				if (line.endsWith(s)) {
					player.playerAttack(s);
				}
			}
		} else if (line.startsWith(verbs[3])) {
			GameGUI.getGameText().append("\nYour inventory: " + player.getInventory());
		} else if (line.startsWith(verbs[4])) {
			GameGUI.getGameText().append("\nItems in this room: " + Movement.map[Movement.y][Movement.x][1][0]);
		} else if (line.startsWith(verbs[5])) {

		} else if (line.startsWith(verbs[6])) {

		} else if (line.startsWith(verbs[7])) {

		} else {
			main.writeString("That is not a valid command!");
		}
	}

}
