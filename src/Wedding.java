import java.time.LocalDate;

public class Wedding implements Comparable<Wedding> {
    LocalDate date;
   String groomsName;
   String bridesName;
     Place venue;

    public Wedding(LocalDate date, String groomsName, String bridesName, Place venue) {
        this.date = date;
        this.groomsName = groomsName;
        this.bridesName = bridesName;
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Date: " + date + " \n"+
                "  Grooms: " + groomsName + " \n"+
                "  Brides: " + bridesName + " \n"+
                "  Venue(capacity,address): " + venue + " \n";
    }

    @Override
    public int compareTo(Wedding o) {
        return this.date.compareTo(o.date);
    }
}
