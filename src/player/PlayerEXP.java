package player;

import file.SaveFile;

public class PlayerEXP {
	
	int level;
	double exp;
	
	public PlayerEXP(SaveFile f){
		if(f == null){
			// Create new
			
		} else{
			// Load from file
		}
	}
	
	public boolean addExp(double amount){
		exp+=amount;
		return checkForLevelUp();
	}
	
	public void addLevels(int amount){
		this.level += amount;
	}
	
	private boolean checkForLevelUp(){
		if(this.exp >= getExpToLevelUp(this.level)){
			this.level++;
			this.exp = 0;
			return true;
		}
		return false;
	}
	
	/*
	 * Maybe Tweak this
	 */
	private double getExpToLevelUp(int level){
		double amt = 500;
		double exponent = ((double) level - 1)/80 + 1;
		double longResult = Math.pow(amt, exponent);
		return Math.round(longResult * 100.0) / 100.0;
	}
}
