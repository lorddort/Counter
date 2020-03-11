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
	 * 
	 * @param classInString
	 * @return classInHero
	 */
	public static Classes getClass(String classInString) {
		Classes classInHeroes = null;
		for(Classes classes: Classes.values()) {
			if(classInString.toUpperCase().matches(classes.name())) {
				classInHeroes = Classes.valueOf(classInString.toUpperCase());
			}
		}
		return classInHeroes;
	}
}
