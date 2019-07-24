package CounterObject;

public enum Heroes {
	WARRIOR,
	PALADIN,
	WARLOCK,
	SHAMAN,
	MAGE,
	PRIESTER,
	DRUIDE,
	ROGUE,
	HUNTER;
	
	public static Heroes getHero(String heroInString) {
		Heroes heroInHeroes = null;
		for(Heroes hero: Heroes.values()) {
			if(heroInString.matches(hero.name())) {
				heroInHeroes = Heroes.valueOf(heroInString.toUpperCase());
			}
		}
		return heroInHeroes;
	}
}
