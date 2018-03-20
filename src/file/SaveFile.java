package file;

import java.io.File;

import player.PlayerClass;
import player.PlayerEXP;

public class SaveFile extends DataFile {

	public SaveFile(File f) {
		super(f);
		// TODO Auto-generated constructor stub
	}

	public String getPlayerName() {
		// TODO Auto-generated method stub
		return "Temporary Player Name";
	}

	public String getPlayerPrefix() {
		// TODO Auto-generated method stub
		return "Sir";
	}

	public String getPlayerSuffix() {
		// TODO Auto-generated method stub
		return "IV";
	}

	public PlayerClass getPlayerClass() {
		// TODO Auto-generated method stub
		return PlayerClass.ARCHER;
	}

	public InventoryFile getPlayerInventoryFile() {
		// TODO Auto-generated method stub
		return new InventoryFile(null);
	}

	public PlayerEXP getPlayerEXP() {
		// TODO Auto-generated method stub
		return new PlayerEXP(this);
	}
	
	

}
