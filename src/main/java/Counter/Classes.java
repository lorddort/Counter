package main.java.Counter;

public enum Classes {
	WARRIOR,
	PALADIN,
	WARLOCK,
	SHAMAN,
	MAGE,
	PRIESTER,
	DRUIDE,
	ROGUE,
	HUNTER;
	
	/**
	 * Get hero form Enum
	 * @param heroInString
	 * @return
	 */
	/*public static Heroes getHero(String heroInString) {
		Heroes heroInHeroes = null;
		for(Heroes hero: Heroes.values()) {
			if(heroInString.matches(hero.name())) {
				heroInHeroes = Heroes.valueOf(heroInString.toUpperCase());
			}
		}
		return heroInHeroes;
	}*/
}
