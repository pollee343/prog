package enumerate;

public enum Places {
    TUB("лоханка"),
    WHEEL("колесо");

    private final String tittle;

    Places(String tittle){
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }
}
