import java.time.LocalDate;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Wedding weddings = new Wedding(LocalDate.of(2023,2,20),"Piter","Marry",
                new Place(50,"; German, Munich, Englischer Garten"));
        Wedding weddings2 = new Wedding(LocalDate.of(2023,3,01),"Norten","Parmel",
                new Place(100,"; UK, England, Sheffield coffee"));
        Wedding weddings3 = new Wedding(LocalDate.of(2023,2,25),"Dominic","Anna",
                new Place(20,"; USA, New York, Riverpark coffee"));
        Wedding weddings4 = new Wedding(LocalDate.of(2023,5,20),"Samanta","Katrin",
                new Place(35,"; USA, Los Angeles, Beach"));
        Wedding weddings5 = new Wedding(LocalDate.of(2023,4,30),"Nico","Pol",
                new Place(15,"; Canada, Ottawa, La Bottega Nicastro"));
        System.out.println(weddings);

        TreeSet<Wedding> weddingTreeSet = new TreeSet<>();
        weddingTreeSet.add(weddings2);
        weddingTreeSet.add(weddings3);
        weddingTreeSet.add(weddings4);
        weddingTreeSet.add(weddings5);
        System.out.println(weddingTreeSet);

    }
}