public class AnytownTest {
    public static void main(String[] args) {
        Building b1 = new Building();
        Building b2 = new Building("32 castle street", "Jim Jones");
        Building b3 = new Building("33 castle street", "Turkish barbers");

        b1.setAddress("34 castle street");
        b1.setOwner("mitch connor");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(b1.getAddress());
        System.out.println(b1.getOwner());

        Shop s1 = new Shop();
        Shop s2 = new Shop("38 castle street", "Fred Johns",
                3, 420 );
        System.out.println(s2);

        House h1 = new House();
        House h2 = new House("65 castle street", "David smith", 3, false);

        System.out.println(h2);

        s1.setAddress(" 1 low street");
        s1.setOwner("Homer Simpson");
        s1.setNumEmployees(5);
        s1.setAverageTurnover(230);
        System.out.println(s1);

        h1.setAddress("2 low street");
        h1.setOwner("Mick scott");
        h1.setHasGarage(true);
        h1.setNumBedrooms(5);

        System.out.println(h1);

        System.out.println(h1.getNumBedrooms());
        System.out.println(h1.gethasGarage());
        System.out.println(s1.getNumEmployees());
        System.out.println(s1.getAverageTurnover());

    }
}
