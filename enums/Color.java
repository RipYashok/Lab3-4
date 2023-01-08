package enums;

public enum Color {
    VIOLET ("фиолетовый"),
    BLUE ("синий"),
    YELLOW ("желтый"),
    GREEN ("зеленый"),
    GRAY_BROWN_CRIMSON ("серо-буромалиновый");

    private String title;

    Color(String title){
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
