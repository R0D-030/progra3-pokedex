package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Chameleon", R.drawable.charmeleon, "Fire"));
        pokemons.add(new Pokemon(5, "Charizard", R.drawable.charizard, "Fire/Flying"));
        pokemons.add(new Pokemon(6, "Dragonite", R.drawable.dragonite, "Dragon/Flying"));
        pokemons.add(new Pokemon(7, "Eevee", R.drawable.eevee, "Normal"));
        pokemons.add(new Pokemon(8, "Leafon", R.drawable.leafon, "Grass"));
        pokemons.add(new Pokemon(9, "Volteon", R.drawable.volteon, "Electric"));
        pokemons.add(new Pokemon(10, "Sylveon", R.drawable.sylveon, "Fairy"));
        pokemons.add(new Pokemon(11, "Vaporeon", R.drawable.vaporeon, "Water"));
        pokemons.add(new Pokemon(12, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(13, "Wartortle", R.drawable.wartortlte, "Water"));
        pokemons.add(new Pokemon(14, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(15, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(16, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(17, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(18, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(19, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(20, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(21, "Zubat", R.drawable.zubat, "Poison"));
        pokemons.add(new Pokemon(22, "Chespin", R.drawable.chespin, "Grass"));
        pokemons.add(new Pokemon(23, "Quilladin", R.drawable.quilladin, "Grass"));
        pokemons.add(new Pokemon(24, "Chesnaught", R.drawable.chesnaught, "Grass/Fighting"));
        pokemons.add(new Pokemon(25, "Fennekin", R.drawable.fennekin, "Fire"));
        pokemons.add(new Pokemon(26, "Braixen", R.drawable.braixen, "Fire"));
        pokemons.add(new Pokemon(27, "Delphox", R.drawable.delphox, "Fire/Psychic"));
        pokemons.add(new Pokemon(28, "Froakie", R.drawable.froakie, "Water"));
        pokemons.add(new Pokemon(29, "Frogadier", R.drawable.frogadier, "Water"));
        pokemons.add(new Pokemon(30, "Greninja", R.drawable.greninja, "Water/Dark"));
        pokemons.add(new Pokemon(40, "Bunnelby", R.drawable.bunnelby, "Normal"));
        pokemons.add(new Pokemon(41, "Spritzee", R.drawable.spritzee, "Fairy"));
        pokemons.add(new Pokemon(42, "Aromatisse", R.drawable.aromatisse, "Fairy"));
        pokemons.add(new Pokemon(43, "Swirlix", R.drawable.swirlix, "Fairy"));
        pokemons.add(new Pokemon(44, "Slurpuff", R.drawable.slurpuff, "Fairy"));
        pokemons.add(new Pokemon(45, "Inkay", R.drawable.inkay, "Dark/Psychic"));
        pokemons.add(new Pokemon(46, "Malamar", R.drawable.malamar, "Dark/Psychic"));
        pokemons.add(new Pokemon(47, "Binacle", R.drawable.binacle, "Rock/Water"));
        pokemons.add(new Pokemon(48, "Barbacle", R.drawable.barbaracle, "Rock/Water"));
        pokemons.add(new Pokemon(49, "Sklerp", R.drawable.skrelp, "Poison/Water"));
        pokemons.add(new Pokemon(50, "Dragalge", R.drawable.dragalge, "Poison/Dragon"));
        pokemons.add(new Pokemon(51, "Clauncher", R.drawable.clauncher, "Water"));
        pokemons.add(new Pokemon(52, "Clawitzer", R.drawable.clawitzer, "Water"));
        pokemons.add(new Pokemon(53, "Helioptile", R.drawable.helioptile, "Electric/Normal"));
        pokemons.add(new Pokemon(54, "Heliolisk", R.drawable.heliolisk, "Electric/Normal"));
        pokemons.add(new Pokemon(55, "Tyrunt", R.drawable.tyrunt, "Rock/Dragon"));
        pokemons.add(new Pokemon(56, "Tyrantrum", R.drawable.tyrantrum, "Rock/Dragon"));
        pokemons.add(new Pokemon(57, "Amaura", R.drawable.amaura, "Rock/Ice"));
        pokemons.add(new Pokemon(58, "Aurorus", R.drawable.aurorus, "Rock/Ice"));
        pokemons.add(new Pokemon(59, "Sylveon", R.drawable.sylveon, "Fairy"));
        pokemons.add(new Pokemon(60, "Hawlucha", R.drawable.hawlucha, "Fighting/Flying"));
        pokemons.add(new Pokemon(61, "Dedenne", R.drawable.dedenne, "Electric/Fairy"));
        pokemons.add(new Pokemon(62, "Carbink", R.drawable.carbink, "Rock/Fairy"));
        pokemons.add(new Pokemon(63, "Goomy", R.drawable.goomy, "Dragon"));
        pokemons.add(new Pokemon(64, "Diggersby", R.drawable.diggersby, "Normal/Ground"));
        pokemons.add(new Pokemon(65, "Fletchling", R.drawable.fletchling, "Normal/Flying"));
        pokemons.add(new Pokemon(66, "Fletchinder", R.drawable.fletchinder, "Fire/Flying"));
        pokemons.add(new Pokemon(67, "Talonflame", R.drawable.talonflame, "Fire/Flying"));
        pokemons.add(new Pokemon(68, "Scatterbug", R.drawable.scatterbug, "Bug"));
        pokemons.add(new Pokemon(69, "Spewpa", R.drawable.spewpa, "Bug"));
        pokemons.add(new Pokemon(70, "Vivillion", R.drawable.vivillon, "Bug/Flying"));
        pokemons.add(new Pokemon(71, "Litleo", R.drawable.litleo, "Fire/Normal"));
        pokemons.add(new Pokemon(72, "Pyroar", R.drawable.pyroar, "Fire/Normal"));
        pokemons.add(new Pokemon(73, "Flabébé", R.drawable.flabebe, "Fairy"));
        pokemons.add(new Pokemon(74, "Floette", R.drawable.floette, "Fairy"));
        pokemons.add(new Pokemon(75, "Florges", R.drawable.florges, "Fairy"));
        pokemons.add(new Pokemon(76, "Skiddo", R.drawable.skiddo, "Grass"));
        pokemons.add(new Pokemon(77, "Gogoat", R.drawable.gogoat, "Grass"));
        pokemons.add(new Pokemon(78, "Pancham", R.drawable.pancham, "Fighting"));
        pokemons.add(new Pokemon(79, "Pangoro", R.drawable.pangoro, "Fighting/Dark"));
        pokemons.add(new Pokemon(80, "Furfrou", R.drawable.furfrou, "Normal"));
        pokemons.add(new Pokemon(81, "Espurr", R.drawable.espurr, "Psychic"));
        pokemons.add(new Pokemon(82, "Aegislash", R.drawable.aegislash, "Steel/Ghost"));
        pokemons.add(new Pokemon(83, "Spritzee", R.drawable.spritzee, "Fairy"));
        pokemons.add(new Pokemon(84, "Aromatisse", R.drawable.aromatisse, "Fairy"));
        pokemons.add(new Pokemon(85, "Sliggoo", R.drawable.sliggoo, "Dragon"));
        pokemons.add(new Pokemon(86, "Goodra", R.drawable.goodra, "Dragon"));
        pokemons.add(new Pokemon(87, "Klefki", R.drawable.klefki, "Steel/Fairy"));
        pokemons.add(new Pokemon(88, "Xerneas", R.drawable.xerneas, "Fairy"));
        pokemons.add(new Pokemon(89, "Yveltal", R.drawable.yveltal, "Dark/Flying"));
        pokemons.add(new Pokemon(90, "Zygarde", R.drawable.zygarde, "Dragon/Ground"));
        pokemons.add(new Pokemon(91, "Phantump", R.drawable.phantump, "Ghost/Grass"));
        pokemons.add(new Pokemon(92, "Trevenant", R.drawable.trevenant, "Ghost/Grass"));
        pokemons.add(new Pokemon(93, "Pumpkaboo", R.drawable.pumpkaboo, "Ghost/Grass"));
        pokemons.add(new Pokemon(94, "Gourgeist", R.drawable.gourgeist, "Ghost/Grass"));
        pokemons.add(new Pokemon(95, "Bergmite", R.drawable.bergmite, "Ice"));
        pokemons.add(new Pokemon(96, "Avalugg", R.drawable.avalugg, "Ice"));
        pokemons.add(new Pokemon(97, "Noibat", R.drawable.noibat, "Flying/Dragon"));
        pokemons.add(new Pokemon(98, "Noivern", R.drawable.noivern, "Flying/Dragon"));
        pokemons.add(new Pokemon(99, "Diancie", R.drawable.diancie, "Rock/Fairy"));
        pokemons.add(new Pokemon(100, "Hoopa", R.drawable.hoopa, "Psychic/Ghost"));
        pokemons.add(new Pokemon(101, "Volcanion", R.drawable.volcanion, "Fire/Water"));
        pokemons.add(new Pokemon(102,"Popplio",R.drawable.popplio,"Water"));
        pokemons.add(new Pokemon(103,"Hydreigon",R.drawable.hydreigon,"Dragon/Dark"));
        pokemons.add(new Pokemon(104,"Bayleef",R.drawable.bayleef,"Grass"));
        pokemons.add(new Pokemon(105,"Sobble",R.drawable.sobble,"Water"));
        pokemons.add(new Pokemon(106,"Impidimp",R.drawable.impidimp,"Dark/Fairy"));
        pokemons.add(new Pokemon(107, "Mudkip", R.drawable.mudkip, "Water"));
        pokemons.add(new Pokemon(108, "Mega Swampert", R.drawable.mega_swampert, "Water/Ground"));
        pokemons.add(new Pokemon(109, "Delcatty", R.drawable.delcatty, "Normal"));
        pokemons.add(new Pokemon(110, "Vespiquen", R.drawable.vespiquen, "Bug/Flying"));
        pokemons.add(new Pokemon(111, "Volcarona", R.drawable.volcarona, "Bug/Fire"));
        pokemons.add(new Pokemon(112, "Froslass", R.drawable.froslass, "Ice/Ghost"));
        pokemons.add(new Pokemon(113, "Pachirisu", R.drawable.pachirisu, "Electric"));
        pokemons.add(new Pokemon(114, "Yveltal", R.drawable.yveltal, "Dark/Flying"));
        return pokemons;
    }
}
