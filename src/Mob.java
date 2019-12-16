public class Mob {
	private int hp;
	private String name;
	private int strength;
	private int defense;
	private int fear;
	private int opt = 0;
	
	public Mob(String name, int optStats) {
		if(optStats >= 0) {
			this.opt = optStats;
		}
		this.name = name;
		this.hp = (int) (Math.random() * (10 + opt) + 6);
		this.strength = (int) (Math.random() * (6 + opt) + 3);
		this.defense = (int) (Math.random() * (6 + opt) + 3);
		this.fear = (int) (Math.random() * (3 + opt) + 1);
	}

	public void attack() {
		
	}
	
	public void die() {
		
	}

	
	//Getters & setters
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getFear() {
		return fear;
	}

	public void setFear(int fear) {
		this.fear = fear;
	}
}
