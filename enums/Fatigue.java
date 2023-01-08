package enums;

public enum Fatigue {
    TIRED ("устал");
    private String title;

    Fatigue(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
