public class Pokemon {
    public static void main(String[] args) throws Exception {
        
        Moves wish = new Moves("Wish", 55);
        Moves foulPlay = new Moves("foulPlay", 95);
        Moves yawn = new Moves("Yawn", 0);
        Moves protect = new Moves("Protect", 0);
        Moves ivyCudgel = new Moves("Ivy Cudgel", 0);
        Moves knockOff = new Moves("KnockOff", 0);
        Moves playRough = new Moves("Play Rough", 0);
        Moves uTurn = new Moves("u-turn", 0);
        Moves blizzard = new Moves("Blizzard", 0);
        Moves calmMind = new Moves("Calm Mind", 0);
        Moves bodySlam = new Moves("Body Slam", 0);
        Moves dazzlingGleam = new Moves("Dazzling Gleam", 0);

        Pokedex umbreon = new Pokedex("Umbreon", 95, 65, 110, 60, 130, wish.getMoves(), foulPlay.getMoves(), yawn.getMoves(), protect.getMoves(), 64);
        Pokedex ogerpon = new Pokedex("Ponyo", 80, 120, 60, 96, 84, ivyCudgel.getMoves(), knockOff.getMoves(), playRough.getMoves(), uTurn.getMoves(), 70);
        Pokedex jigglyPuff = new Pokedex("JigglyPuff", 115, 45, 45, 25, 20, blizzard.getMoves(), calmMind.getMoves(), bodySlam.getMoves(), dazzlingGleam.getMoves(), 0);

    }
}
