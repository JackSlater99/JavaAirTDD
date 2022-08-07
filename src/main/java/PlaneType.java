public enum PlaneType {
    BOEING737(42000, 2),
    BOEING747(184000, 3),
    BOEING787(120000, 5);

    private int weight;
    private int capacity;

    PlaneType(int weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
