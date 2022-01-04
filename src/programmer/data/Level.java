package programmer.data;

public enum Level {
    STANDARD("Standrad Level"),
    PREMIUM("Premium level"),
    VIP("Vip level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
