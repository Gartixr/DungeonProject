
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
	
	private Item mDreta;
	private Item mEsquerra;
	private Item armadura;
	
	private final int MAX_VALUE = 10;
	private final String[] roles = {"Guerrero", "Mago", "Cazador"};

//	Constructor de generació automàtica
	public Hero(String name) {
		super();
		this.name = name;
		this.hp = (int) (Math.random() * (MAX_VALUE + 2) + 8);
		this.sp = (int) (Math.random() * MAX_VALUE + 7);
		this.role = this.roles[(int)(Math.random() * this.roles.length)];
		this.strength = (int) (Math.random() * MAX_VALUE + 3);
		this.agility = (int) (Math.random() * MAX_VALUE + 3);
		this.observation = (int) (Math.random() * MAX_VALUE + 3);
		this.lore = (int) (Math.random() * MAX_VALUE + 3);
		this.influence = (int) (Math.random() * MAX_VALUE + 3);
		this.will = (int) (Math.random() * MAX_VALUE + 3);
	}

//	Constructor amb atributs per paràmetres
	public Hero(int hp, int sp, String name, String role, int strength, int agility, int observation, int lore,
			int influence, int will) {
		super();
		this.hp = hp;
		this.sp = sp;
		this.name = name;
		this.role = role;
		this.strength = strength;
		this.agility = agility;
		this.observation = observation;
		this.lore = lore;
		this.influence = influence;
		this.will = will;
	}

	public void equipItem(Item item) {

	}

	public void useItem(Item item) {

	}

	public void dropItem(Item item) {

	}

	public void attack() {

	}

	public void defend() {

	}

	public void loot() {

	}

	public void die() {

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
