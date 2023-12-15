package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private String owner;
    private String target;
    private List<String> cocktails;
    
    public Order() {
        this.owner = null;
        this.target = null;
        this.cocktails = new ArrayList<>();
    }

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getTarget() {
        return this.target;
    }

    public List<String> getCocktails() {
        return this.cocktails;
    }

    public void addCocktail(int nbCocktails) {
        for(int i = 0; i < nbCocktails; i++) {
            this.cocktails.add("cocktail");
        }
    }

}
