/**
 * @author Jonathan
 * @author Conrad
 * @author Christian
 * @author Adrian
 */

public class Mob {
	private int hp;
	private String name;
	private int strength;
	private int defense;
	private int fear;
	private int opt = 0;
	
	/**
	 * Funció que genera atributs al mob
	 * 
	 * @param name nom del mob
	 * @param optStats número de estats opcional per si volem fer mes o menys fort al mob
	 */
	public Mob(String name, int optStats) {
		if(optStats >= 0) {
			this.opt = optStats;
		}
		this.name = name;
		this.hp = (int) (Math.random() * (15 + opt) + 8);
		this.strength = (int) (Math.random() * (10 + opt) + 3);
		this.defense = (int) (Math.random() * (8 + opt) + 3);
		this.fear = (int) (Math.random() * (3 + opt) + 1);
	}

	/** 
	 * Mètode que calcula el mal que fa el mob amb un número random tenint en compte la defensa del heroi
	 * 
	 * @param hero pasem el nostre heroi per poder fer el calcul del mal del mob
	 */
	public void attack(Hero hero) {
		hero.defend(((int) (Math.random() * getStrength() + 0)));
	}
	
	/**
	 * Mètode per calcular el mal que rep el mob al rebre un atac del heroi
	 * 
	 * 
	 * @param damage dany que fa el heroi
	 */
	public void defend(int damage) {
		//Restem la vida del mob 
		int dmg;
		dmg = damage - (int) (Math.random() * this.defense);
		
		if(dmg > 0) {
			if(this.hp < dmg) {
				System.out.println("Has vençut al monstre");
				this.hp = 0;
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
	/**
	 * Mètode per veure si el mob ha mort
	 * 
	 * @param mob Pasem el nostre mob 
	 * @return 0 si la vida del mob arriba o baixa de 0
	 */
	public boolean die(Mob mob) {
		return mob.hp <= 0;
	}
	
	/**
	 * funció que retorna la vida del mob
	 * @return hp Vida del mob
	 */
	public int getHp() {
		return hp;
	}
/**
 * funció que assigna la vida del mob
 * @param hp Assigna vida mob
 */
	public void setHp(int hp) {
		this.hp = hp;
	}
/**
 * Funció que retorna el nom del mob
 * @return name Nom de mob
 */
	public String getName() {
		return name;
	}
/**
 *Funció que assigna el nom al mob
 * @param name nom del mob
 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *Funció que retorna la força al mob
	 *@return strength força del mob
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 *Funció que assigna la força al mob
	 * @param strength força del mob
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	/**
	 *Funció que retorna la defenda del mob
	 * @return defense defensa del mob
	 */
	public int getDefense() {
		return defense;
	}
	
	/**
	 *Funció que assigna la defensa al mob
	 * @param defense defensa del mob
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	/**
	 *Funció que retorna la por que fa el mob
	 * @return fear Por que fa el mob
	 */
	public int getFear() {
		return fear;
	}
	
	/**
	 *Funció que assigna la por que fa el mob
	 * @param fear por que fa el mob
	 */
	public void setFear(int fear) {
		this.fear = fear;
	}
	
	
}
