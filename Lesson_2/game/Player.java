public class Player {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        int startRange = 0;
        int endRange = 100;
        this.number = startRange  + (int) (Math.random() * endRange);
    }
}