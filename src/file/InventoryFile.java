package file;

import java.io.File;

import player.Inventory;

public class InventoryFile extends DataFile {

	public InventoryFile(File f) {
		super(f);
		// TODO Auto-generated constructor stub
	}
	
	public Inventory getPlayerInventory(){
		return new Inventory(this);
	}

}
