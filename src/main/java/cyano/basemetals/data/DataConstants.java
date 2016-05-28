package cyano.basemetals.data;

public abstract class DataConstants {

	public static final String defaultOreSpawnJSON = "{"
+ "\n	\"dimensions\":["
+ "\n		{"
+ "\n			\"dimension\":\"+\","
+ "\n			\"__comment\":\""
+ "dimension 0 for overworld, -1 for the nether, 1 for the end, other numbers "
+ "for dimensions added by other mods, and + for any dimension not already "
+ "described by this file.\","
+ "\n			\"ores\":["
+ "\n				{"
+ "\n					\"__comment\":\"These settings are roughly equivalent to the "
+ "parameters of the CUSTOM world json: blockID = the unlocalized name of a "
+ "block in the format 'ModID:blockName',blockMeta = the meta data value for "
+ "the block (optional),size = number of blocks to spawn per ore deposit, "
+ "variation = vary the size of deposits by +/- this amount, frequency = number "
+ "of deposits per chunk (can be less than 1, e.g. 0.5 for 1 deposit every 2 "
+ "chunks), minHeight = minimum spawn height, maxHeight = maximum spawn height, "
+ "biomes = array of biomes to spawn this ore in (if empty or absent, the ore "
+ "will spawn in all biomes). Note that the size values in the Minecraft CUSTOM "
+ "world json do not represent the actual number of blocks spawned, where-as the "
+ "size value here does represent actual number of blocks. \","
+ "\n					\"blockID\":\"basemetals:copper_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":10,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":96"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:silver_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":4,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":32"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:tin_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":10,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":128"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:lead_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":5,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":64"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:zinc_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":5,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":96"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:mercury_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":3,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":32"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:nickel_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":1,"
+ "\n					\"minHeight\":32,"
+ "\n					\"maxHeight\":96"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:platinum_ore\","
+ "\n					\"size\":1,"
+ "\n					\"variation\":0,"
+ "\n					\"frequency\":8,"
+ "\n					\"minHeight\":1,"
+ "\n					\"maxHeight\":32"
+ "\n				}"
+ "\n			]"
+ "\n		},"
+ "\n		{"
+ "\n			\"dimension\":-1,"
+ "\n			\"__comment\":\"the nether\","
+ "\n			\"ores\":["
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:coldiron_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":5,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":128"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:adamantine_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":2,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":128"
+ "\n				}"
+ "\n			]"
+ "\n		},"
+ "\n		{"
+ "\n			\"dimension\":1,"
+ "\n			\"__comment\":\"the end\","
+ "\n			\"ores\":["
+ "\n				{"
+ "\n					\"blockID\":\"basemetals:starsteel_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":5,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":255"
+ "\n				}"
+ "\n			]"
+ "\n		}"
+ "\n	]"
+ "\n}";

	public static final String defaultVanillaOreSpawnJSON = "{"
+ "\n	\"dimensions\":["
+ "\n		{"
+ "\n			\"dimension\":\"+\","
+ "\n			\"ores\":["
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:coal_ore\","
+ "\n					\"size\":25,"
+ "\n					\"variation\":12,"
+ "\n					\"frequency\":20,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":128,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:iron_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":20,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":64,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:gold_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":2,"
+ "\n					\"frequency\":2,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":32,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:diamond_ore\","
+ "\n					\"size\":6,"
+ "\n					\"variation\":3,"
+ "\n					\"frequency\":1,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":16,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:redstone_ore\","
+ "\n					\"size\":6,"
+ "\n					\"variation\":3,"
+ "\n					\"frequency\":8,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":16,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:lapis_ore\","
+ "\n					\"size\":5,"
+ "\n					\"variation\":2,"
+ "\n					\"frequency\":1,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":32,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:emerald_ore\","
+ "\n					\"size\":1,"
+ "\n					\"variation\":0,"
+ "\n					\"frequency\":8,"
+ "\n					\"minHeight\":4,"
+ "\n					\"maxHeight\":32,"
+ "\n					\"biomes\":["
+ "\n						\"Extreme Hills Edge\","
+ "\n						\"Extreme Hills\""
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:dirt\","
+ "\n					\"size\":112,"
+ "\n					\"variation\":50,"
+ "\n					\"frequency\":10,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":255,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:gravel\","
+ "\n					\"size\":112,"
+ "\n					\"variation\":50,"
+ "\n					\"frequency\":8,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":255,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"__comment\":\"granite\","
+ "\n					\"blockID\":\"minecraft:stone\","
+ "\n					\"blockMeta\":1,"
+ "\n					\"size\":112,"
+ "\n					\"variation\":50,"
+ "\n					\"frequency\":10,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":255,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"__comment\":\"diorite\","
+ "\n					\"blockID\":\"minecraft:stone\","
+ "\n					\"blockMeta\":3,"
+ "\n					\"size\":112,"
+ "\n					\"variation\":50,"
+ "\n					\"frequency\":10,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":255,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				},"
+ "\n				{"
+ "\n					\"__comment\":\"andesite\","
+ "\n					\"blockID\":\"minecraft:stone\","
+ "\n					\"blockMeta\":5,"
+ "\n					\"size\":112,"
+ "\n					\"variation\":50,"
+ "\n					\"frequency\":10,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":255,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				}"
+ "\n			]"
+ "\n		},"
+ "\n		{"
+ "\n			\"dimension\":-1,"
+ "\n			\"ores\":["
+ "\n				{"
+ "\n					\"blockID\":\"minecraft:quartz_ore\","
+ "\n					\"size\":15,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":7,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":128,"
+ "\n					\"biomes\":["
+ "\n"
+ "\n					]"
+ "\n				}"
+ "\n			]"
+ "\n		}"
+ "\n	]"
+ "\n}";
}


