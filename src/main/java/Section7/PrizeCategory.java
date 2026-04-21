package Section7;

public class PrizeCategory {

    private String name;
    private int ticketsRequired;
    private int count;

    public PrizeCategory(String name, int ticketsRequired, int count) {
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.count = count;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getTicketsRequired() {
        return ticketsRequired;
    }

    public int getCount() {
        return count;
    }

    // Setter
    public void setCount(int count) {
        this.count = count;
    }
}
