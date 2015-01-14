package model;

public class Currency {
    
    private final String code;
    private final String name;
    private final char simbol;

    public Currency(String code, String name, char simbol) {
        this.code = code;
        this.name = name;
        this.simbol = simbol;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public char getSimbol() {
        return simbol;
    }
    
    
}
