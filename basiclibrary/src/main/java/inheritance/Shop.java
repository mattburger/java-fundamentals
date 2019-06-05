package inheritance;

public class Shop {
    private String name;
    private String description;
    private int dollarSigns;

    public Shop(String name, String description, int dollarSigns){
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getDollarSigns(){
        return this.dollarSigns;
    }

    public String toString(){
        return String.format("%s: %s", this.name, this.description);
    }
}
