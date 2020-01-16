/**
 * 
 * @author Conrad Grau
 * @author Jonathan Sanchez
 * @author Adria Dumitrica
 * @author Cristian Rigau
 * 
 * @version 0.1
 * 
 *          Classe Hero on s'estructura la generaci� d'herois del joc
 *
 */

public class Hero {
	private int hp;
	private int sp;
	private String name;
	private String role;
	private int strength;
	private int agility;
	private int observation;
	private int lore;
	private int influence;
	private int will;

	private final int MAX_VALUE = 4;
	private final String[] roles = { "Guerrero", "Mago", "Cazador" };

	/**
	 * Constructor de generaci� autom�tica
	 *
	 * @param String - Li passarem una cadena de car�cters que ser� el nom de l'heroi
	 *
	 */
	public Hero(String name) {
		super();
		this.name = name;
		this.hp = (int) (Math.random() * (MAX_VALUE)) + 8;
		System.out.println("Vida : " + this.getHp());
		this.sp = (int) (Math.random() * MAX_VALUE) + 4;
		this.role = this.roles[(int) (Math.random() * this.roles.length)];
		this.strength = (int) (Math.random() * MAX_VALUE) + 3;
		this.agility = (int) (Math.random() * MAX_VALUE) + 3;
		System.out.println("Agilitat : " + this.agility);
		this.observation = (int) (Math.random() * MAX_VALUE) + 3;
		this.lore = (int) (Math.random() * MAX_VALUE) + 3;
		this.influence = (int) (Math.random() * MAX_VALUE) + 3;
		this.will = (int) (Math.random() * MAX_VALUE) + 3;
	}

	/**
	 * Constructor amb atributs per par�metres
	 * 
	 * @param int, int, String, String,
	 */

//	public Hero(int hp, int sp, String name, String role, int strength, int agility, int observation, int lore,
//			int influence, int will) {
//		super();
//		this.hp = hp;
//		this.sp = sp;
//		this.name = name;
//		this.role = role;
//		this.strength = strength;
//		this.agility = agility;
//		this.observation = observation;
//		this.lore = lore;
//		this.influence = influence;
//		this.will = will;
//	}

	public void equipItem(Item item) {

	}

	public void useItem(Item item) {

	}

	public void dropItem(Item item) {

	}

	public void attack(Mob mob) {
		mob.defend(((int) (Math.random() * getStrength() + 0)));

	}

	public void defend(int damage) {
		// Restem la vida del heroi
		int dmg;
		dmg = damage - (int) (Math.random() * this.agility);

		if (dmg > 0) {
			if (this.hp < dmg) {
				this.hp = 0;
				die();

			} else {
				this.hp -= dmg;
			}
		}
	}

	public Item loot() {
		Item objecte = new Item();
		Collections itms = new Collections();

		int itm;
		itm = (int) (Math.random() * 5);

		int obj;
		obj = (int) (Math.random() * 2);
		switch (obj) {
		case 0:
			objecte = itms.getArmors(itm);
			break;
		case 1:
			objecte = itms.getPotions(itm);
			break;
		}

		return objecte;
	}

	public boolean die() {
		return hp <= 0;

	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getObservation() {
		return observation;
	}

	public void setObservation(int observation) {
		this.observation = observation;
	}

	public int getLore() {
		return lore;
	}

	public void setLore(int lore) {
		this.lore = lore;
	}

	public int getInfluence() {
		return influence;
	}

	public void setInfluence(int influence) {
		this.influence = influence;
	}

	public int getWill() {
		return will;
	}

	public void setWill(int will) {
		this.will = will;
	}
}
