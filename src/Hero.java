/**
 * 
 * Classe Hero on s'estructura la generació d'herois del joc
 * 
 * @author Conrad Grau
 * @author Jonathan Sanchez
 * @author Adria Dumitrica
 * @author Cristian Rigau
 * 
 * @version 0.1
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
	 * Constructor de generació automàtica
	 *
	 * @param String Li passarem una cadena de caràcters que serà el nom de l'heroi
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

	/**
	 * Funció d'atac de l'heroi
	 * 
	 * @param Mob Mob al que ataquem
	 */
	public void attack(Mob mob) {
		mob.defend(((int) (Math.random() * getStrength() + 0)));

	}

	
	/**
	 * 
	 * Funció de defensa de l'heroi
	 * 
	 * @param int Valor numèric de mal
	 */
	public void defend(int damage) {
		// Restem la vida del heroi
		int dmg;
		dmg = damage - (int) (Math.random() * this.agility);

		if (dmg > 0) {
			if (this.hp < dmg) {
				System.out.println("Has perdut");
				this.hp = 0;

			} else {
				System.out.println("vida total heroi: " + this.hp);
				this.hp -= dmg;
				System.out.println("El monstre ha fet " + dmg + " mal");
				System.out.println("Al heroi li queda " + this.hp);
			}
		} else {
			System.out.println("vida total heroi: " + this.hp);
			System.out.println("El monstre ha fallat el cop");

		}
	}
	
	
/**
 * 
 * Funció de bùsqueda d'objectes de l'heroi
 * 
 * @return Item - Objecte que troba, si en troba :)
 */
	public Item loot() {
		Item objecte = new Item();
		Collections itms = new Collections();

		int itm;
		itm = (int) (Math.random() * 5);
		System.out.println(itm);

		int obj;
		obj = (int) (Math.random() * 2);
		System.out.println(obj);
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

	/**
	 * 
	 * Funció que comprova si l'heroi es mort
	 * 
	 * @param Hero
	 * @return Boolean - True si és mort i false si és viu
	 */
	public boolean die(Hero hero) {
		return hero.hp <= 0;
	}

	/**
	 * 
	 * Funció que retorna la vida de l'heroi
	 * 
	 * @return int - Vida de l'heroi
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * 
	 * Funció que assigna vida a l'heroi
	 * 
	 * @param int Vida a assignar
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * Funció que retorna la salut mental de l'horoi
	 * 
	 * @return int Retorna la salut mental de l'heroi
	 */
	public int getSp() {
		return sp;
	}

	/**
	 *  Funció que assigna la salut mental de l'heroi
	 *  
	 * @param int Assigna valor a la salut mental de l'heroi
	 */
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
