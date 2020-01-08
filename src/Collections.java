
public class Collections {
//	Classe que genera i gestiona grups d'objectes
	private Armor[] armors = new Armor[5];
	private Potion[] potions = new Potion[5];
	private Spell[] spell = new Spell[5];
	private Weapon[] weapons = new Weapon[5];

	public Collections() {
		initArmors();
		initPotions();
	}
	
	private void initArmors() {
		armors[0] = new Armor("Draps bruts", "Troços de tela que bé haurien pogut ser els ropatjes d'un granjer, "
				+ "però pel seu aspecte podrien haver estat qualsevol cosa...");
		armors[0].setBaseDafense(2);
		armors[0].setDropRate(70);

		armors[1] = new Armor("Vestidures de caçador",
				"Diverses peces de cuir utilitzades habitualment pels caçadors locals");
		armors[1].setBaseDafense(3);
		armors[1].setDropRate(65);
		
		armors[2] = new Armor("Armadura de cuir",
				"Armadura de pell curtida, molt flexible i resistent a talls i rascades");
		armors[2].setBaseDafense(4);
		armors[2].setDropRate(60);
		
		armors[3] = new Armor("Armadura de cuir reforçada",
				"Armadura de pell curtida reforçada amb pell endurida i rematxada "
				+ "amb pues de metall, flexible i resistent a talls i atacs d'objectes punxants");
		armors[3].setBaseDafense(5);
		armors[3].setDropRate(55);
		
		armors[4] = new Armor("Armadura de malla",
				"Armadura de malla i cuir, utilitzada habitualment pels soldats del Baró Dolent");
		armors[4].setBaseDafense(6);
		armors[4].setDropRate(50);
	}
	
	private void initPotions() {
		potions[0] = new Potion(0);
		potions[0].setDropRate(50);
		potions[1] = new Potion(1);
		potions[1].setDropRate(50);
		potions[2] = new Potion(0);
		potions[2].setDropRate(50);
		potions[3] = new Potion(1);
		potions[3].setDropRate(50);
		potions[4] = new Potion(0);
		potions[4].setDropRate(50);
	}

	protected Item getArmors(int num) {
		return armors[num];
	}

	protected void setArmors(Armor armor, int num) {
		this.armors[num] = armor;
	}

	protected Potion getPotions(int num) {
		return potions[num];
	}

	protected void setPotions(Potion potion, int num) {
		this.potions[num] = potion;
	}

	protected Spell[] getSpell() {
		return spell;
	}

	protected void setSpell(Spell[] spell) {
		this.spell = spell;
	}

	protected Weapon[] getWeapons() {
		return weapons;
	}

	protected void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}
	
	
}
