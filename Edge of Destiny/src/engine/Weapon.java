package engine;

public class Weapon extends Item {
	private int PA;
	private int PD;
	private int MA;
	private int MD;
	private String type;
	
	


	public Weapon(int id, String name, String caption, String description, String element, int pA, int pD, int mA,
			int mD, String type) {
		super(id, name, caption, description, element);
		PA = pA;
		PD = pD;
		MA = mA;
		MD = mD;
		this.type = type;
	}
	
	public int getPA() {return PA;}
	public int getPD() {return PD;}
	public int getMA() {return MA;}
	public int getMD() {return MD;}
	public String getType() { return type;}
	
	public void weaponStatUp() {
		
	}
	
}
