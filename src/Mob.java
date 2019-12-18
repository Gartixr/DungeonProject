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
	
	public void defend(int damage) {
		//Restem la vida del mob 
		int dmg;
		dmg = damage - (int) (Math.random() * this.defense);
		
		if(dmg > 0) {
			if(this.hp < dmg) {
				System.out.println("Haz vençut al monstre");
				//die();
			}else {
				System.out.println("vida total mob: " + this.hp);
				this.hp -= dmg;
				System.out.println("El heroi ha fet " + dmg+ " mal");
				System.out.println("El monstre li queda " + this.hp);
			}
		}else {
			System.out.println("vida total mob: " + this.hp);
			System.out.println("Has fallat el cop");
			
		}
	
	}
	
	public void die() {
		
	}

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
