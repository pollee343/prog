package enumerate;

public enum Mood {
    HAPPINESS("счастье"),
    PLEASURE("удовольсвтие"),
    DISGUSTING("противно"),
    JOY("радость"),
    NO_EMOTIONS("");

    private final String tittle;

    Mood(String tittle){
        this.tittle = tittle;
    }

    public String getTittle(){
        return tittle;
    }

}
