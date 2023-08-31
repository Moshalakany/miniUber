public class premium extends Rider{
    public premium(String paletNumber, String color, String manfuctureCompany, String ownerName) {
        super(paletNumber, color, manfuctureCompany, ownerName);
    }

    @Override
    public double TripCost(double distance) {
        return 4*distance;
    }
}
