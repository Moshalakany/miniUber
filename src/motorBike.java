public class motorBike extends Rider{
    public motorBike(String paletNumber, String color, String manfuctureCompany, String ownerName) {
        super(paletNumber, color, manfuctureCompany, ownerName);
    }
    @Override
    public double TripCost(double distance) {
        return 1.5*distance;
    }
}
