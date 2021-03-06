import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ProvesJUnit {

	//--------------------------------------CAJA NEGRA------------------------------------------------
	
	@Test
	void testQueComprovaQueElsAtributsDelHeroNoSiguinMesGransOMesPetitsQueElsMinimsIMaxims() {
		Hero hero = new Hero("Hero");
		assertTrue(hero.getAgility() > 2 & hero.getAgility() < 11);
		assertTrue(hero.getHp() > 7 & hero.getHp() < 21);
		assertTrue(hero.getInfluence() > 2 & hero.getInfluence() < 14);
		assertTrue(hero.getLore() > 2 & hero.getLore() < 14);
		assertTrue(hero.getObservation() > 2 & hero.getObservation() < 14);
		assertEquals("Hero", hero.getName());
	}
	
	@Test
	void testQueComprovaQueElsAtributsDelMobNoSiguinMesGransOMesPetitsQueElsMinimsIMaxims() {
		Mob mob = new Mob("Mob" , 0);
		assertTrue(mob.getHp() >= 8 & mob.getHp() <= 15+8);
		assertTrue(mob.getDefense() >= 3 & mob.getDefense() <= 8+3);
		assertTrue(mob.getFear() >= 1 & mob.getFear() <= 3+1);
		assertTrue(mob.getStrength() >= 3 & mob.getStrength() <= 10+32);
		assertEquals("Mob", mob.getName());
	}

	
	@Test
	void testQueComprovaQueElMobEsDefenIMor() {
		Mob mob = new Mob("Mob", 5);
		
		mob.setDefense(0);
		mob.setHp(5);
		mob.defend(10);
		assertEquals(true, mob.die());
	}
	
	@Test
	void testQueComprovaQueElMobEsDefenIPerdVida() {
		Mob mob = new Mob("Mob", 5);
		
		mob.setDefense(0);
		mob.setHp(5);
		int vida = mob.getHp();
		mob.defend(1);
		assertTrue(mob.getHp() < vida);

	}
	
	//-------------------------------------------CAJA BLANCA-----------------------------------------------------------

	@Test
	void testQueComprovaQueElHeroiAtacaIElMonstrePerdVida() {
		Hero hero = new Hero("Hero");
		Mob mob = new Mob("Mob", 5);
		int vidaMonstre = mob.getHp();
		hero.attack(mob);
		assertTrue(mob.getHp() <= vidaMonstre);
	}
	
	@Test
	void testQueComprovaQueElMonstreAtacaIElHeroPerdVida() {
		Hero hero = new Hero("Hero");
		Mob mob = new Mob("Mob", 5);
		int vidaHero = hero.getHp();
		mob.attack(hero);
		assertTrue(hero.getHp() <= vidaHero);
	}
	
	@Test
	void testQueComprovaQueElHeroMuerQuanLaSevVidaArribaA0() {
		Hero hero = new Hero("Hero");
		Mob mob = new Mob("Mob", 5);
		mob.setStrength(100);
		hero.setAgility(0);
		hero.setHp(10);
		mob.attack(hero);
		assertTrue(hero.die());
		assertEquals(0, hero.getHp());
	}
	
	@Test
	void testQueComprovaQueElMonstreMorQuanLaSevaVidaArribaA0() {
		Hero hero = new Hero("Hero");
		Mob mob = new Mob("Mob", 5);
		hero.setStrength(100);
		mob.setDefense(0);
		mob.setHp(10);
		hero.attack(mob);
		assertTrue(mob.die());
		assertEquals(0, mob.getHp());
	}
	
	@Test
	void testQueComprovaElsGettersYSettersDelHero() {
		Hero hero = new Hero("Hero");
		
		hero.setAgility(1);
		assertEquals(hero.getAgility(), 1);
		hero.setHp(1);
		assertEquals(hero.getHp(), 1);
		hero.setInfluence(1);
		assertEquals(hero.getInfluence(), 1);
		hero.setLore(1);
		assertEquals(hero.getLore(), 1);
		hero.setName("Hero");
		assertEquals(hero.getName(), "Hero");
		hero.setObservation(1);
		assertEquals(hero.getObservation(), 1);
		hero.setRole("Test");
		assertEquals(hero.getRole(), "Test");
		hero.setSp(1);
		assertEquals(hero.getSp(), 1);
		hero.setStrength(1);
		assertEquals(hero.getStrength(), 1);
		hero.setWill(1);
		assertEquals(hero.getWill(), 1);
	}
	
	@Test
	void testQueComprovaElsGettersYSettersDelMob() {
		Mob mob = new Mob("Mob", 5);
		
		mob.setHp(1);
		assertEquals(mob.getHp(), 1);
		mob.setDefense(1);
		assertEquals(mob.getDefense(), 1);
		mob.setFear(1);
		assertEquals(mob.getFear(), 1);
		mob.setName("mob");
		assertEquals(mob.getName(), "mob");
		mob.setStrength(1);
		assertEquals(mob.getStrength(), 1);
		
	}
	
	@Test
	void testQueComprovaQueElHeroiEsDefenIMor() {
		Hero hero = new Hero("Hero");
		
		hero.setAgility(0);
		hero.setHp(5);
		hero.defend(10);

	}
	
	@Test
	void testQueComprovaQueElHeroiEsDefenIPerdVida() {
		Hero hero = new Hero("Hero");
		
		hero.setAgility(0);
		hero.setHp(10);
		hero.defend(5);

	}
	
	
	@Test
	void testQueComprovaQueElHeroHaLotejatUnItem() {
		Hero hero = new Hero("Hero");

		Armor armor = new Armor("test", "test2");
		Potion potion = new Potion(0);
		Item item = hero.loot();
		
		assertTrue(item == null || armor.getClass().equals(item.getClass()) || potion.getClass().equals(item.getClass()));
	}
}
