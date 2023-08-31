public class normal extends Rider{
    public normal(String paletNumber, String color, String manfuctureCompany, String ownerName) {
        super(paletNumber, color, manfuctureCompany, ownerName);
    }

    @Override
    public double TripCost(double distance) {
        return 1.5*distance;
    }
}
