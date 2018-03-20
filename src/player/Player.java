package player;

import file.SaveFile;

public class Player {

	Inventory playerInventory;
	PlayerEXP playerEXP;

	int health, maxHealth;
	int mana, maxMana;

	PlayerClass playerClass;

	String playerName, playerPrefix, playerSuffix;

	public Player(SaveFile file) {

		if (file == null) {
			// New Character
			createPlayer();
		} else {
			// Load from file
		}

	}
	
	private void loadPlayerFromFile(SaveFile file){
		
		this.playerName = file.getPlayerName();
		this.playerPrefix = file.getPlayerPrefix();
		this.playerSuffix = file.getPlayerSuffix();
		
		this.playerClass = file.getPlayerClass();
		
		this.playerInventory = file.getPlayerInventoryFile().getPlayerInventory();
		this.playerEXP = file.getPlayerEXP();
	}

	private void createPlayer() {

		String playerName = PlayerUtil.getInput("Enter your name:", "Are you sure you want the name: ", true);
		PlayerClass playerClass = PlayerUtil.createPlayerClass();

		this.playerName = playerName;
		this.playerClass = playerClass;
		
		this.playerInventory = new Inventory(null);
		this.playerEXP = new PlayerEXP(null);

	}

	public Inventory getInventory() {
		return this.playerInventory;
	}

	public PlayerClass getPlayerClass() {
		return this.playerClass;
	}

	public String[] getPlayerTitle() {

		String[] str = { this.playerPrefix, this.playerName, this.playerSuffix };
		return str;

	}

	public String getPlayerName() {
		return this.playerName;
	}
	
	

}
