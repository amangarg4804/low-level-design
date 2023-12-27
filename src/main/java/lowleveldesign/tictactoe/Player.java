package lowleveldesign.tictactoe;

public class Player {
    private String name;
    private String character;

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public String getCharacter() {
        return character;
    }

    public Player setCharacter(String character) {
        this.character = character;
        return this;
    }
}

class PlayerBuilder{
    private String name;
    private String character;
    // TODO: complete
}
