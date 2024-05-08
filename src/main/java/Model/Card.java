package Model;

/**
 * Data Structure modeling a Yugioh Card.
 */
public class Card{

    public Card(String aName){
        setName(aName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
