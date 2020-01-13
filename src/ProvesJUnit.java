import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ProvesJUnit {

	@Test
	void testQueComprovaQueElsAtributsDelHeroNoSiguinMesGransOMesPetitsQueElsMinimsIMaxims() {
//		Instanciem un Hero
		Hero hero = new Hero("Hero");
		assertTrue(hero.getAgility() > 2 & hero.getAgility() < 11);
		assertTrue(hero.getHp() > 7 & hero.getHp() < 21);
		assertTrue(hero.getInfluence() > 2 & hero.getInfluence() < 14);
		assertTrue(hero.getLore() > 2 & hero.getLore() < 14);
		assertTrue(hero.getObservation() > 2 & hero.getObservation() < 14);
		assertEquals("Hero", hero.getName());
	}

	@Test
	void testQueComprovaQueElHeroiAtacaIElMonstrePerdVida() {
		Hero hero1 = new Hero("Hero1");
		Mob mob1 = new Mob("Mob1", 5);
		int vidaMonstre = mob1.getHp();
		hero1.attack(mob1);
		assertTrue(mob1.getHp() <= vidaMonstre);
	}
	
	@Test
	void testQueComprovaQueElMonstreAtacaIElHeroPerdVida() {
		Hero hero = new Hero("Hero1");
		Mob mob = new Mob("Mob1", 5);
		int vidaHero = hero.getHp();
		mob.attack(hero);
		assertTrue(hero.getHp() <= vidaHero);
	}
}