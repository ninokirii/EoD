package engine;

import java.util.HashMap;

public class Hero extends Character{
	
	public static final int addItem = 1;
	public static final int removeItem = 2;
	public static final int upgradeItem = 3;
	
	public static final int head = 1;
	public static final int chest = 2;
	public static final int lefthand = 3;
	public static final int righthand = 4;
	public static final int feet = 5;
	public static final int twohands = 6;
	
	
	private HashMap<Integer,Weapon> weaponSlot;
	private HashMap<Integer,Item> itemSlot;
	
	private int HP;
	private int MP;
	
	private int PA;
	private int PD;
	private int MA;
	private int MD;
	

	public Hero(int id, String name, String description, HashMap<Integer,Weapon> weaponSlot, HashMap<Integer,Item> itemSlot, int hP,
			int mP, int pA, int pD, int mA, int mD) {
		super(id, name, description);
		this.weaponSlot = weaponSlot;
		this.itemSlot = itemSlot;
		HP = hP;
		MP = mP;
		PA = pA;
		PD = pD;
		MA = mA;
		MD = mD;
	}


	public HashMap<Integer,Weapon> getWeaponSlot() {
		
		return weaponSlot;
	}


	public void updateWeaponSlot(int slot, Weapon arme) {
		switch(arme.getType()){
		case "helmet": weaponSlot.put(head, arme); break;
		case "armor" : weaponSlot.put(chest, arme); break;
		case "shield" : weaponSlot.put(lefthand, arme);break;
		case "sword" : weaponSlot.put(righthand, arme);break;
		case "gloves" : weaponSlot.put(twohands, arme); break;
		case "shoes"  : weaponSlot.put(feet, arme); break;
		}
	}


	public HashMap<Integer, Item> getItemSlot() {
		return itemSlot;
	}


	public void setItemSlot(int slot, Item item) {
		if (itemSlot.isEmpty()){itemSlot.put(slot, item); }else{ System.out.println("Voulez-vous remplacer? O/n"); }
		}


	public int getHP() {
		return HP;
	}


	public void setHP(int hP) {
		HP = hP;
	}


	public int getMP() {
		return MP;
	}


	public void setMP(int mP) {
		MP = mP;
	}


	public int getPA() {
		return PA;
	}


	public void setPA(int pA) {
		PA = pA;
	}


	public int getPD() {
		return PD;
	}


	public void setPD(int pD) {
		PD = pD;
	}


	public int getMA() {
		return MA;
	}


	public void setMA(int mA) {
		MA = mA;
	}


	public int getMD() {
		return MD;
	}


	public void setMD(int mD) {
		MD = mD;
	}
	
	
}
