package lowleveldesign.designproblems.tictactoe;

public class Player {
    private String name;
    private String character;

    public Player(PlayerBuilder playerBuilder) {
        this.name = playerBuilder.getName();
        this.character = playerBuilder.getCharacter();
    }

    public String getName() {
        return name;
    }

    public String getCharacter() {
        return character;
    }

}

class PlayerBuilder{
    private String name;
    private String character;
    public String getName() {
        return name;
    }

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getCharacter() {
        return character;
    }

    public PlayerBuilder setCharacter(String character) {
        this.character = character;
        return this;
    }
    public Player build() {
        return new Player(this);
    }
}
