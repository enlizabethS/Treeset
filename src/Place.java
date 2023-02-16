public class Place {
    int capacity;
    String address;

    public Place(int capacity, String address) {
        this.capacity = capacity;
        this.address = address;
    }

    @Override
    public String toString() {
        return  capacity +
                ", " + address;
    }
}
